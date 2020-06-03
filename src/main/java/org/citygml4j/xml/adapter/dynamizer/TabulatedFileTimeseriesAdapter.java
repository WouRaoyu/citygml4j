package org.citygml4j.xml.adapter.dynamizer;

import org.citygml4j.model.ade.generic.GenericADEOfTabulatedFileTimeseries;
import org.citygml4j.model.dynamizer.ADEOfTabulatedFileTimeseries;
import org.citygml4j.model.dynamizer.TabulatedFileTimeseries;
import org.citygml4j.model.dynamizer.TimeseriesValue;
import org.citygml4j.util.CityGMLConstants;
import org.citygml4j.xml.adapter.ade.ADEBuilderHelper;
import org.citygml4j.xml.adapter.ade.ADESerializerHelper;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.basictypes.CodeAdapter;
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

@XMLElement(name = "TabulatedFileTimeseries", namespaceURI = CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE)
public class TabulatedFileTimeseriesAdapter extends AbstractAtomicTimeseriesAdapter<TabulatedFileTimeseries> {

    @Override
    public TabulatedFileTimeseries createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TabulatedFileTimeseries();
    }

    @Override
    public void buildChildObject(TabulatedFileTimeseries object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "fileLocation":
                    reader.getTextContent().ifPresent(object::setFileLocation);
                    return;
                case "fileType":
                    object.setFileType(reader.getObjectUsingBuilder(CodeAdapter.class));
                    return;
                case "mimeType":
                    object.setMimeType(reader.getObjectUsingBuilder(CodeAdapter.class));
                    return;
                case "valueType":
                    reader.getTextContent().ifPresent(v -> object.setValueType(TimeseriesValue.fromValue(v)));
                    return;
                case "numberOfHeaderLines":
                    reader.getTextContent().ifInteger(object::setNumberOfHeaderLines);
                    return;
                case "fieldSeparator":
                    reader.getTextContent().ifPresent(object::setFieldSeparator);
                    return;
                case "decimalSymbol":
                    reader.getTextContent().ifPresent(object::setDecimalSymbol);
                    return;
                case "idColumnNo":
                    reader.getTextContent().ifInteger(object::setIdColumnNo);
                    return;
                case "idColumnName":
                    reader.getTextContent().ifPresent(object::setIdColumnName);
                    return;
                case "idValue":
                    reader.getTextContent().ifPresent(object::setIdValue);
                    return;
                case "timeColumnNo":
                    reader.getTextContent().ifInteger(object::setTimeColumnNo);
                    return;
                case "timeColumnName":
                    reader.getTextContent().ifPresent(object::setTimeColumnName);
                    return;
                case "valueColumnNo":
                    reader.getTextContent().ifInteger(object::setValueColumnNo);
                    return;
                case "valueColumnName":
                    reader.getTextContent().ifPresent(object::setValueColumnName);
                    return;
                case "adeOfTabulatedFileTimeseries":
                    ADEBuilderHelper.addADEContainer(ADEOfTabulatedFileTimeseries.class, object.getADEOfTabulatedFileTimeseries(), GenericADEOfTabulatedFileTimeseries::of, reader);
                    return;
            }
        }

        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(TabulatedFileTimeseries object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "TabulatedFileTimeseries");
    }

    @Override
    public void writeChildElements(TabulatedFileTimeseries object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getFileLocation() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "fileLocation").addTextContent(object.getFileLocation()));

        if (object.getFileType() != null)
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "fileType"), object.getFileType(), CodeAdapter.class, namespaces);

        if (object.getMimeType() != null)
            writer.writeElementUsingSerializer(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "mimeType"), object.getMimeType(), CodeAdapter.class, namespaces);

        if (object.getValueType() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "valueType").addTextContent(object.getValueType().toValue()));

        if (object.getNumberOfHeaderLines() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "numberOfHeaderLines").addTextContent(TextContent.ofInteger(object.getNumberOfHeaderLines())));

        if (object.getFieldSeparator() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "fieldSeparator").addTextContent(object.getFieldSeparator()));

        if (object.getDecimalSymbol() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "decimalSymbol").addTextContent(object.getDecimalSymbol()));

        if (object.getIdColumnNo() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "idColumnNo").addTextContent(TextContent.ofInteger(object.getIdColumnNo())));

        if (object.getIdColumnName() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "idColumnName").addTextContent(object.getIdColumnName()));

        if (object.getIdValue() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "idValue").addTextContent(object.getIdValue()));

        if (object.getTimeColumnNo() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "timeColumnNo").addTextContent(TextContent.ofInteger(object.getTimeColumnNo())));

        if (object.getTimeColumnName() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "timeColumnName").addTextContent(object.getTimeColumnName()));

        if (object.getValueColumnNo() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "valueColumnNo").addTextContent(TextContent.ofInteger(object.getValueColumnNo())));

        if (object.getValueColumnName() != null)
            writer.writeElement(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "valueColumnName").addTextContent(object.getValueColumnName()));

        for (ADEOfTabulatedFileTimeseries container : object.getADEOfTabulatedFileTimeseries())
            ADESerializerHelper.writeADEContainer(Element.of(CityGMLConstants.CITYGML_3_0_DYNAMIZER_NAMESPACE, "adeOfTabulatedFileTimeseries"), container, namespaces, writer);
    }
}
