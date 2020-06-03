package org.citygml4j.xml.adapter.construction;

import org.citygml4j.model.construction.AbstractFurnitureProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class AbstractFurniturePropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractFurnitureProperty> {

    @Override
    public AbstractFurnitureProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new AbstractFurnitureProperty();
    }
}
