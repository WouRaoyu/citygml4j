package org.citygml4j.xml.adapter.dynamizer;

import org.citygml4j.model.dynamizer.AbstractTimeseriesProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractTimeseriesPropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractTimeseriesProperty> {

    @Override
    public AbstractTimeseriesProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractTimeseriesProperty();
    }
}
