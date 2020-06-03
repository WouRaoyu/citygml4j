package org.citygml4j.xml.adapter.bridge;

import org.citygml4j.model.bridge.BridgeFurnitureMember;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeatureMemberAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class BridgeFurnitureMemberAdapter extends AbstractFeatureMemberAdapter<BridgeFurnitureMember> {

    @Override
    public BridgeFurnitureMember createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BridgeFurnitureMember();
    }
}
