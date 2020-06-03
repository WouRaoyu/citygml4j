package org.citygml4j.xml.adapter.bridge;

import org.citygml4j.model.bridge.BridgeInstallationProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class BridgeInstallationPropertyAdapter extends AbstractFeaturePropertyAdapter<BridgeInstallationProperty> {

    @Override
    public BridgeInstallationProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BridgeInstallationProperty();
    }
}
