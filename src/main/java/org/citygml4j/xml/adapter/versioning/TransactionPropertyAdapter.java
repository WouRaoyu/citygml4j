package org.citygml4j.xml.adapter.versioning;

import org.citygml4j.model.versioning.TransactionProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;

import javax.xml.namespace.QName;

public class TransactionPropertyAdapter extends AbstractInlinePropertyAdapter<TransactionProperty> {

    @Override
    public TransactionProperty createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new TransactionProperty();
    }
}
