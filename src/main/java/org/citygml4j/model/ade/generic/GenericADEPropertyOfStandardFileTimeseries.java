package org.citygml4j.model.ade.generic;

import org.citygml4j.model.dynamizer.ADEPropertyOfStandardFileTimeseries;
import org.w3c.dom.Element;

public class GenericADEPropertyOfStandardFileTimeseries extends ADEPropertyOfStandardFileTimeseries<Element> implements ADEGenericProperty {

    private GenericADEPropertyOfStandardFileTimeseries(Element value) {
        super(value);
    }

    public static GenericADEPropertyOfStandardFileTimeseries of(Element value) {
        return new GenericADEPropertyOfStandardFileTimeseries(value);
    }
}