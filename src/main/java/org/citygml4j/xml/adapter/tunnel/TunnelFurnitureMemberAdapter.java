package org.citygml4j.xml.adapter.tunnel;

import org.citygml4j.model.tunnel.TunnelFurnitureMember;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeatureMemberAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TunnelFurnitureMemberAdapter extends AbstractFeatureMemberAdapter<TunnelFurnitureMember> {

    @Override
    public TunnelFurnitureMember createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TunnelFurnitureMember();
    }
}
