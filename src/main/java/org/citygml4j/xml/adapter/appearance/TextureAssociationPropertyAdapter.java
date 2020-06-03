package org.citygml4j.xml.adapter.appearance;

import org.citygml4j.model.appearance.TextureAssociationProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TextureAssociationPropertyAdapter extends AbstractPropertyAdapter<TextureAssociationProperty> {

    @Override
    public TextureAssociationProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TextureAssociationProperty();
    }
}
