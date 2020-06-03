package org.citygml4j.xml.adapter.relief;

import org.citygml4j.model.relief.TinProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.geometry.AbstractGeometryPropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TinPropertyAdapter extends AbstractGeometryPropertyAdapter<TinProperty> {

    @Override
    public TinProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TinProperty();
    }
}
