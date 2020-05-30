package org.citygml4j.model.cityobjectgroup;

import org.citygml4j.model.common.GeometryInfo;
import org.citygml4j.model.core.AbstractCityObjectProperty;
import org.citygml4j.model.core.AbstractLogicalSpace;
import org.citygml4j.model.core.AbstractSpaceBoundary;
import org.citygml4j.model.core.ClosureSurface;
import org.citygml4j.model.core.StandardObjectClassifier;
import org.citygml4j.model.deprecated.cityobjectgroup.DeprecatedPropertiesOfCityObjectGroup;
import org.citygml4j.model.generics.GenericThematicSurface;
import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.gml.model.basictypes.Code;
import org.xmlobjects.gml.model.geometry.Envelope;
import org.xmlobjects.gml.util.EnvelopeOptions;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class CityObjectGroup extends AbstractLogicalSpace implements StandardObjectClassifier {
    private Code classifier;
    private List<Code> functions;
    private List<Code> usages;
    private List<RoleProperty> groupMembers;
    private AbstractCityObjectProperty groupParent;
    private List<ADEOfCityObjectGroup> adeOfCityObjectGroup;

    @Override
    public boolean isValidBoundary(AbstractSpaceBoundary boundary) {
        return boundary instanceof ClosureSurface
                || boundary instanceof GenericThematicSurface;
    }

    @Override
    public Code getClassifier() {
        return classifier;
    }

    @Override
    public void setClassifier(Code classifier) {
        this.classifier = asChild(classifier);
    }

    @Override
    public List<Code> getFunctions() {
        if (functions == null)
            functions = new ChildList<>(this);

        return functions;
    }

    @Override
    public void setFunctions(List<Code> functions) {
        this.functions = asChild(functions);
    }

    @Override
    public List<Code> getUsages() {
        if (usages == null)
            usages = new ChildList<>(this);

        return usages;
    }

    @Override
    public void setUsages(List<Code> usages) {
        this.usages = asChild(usages);
    }

    public List<RoleProperty> getGroupMembers() {
        if (groupMembers == null)
            groupMembers = new ChildList<>(this);

        return groupMembers;
    }

    public void setGroupMembers(List<RoleProperty> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public AbstractCityObjectProperty getGroupParent() {
        return groupParent;
    }

    public void setGroupParent(AbstractCityObjectProperty groupParent) {
        this.groupParent = asChild(groupParent);
    }

    @Override
    public DeprecatedPropertiesOfCityObjectGroup getDeprecatedProperties() {
        return (DeprecatedPropertiesOfCityObjectGroup) super.getDeprecatedProperties();
    }

    @Override
    protected DeprecatedPropertiesOfCityObjectGroup createDeprecatedProperties() {
        return new DeprecatedPropertiesOfCityObjectGroup();
    }

    public List<ADEOfCityObjectGroup> getADEOfCityObjectGroup() {
        if (adeOfCityObjectGroup == null)
            adeOfCityObjectGroup = new ChildList<>(this);

        return adeOfCityObjectGroup;
    }

    public void setADEOfCityObjectGroup(List<ADEOfCityObjectGroup> adeOfCityObjectGroup) {
        this.adeOfCityObjectGroup = asChild(adeOfCityObjectGroup);
    }

    @Override
    protected void updateEnvelope(Envelope envelope, EnvelopeOptions options) {
        super.updateEnvelope(envelope, options);

        if (groupMembers != null) {
            for (RoleProperty property : groupMembers) {
                if (property.getObject() != null
                        && property.getObject().getGroupMember() != null
                        && property.getObject().getGroupMember().getObject() != null)
                    envelope.include(property.getObject().getGroupMember().getObject().computeEnvelope(options));
            }
        }

        if (hasDeprecatedProperties()) {
            DeprecatedPropertiesOfCityObjectGroup properties = getDeprecatedProperties();

            if (properties.getGeometry() != null && properties.getGeometry().getObject() != null)
                envelope.include(properties.getGeometry().getObject().computeEnvelope());
        }

        if (adeOfCityObjectGroup != null) {
            for (ADEOfCityObjectGroup container : adeOfCityObjectGroup)
                updateEnvelope(container, envelope, options);
        }
    }

    @Override
    protected void updateGeometryInfo(GeometryInfo geometryInfo) {
        super.updateGeometryInfo(geometryInfo);

        if (hasDeprecatedProperties()) {
            DeprecatedPropertiesOfCityObjectGroup properties = getDeprecatedProperties();

            geometryInfo.addGeometry(properties.getGeometry());
        }

        if (adeOfCityObjectGroup != null) {
            for (ADEOfCityObjectGroup container : adeOfCityObjectGroup)
                updateGeometryInfo(container, geometryInfo);
        }
    }

    @Override
    public void accept(ObjectVisitor visitor) {
        visitor.visit(this);
    }

}
