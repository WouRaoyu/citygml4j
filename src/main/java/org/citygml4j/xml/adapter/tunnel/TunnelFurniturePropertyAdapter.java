package org.citygml4j.xml.adapter.tunnel;

import org.citygml4j.model.tunnel.TunnelFurnitureProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TunnelFurniturePropertyAdapter extends AbstractFeaturePropertyAdapter<TunnelFurnitureProperty> {

    @Override
    public TunnelFurnitureProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TunnelFurnitureProperty();
    }
}
