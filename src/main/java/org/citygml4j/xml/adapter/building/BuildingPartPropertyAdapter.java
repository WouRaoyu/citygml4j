package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.building.BuildingPartProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class BuildingPartPropertyAdapter extends AbstractFeaturePropertyAdapter<BuildingPartProperty> {

    @Override
    public BuildingPartProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BuildingPartProperty();
    }
}
