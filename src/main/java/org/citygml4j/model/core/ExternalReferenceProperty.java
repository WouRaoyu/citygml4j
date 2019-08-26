package org.citygml4j.model.core;

import org.citygml4j.model.CityGMLObject;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class ExternalReferenceProperty extends AbstractInlineProperty<ExternalReference> implements CityGMLObject {

    public ExternalReferenceProperty() {
    }

    public ExternalReferenceProperty(ExternalReference object) {
        super(object);
    }

    @Override
    public Class<ExternalReference> getTargetType() {
        return ExternalReference.class;
    }
}