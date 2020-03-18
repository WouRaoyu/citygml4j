package org.citygml4j.model.ade.generic;

import org.citygml4j.model.core.ADEPropertyOfAbstractSpace;
import org.w3c.dom.Element;

public class GenericADEPropertyOfAbstractSpace extends ADEPropertyOfAbstractSpace<Element> implements ADEGenericProperty {

    private GenericADEPropertyOfAbstractSpace(Element value) {
        super(value);
    }

    public static GenericADEPropertyOfAbstractSpace of(Element value) {
        return new GenericADEPropertyOfAbstractSpace(value);
    }
}