package org.citygml4j.xml.adapter.core;

import org.citygml4j.model.ade.generic.GenericADEPropertyOfCityModel;
import org.citygml4j.model.core.ADEPropertyOfCityModel;
import org.citygml4j.model.core.AbstractAppearanceProperty;
import org.citygml4j.model.core.AbstractCityObjectProperty;
import org.citygml4j.model.core.AbstractVersionProperty;
import org.citygml4j.model.core.AbstractVersionTransitionProperty;
import org.citygml4j.model.core.CityModel;
import org.citygml4j.util.CityGMLConstants;
import org.citygml4j.xml.adapter.CityGMLBuilderHelper;
import org.citygml4j.xml.adapter.CityGMLSerializerHelper;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;
import org.xmlobjects.gml.model.feature.FeatureProperty;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "CityModel", namespaceURI = CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE)
public class CityModelAdapter extends AbstractFeatureWithLifespanAdapter<CityModel> {
    private final QName substitutionGroup = new QName(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "AbstractGenericApplicationPropertyOfCityModel");

    @Override
    public CityModel createObject(QName name) throws ObjectBuildException {
        return new CityModel();
    }

    @Override
    public void buildChildObject(CityModel object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "cityObjectMember":
                    object.getCityObjectMembers().add(reader.getObjectUsingBuilder(AbstractCityObjectPropertyAdapter.class));
                    return;
                case "appearanceMember":
                    object.getAppearanceMembers().add(reader.getObjectUsingBuilder(AbstractAppearancePropertyAdapter.class));
                    return;
                case "versionMember":
                    object.getVersionMembers().add(reader.getObjectUsingBuilder(AbstractVersionPropertyAdapter.class));
                    return;
                case "versionTransitionMember":
                    object.getVersionTransitionMembers().add(reader.getObjectUsingBuilder(AbstractVersionTransitionPropertyAdapter.class));
                    return;
                case "featureMember":
                    object.getFeatureMembers().add(reader.getObjectUsingBuilder(FeaturePropertyAdapter.class));
                    return;
                case "engineeringCRS":
                    object.setEngineeringCRS(reader.getObjectUsingBuilder(EngineeringCRSPropertyAdapter.class));
                    return;
            }
        } else if (CityGMLBuilderHelper.isADENamespace(name.getNamespaceURI())) {
            buildADEProperty(object, name, reader);
            return;
        }

        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void buildADEProperty(CityModel object, QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (!CityGMLBuilderHelper.addADEProperty(name, ADEPropertyOfCityModel.class, object.getADEPropertiesOfCityModel(),
                GenericADEPropertyOfCityModel::of, reader, substitutionGroup))
            super.buildADEProperty(object, name, reader);
    }

    @Override
    public Element createElement(CityModel object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "CityModel");
    }

    @Override
    public void writeChildElements(CityModel object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getEngineeringCRS() != null)
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "engineeringCRS"), object.getEngineeringCRS(), EngineeringCRSPropertyAdapter.class, namespaces);

        for (AbstractCityObjectProperty property : object.getCityObjectMembers())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "cityObjectMember"), property, AbstractCityObjectPropertyAdapter.class, namespaces);

        for (AbstractAppearanceProperty property : object.getAppearanceMembers())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "appearanceMember"), property, AbstractAppearancePropertyAdapter.class, namespaces);

        for (AbstractVersionProperty property : object.getVersionMembers())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "versionMember"), property, AbstractVersionPropertyAdapter.class, namespaces);

        for (AbstractVersionTransitionProperty property : object.getVersionTransitionMembers())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "versionTransitionMember"), property, AbstractVersionTransitionPropertyAdapter.class, namespaces);

        for (FeatureProperty<?> property : object.getFeatureMembers())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_CORE_NAMESPACE, "featureMember"), property, FeaturePropertyAdapter.class, namespaces);

        for (ADEPropertyOfCityModel<?> property : object.getADEPropertiesOfCityModel())
            CityGMLSerializerHelper.serializeADEProperty(property, namespaces, writer);
    }
}