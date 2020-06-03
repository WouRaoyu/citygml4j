package org.citygml4j.xml.adapter.dynamizer;

import org.citygml4j.model.dynamizer.TimeseriesComponentProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TimeseriesComponentPropertyAdapter extends AbstractInlinePropertyAdapter<TimeseriesComponentProperty> {

    @Override
    public TimeseriesComponentProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TimeseriesComponentProperty();
    }
}
