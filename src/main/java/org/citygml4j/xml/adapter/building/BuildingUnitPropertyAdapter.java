package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.building.BuildingUnitProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class BuildingUnitPropertyAdapter extends AbstractFeaturePropertyAdapter<BuildingUnitProperty> {

    @Override
    public BuildingUnitProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BuildingUnitProperty();
    }
}
