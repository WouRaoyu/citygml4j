package org.citygml4j.xml.adapter.building;

import org.citygml4j.model.building.BuildingConstructiveElementMember;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeatureMemberAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class BuildingConstructiveElementMemberAdapter extends AbstractFeatureMemberAdapter<BuildingConstructiveElementMember> {

    @Override
    public BuildingConstructiveElementMember createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new BuildingConstructiveElementMember();
    }
}
