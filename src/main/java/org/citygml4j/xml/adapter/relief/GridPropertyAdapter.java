package org.citygml4j.xml.adapter.relief;

import org.citygml4j.model.relief.GridProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class GridPropertyAdapter extends AbstractFeaturePropertyAdapter<GridProperty> {

    @Override
    public GridProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new GridProperty();
    }
}
