package org.citygml4j.xml.adapter.appearance;

import org.citygml4j.model.appearance.AbstractSurfaceDataProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractSurfaceDataPropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractSurfaceDataProperty> {

    @Override
    public AbstractSurfaceDataProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractSurfaceDataProperty();
    }
}
