package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.building.StoreyProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class StoreyPropertyAdapter extends AbstractFeaturePropertyAdapter<StoreyProperty> {

    @Override
    public StoreyProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new StoreyProperty();
    }
}
