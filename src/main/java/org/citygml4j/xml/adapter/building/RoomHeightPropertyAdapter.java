package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.building.RoomHeightProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class RoomHeightPropertyAdapter extends AbstractInlinePropertyAdapter<RoomHeightProperty> {

    @Override
    public RoomHeightProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new RoomHeightProperty();
    }
}
