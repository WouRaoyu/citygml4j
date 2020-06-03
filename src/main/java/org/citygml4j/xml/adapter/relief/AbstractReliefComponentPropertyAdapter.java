package org.citygml4j.xml.adapter.relief;

import org.citygml4j.model.relief.AbstractReliefComponentProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractReliefComponentPropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractReliefComponentProperty> {

    @Override
    public AbstractReliefComponentProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractReliefComponentProperty();
    }
}
