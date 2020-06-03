package org.citygml4j.xml.adapter.tunnel;

import org.citygml4j.model.tunnel.TunnelConstructiveElementProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TunnelConstructiveElementPropertyAdapter extends AbstractFeaturePropertyAdapter<TunnelConstructiveElementProperty> {

    @Override
    public TunnelConstructiveElementProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TunnelConstructiveElementProperty();
    }
}
