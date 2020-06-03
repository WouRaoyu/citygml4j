package org.citygml4j.xml.adapter.construction;

import org.citygml4j.model.construction.AbstractConstructionProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractConstructionPropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractConstructionProperty> {

    @Override
    public AbstractConstructionProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractConstructionProperty();
    }
}
