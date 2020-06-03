package org.citygml4j.xml.adapter.construction;

import org.citygml4j.model.construction.ConstructionEventProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class ConstructionEventPropertyAdapter extends AbstractInlinePropertyAdapter<ConstructionEventProperty> {

    @Override
    public ConstructionEventProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new ConstructionEventProperty();
    }
}
