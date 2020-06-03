package org.citygml4j.xml.adapter.tunnel;

import org.citygml4j.model.tunnel.TunnelInstallationProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TunnelInstallationPropertyAdapter extends AbstractFeaturePropertyAdapter<TunnelInstallationProperty> {

    @Override
    public TunnelInstallationProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TunnelInstallationProperty();
    }
}
