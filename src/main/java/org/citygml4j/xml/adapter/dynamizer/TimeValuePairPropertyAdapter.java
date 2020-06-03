package org.citygml4j.xml.adapter.dynamizer;

import org.citygml4j.model.dynamizer.TimeValuePairProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TimeValuePairPropertyAdapter extends AbstractInlinePropertyAdapter<TimeValuePairProperty> {

    @Override
    public TimeValuePairProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TimeValuePairProperty();
    }
}
