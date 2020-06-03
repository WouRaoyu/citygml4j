package org.citygml4j.xml.adapter.transportation;

import org.citygml4j.model.transportation.ClearanceSpaceProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class ClearanceSpacePropertyAdapter extends AbstractFeaturePropertyAdapter<ClearanceSpaceProperty> {

    @Override
    public ClearanceSpaceProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new ClearanceSpaceProperty();
    }
}
