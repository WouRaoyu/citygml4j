package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.ade.generic.GenericADEOfAbstractBuilding;
import org.citygml4j.model.building.ADEOfAbstractBuilding;
import org.citygml4j.model.building.AbstractBuilding;
import org.citygml4j.model.building.AbstractBuildingSubdivisionMember;
import org.citygml4j.model.building.BuildingConstructiveElementMember;
import org.citygml4j.model.building.BuildingFurnitureMember;
import org.citygml4j.model.building.BuildingInstallationMember;
import org.citygml4j.model.building.BuildingRoomMember;
import org.citygml4j.model.core.AddressProperty;
import org.citygml4j.util.CityGMLConstants;
import org.citygml4j.xml.adapter.CityGMLBuilderHelper;
import org.citygml4j.xml.adapter.CityGMLSerializerHelper;
import org.citygml4j.xml.adapter.ade.ADEBuilderHelper;
import org.citygml4j.xml.adapter.ade.ADESerializerHelper;
import org.citygml4j.xml.adapter.construction.AbstractConstructionAdapter;
import org.citygml4j.xml.adapter.core.AddressPropertyAdapter;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.basictypes.CodeAdapter;
import org.xmlobjects.gml.adapter.basictypes.MeasureOrNilReasonListAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;
import org.xmlobjects.xml.TextContent;

import javax.xml.namespace.QName;

public abstract class AbstractBuildingAdapter<T extends AbstractBuilding> extends AbstractConstructionAdapter<T> {

    @Override
    public void buildChildObject(T object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE.equals(name.getNamespaceURI())) {
            if (CityGMLBuilderHelper.buildStandardObjectClassifier(object, name.getLocalPart(), reader))
                return;

            switch (name.getLocalPart()) {
                case "roofType":
                    object.setRoofType(reader.getObjectUsingBuilder(CodeAdapter.class));
                    return;
                case "storeysAboveGround":
                    reader.getTextContent().ifInteger(object::setStoreysAboveGround);
                    return;
                case "storeysBelowGround":
                    reader.getTextContent().ifInteger(object::setStoreysBelowGround);
                    return;
                case "storeyHeightsAboveGround":
                    object.setStoreyHeightsAboveGround(reader.getObjectUsingBuilder(MeasureOrNilReasonListAdapter.class));
                    return;
                case "storeyHeightsBelowGround":
                    object.setStoreyHeightsBelowGround(reader.getObjectUsingBuilder(MeasureOrNilReasonListAdapter.class));
                    return;
                case "buildingConstructiveElement":
                    object.getBuildingConstructiveElements().add(reader.getObjectUsingBuilder(BuildingConstructiveElementMemberAdapter.class));
                    return;
                case "buildingInstallation":
                    object.getBuildingInstallations().add(reader.getObjectUsingBuilder(BuildingInstallationMemberAdapter.class));
                    return;
                case "buildingRoom":
                    object.getBuildingRooms().add(reader.getObjectUsingBuilder(BuildingRoomMemberAdapter.class));
                    return;
                case "buildingFurniture":
                    object.getBuildingFurniture().add(reader.getObjectUsingBuilder(BuildingFurnitureMemberAdapter.class));
                    return;
                case "buildingSubdivision":
                    object.getBuildingSubdivisions().add(reader.getObjectUsingBuilder(AbstractBuildingSubdivisionMemberAdapter.class));
                    return;
                case "address":
                    object.getAddresses().add(reader.getObjectUsingBuilder(AddressPropertyAdapter.class));
                    return;
                case "adeOfAbstractBuilding":
                    ADEBuilderHelper.addADEContainer(ADEOfAbstractBuilding.class, object.getADEOfAbstractBuilding(), GenericADEOfAbstractBuilding::new, reader);
                    return;
            }
        }

        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(T object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        CityGMLSerializerHelper.serializeStandardObjectClassifier(object, CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, namespaces, writer);

        if (object.getRoofType() != null)
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "roofType"), object.getRoofType(), CodeAdapter.class, namespaces);

        if (object.getStoreysAboveGround() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "storeysAboveGround").addTextContent(TextContent.ofInteger(object.getStoreysAboveGround())));

        if (object.getStoreysBelowGround() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "storeysBelowGround").addTextContent(TextContent.ofInteger(object.getStoreysBelowGround())));

        if (object.getStoreyHeightsAboveGround() != null)
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "storeyHeightsAboveGround"), object.getStoreyHeightsAboveGround(), MeasureOrNilReasonListAdapter.class, namespaces);

        if (object.getStoreyHeightsBelowGround() != null)
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "storeyHeightsBelowGround"), object.getStoreyHeightsBelowGround(), MeasureOrNilReasonListAdapter.class, namespaces);

        for (BuildingConstructiveElementMember member : object.getBuildingConstructiveElements())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "buildingConstructiveElement"), member, BuildingConstructiveElementMemberAdapter.class, namespaces);

        for (BuildingInstallationMember member : object.getBuildingInstallations())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "buildingInstallation"), member, BuildingInstallationMemberAdapter.class, namespaces);

        for (BuildingRoomMember member : object.getBuildingRooms())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "buildingRoom"), member, BuildingRoomMemberAdapter.class, namespaces);

        for (BuildingFurnitureMember member : object.getBuildingFurniture())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "buildingFurniture"), member, BuildingFurnitureMemberAdapter.class, namespaces);

        for (AbstractBuildingSubdivisionMember member : object.getBuildingSubdivisions())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "buildingSubdivision"), member, AbstractBuildingSubdivisionMemberAdapter.class, namespaces);

        for (AddressProperty property : object.getAddresses())
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "address"), property, AddressPropertyAdapter.class, namespaces);

        for (ADEOfAbstractBuilding container : object.getADEOfAbstractBuilding())
            ADESerializerHelper.writeADEContainer(Element.of(CityGMLConstants.CITYGML_3_0_BUILDING_NAMESPACE, "adeOfAbstractBuilding"), container, namespaces, writer);
    }
}
