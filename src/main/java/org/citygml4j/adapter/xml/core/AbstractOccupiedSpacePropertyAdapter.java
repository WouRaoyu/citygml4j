package org.citygml4j.adapter.xml.core;

import org.citygml4j.model.core.AbstractOccupiedSpaceProperty;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class AbstractOccupiedSpacePropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractOccupiedSpaceProperty> {

    @Override
    public AbstractOccupiedSpaceProperty createObject(QName name) {
        return new AbstractOccupiedSpaceProperty();
    }
}