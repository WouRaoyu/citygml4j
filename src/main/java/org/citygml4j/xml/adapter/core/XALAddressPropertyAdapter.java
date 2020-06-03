package org.citygml4j.xml.adapter.core;

import org.citygml4j.model.core.XALAddressProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class XALAddressPropertyAdapter extends AbstractInlinePropertyAdapter<XALAddressProperty> {

    @Override
    public XALAddressProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new XALAddressProperty();
    }
}
