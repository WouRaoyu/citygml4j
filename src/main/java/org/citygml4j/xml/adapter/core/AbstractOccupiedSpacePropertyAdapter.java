package org.citygml4j.xml.adapter.core;

import org.citygml4j.model.core.AbstractOccupiedSpaceProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractOccupiedSpacePropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractOccupiedSpaceProperty> {

    @Override
    public AbstractOccupiedSpaceProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractOccupiedSpaceProperty();
    }
}
