package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.building.BuildingRoomProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class BuildingRoomPropertyAdapter extends AbstractFeaturePropertyAdapter<BuildingRoomProperty> {

    @Override
    public BuildingRoomProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BuildingRoomProperty();
    }
}
