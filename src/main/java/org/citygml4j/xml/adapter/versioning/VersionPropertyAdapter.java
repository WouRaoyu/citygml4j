package org.citygml4j.xml.adapter.versioning;

import org.citygml4j.model.versioning.VersionProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class VersionPropertyAdapter extends AbstractFeaturePropertyAdapter<VersionProperty> {

    @Override
    public VersionProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new VersionProperty();
    }
}
