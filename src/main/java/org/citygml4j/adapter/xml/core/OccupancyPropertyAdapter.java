package org.citygml4j.adapter.xml.core;

import org.citygml4j.model.core.OccupancyProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OccupancyPropertyAdapter extends AbstractInlinePropertyAdapter<OccupancyProperty> {

    @Override
    public OccupancyProperty createObject(QName name) throws ObjectBuildException {
        return new OccupancyProperty();
    }
}