package org.citygml4j.xml.adapter.relief;

import org.citygml4j.model.ade.generic.GenericADEOfBreaklineRelief;
import org.citygml4j.model.relief.ADEOfBreaklineRelief;
import org.citygml4j.model.relief.BreaklineRelief;
import org.citygml4j.util.CityGMLConstants;
import org.citygml4j.xml.adapter.CityGMLBuilderHelper;
import org.citygml4j.xml.adapter.CityGMLSerializerHelper;
import org.citygml4j.xml.adapter.ade.ADEBuilderHelper;
import org.citygml4j.xml.adapter.ade.ADESerializerHelper;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.geometry.aggregates.MultiCurvePropertyAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElements({
        @XMLElement(name = "BreaklineRelief", namespaceURI = CityGMLConstants.CITYGML_3_0_RELIEF_NAMESPACE),
        @XMLElement(name = "BreaklineRelief", namespaceURI = CityGMLConstants.CITYGML_2_0_RELIEF_NAMESPACE),
        @XMLElement(name = "BreaklineRelief", namespaceURI = CityGMLConstants.CITYGML_1_0_RELIEF_NAMESPACE)
})
public class BreaklineReliefAdapter extends AbstractReliefComponentAdapter<BreaklineRelief> {
    private final QName[] substitutionGroups = new QName[]{
            new QName(CityGMLConstants.CITYGML_2_0_RELIEF_NAMESPACE, "_GenericApplicationPropertyOfBreaklineRelief"),
            new QName(CityGMLConstants.CITYGML_1_0_RELIEF_NAMESPACE, "_GenericApplicationPropertyOfBreaklineRelief")
    };

    @Override
    public BreaklineRelief createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BreaklineRelief();
    }

    @Override
    public void buildChildObject(BreaklineRelief object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (CityGMLBuilderHelper.isReliefNamespace(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "ridgeOrValleyLines":
                    object.setRidgeOrValleyLines(reader.getObjectUsingBuilder(MultiCurvePropertyAdapter.class));
                    return;
                case "breaklines":
                    object.setBreaklines(reader.getObjectUsingBuilder(MultiCurvePropertyAdapter.class));
                    return;
                case "adeOfBreaklineRelief":
                    ADEBuilderHelper.addADEContainer(ADEOfBreaklineRelief.class, object.getADEOfBreaklineRelief(), GenericADEOfBreaklineRelief::of, reader);
                    return;
            }
        } else if (CityGMLBuilderHelper.isADENamespace(name.getNamespaceURI())) {
            buildADEProperty(object, name, reader);
            return;
        }

        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void buildADEProperty(BreaklineRelief object, QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (!ADEBuilderHelper.addADEContainer(name, ADEOfBreaklineRelief.class, object.getADEOfBreaklineRelief(),
                GenericADEOfBreaklineRelief::of, reader, substitutionGroups))
            super.buildADEProperty(object, name, reader);
    }

    @Override
    public Element createElement(BreaklineRelief object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(CityGMLSerializerHelper.getReliefNamespace(namespaces), "BreaklineRelief");
    }

    @Override
    public void writeChildElements(BreaklineRelief object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);
        String reliefNamespace = CityGMLSerializerHelper.getReliefNamespace(namespaces);
        boolean isCityGML3 = CityGMLConstants.CITYGML_3_0_RELIEF_NAMESPACE.equals(reliefNamespace);

        if (object.getRidgeOrValleyLines() != null)
            writer.writeElementUsingSerializer(Element.of(reliefNamespace, "ridgeOrValleyLines"), object.getRidgeOrValleyLines(), MultiCurvePropertyAdapter.class, namespaces);

        if (object.getBreaklines() != null)
            writer.writeElementUsingSerializer(Element.of(reliefNamespace, "breaklines"), object.getBreaklines(), MultiCurvePropertyAdapter.class, namespaces);

        for (ADEOfBreaklineRelief container : object.getADEOfBreaklineRelief())
            ADESerializerHelper.writeADEContainer(isCityGML3 ? Element.of(reliefNamespace, "adeOfBreaklineRelief") : null, container, namespaces, writer);
    }
}
