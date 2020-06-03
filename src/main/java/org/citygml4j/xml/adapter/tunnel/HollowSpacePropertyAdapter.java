package org.citygml4j.xml.adapter.tunnel;

import org.citygml4j.model.tunnel.HollowSpaceProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class HollowSpacePropertyAdapter extends AbstractFeaturePropertyAdapter<HollowSpaceProperty> {

    @Override
    public HollowSpaceProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new HollowSpaceProperty();
    }
}
