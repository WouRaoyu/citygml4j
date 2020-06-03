package org.citygml4j.xml.adapter.core;

import org.citygml4j.model.core.AbstractFeatureProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractFeaturePropertyAdapter extends org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter<AbstractFeatureProperty> {

    @Override
    public AbstractFeatureProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractFeatureProperty();
    }
}
