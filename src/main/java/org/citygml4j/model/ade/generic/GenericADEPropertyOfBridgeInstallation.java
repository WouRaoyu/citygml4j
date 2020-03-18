package org.citygml4j.model.ade.generic;

import org.citygml4j.model.bridge.ADEPropertyOfBridgeInstallation;
import org.w3c.dom.Element;

public class GenericADEPropertyOfBridgeInstallation extends ADEPropertyOfBridgeInstallation<Element> implements ADEGenericProperty {

    private GenericADEPropertyOfBridgeInstallation(Element value) {
        super(value);
    }

    public static GenericADEPropertyOfBridgeInstallation of(Element value) {
        return new GenericADEPropertyOfBridgeInstallation(value);
    }
}