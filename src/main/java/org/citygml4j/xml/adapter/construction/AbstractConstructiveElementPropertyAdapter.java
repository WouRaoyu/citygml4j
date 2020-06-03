package org.citygml4j.xml.adapter.construction;

import org.citygml4j.model.construction.AbstractConstructiveElementProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractConstructiveElementPropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractConstructiveElementProperty> {

    @Override
    public AbstractConstructiveElementProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractConstructiveElementProperty();
    }
}
