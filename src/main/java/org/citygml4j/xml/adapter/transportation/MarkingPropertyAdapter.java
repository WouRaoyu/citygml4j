package org.citygml4j.xml.adapter.transportation;

import org.citygml4j.model.transportation.MarkingProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class MarkingPropertyAdapter extends AbstractFeaturePropertyAdapter<MarkingProperty> {

    @Override
    public MarkingProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new MarkingProperty();
    }
}
