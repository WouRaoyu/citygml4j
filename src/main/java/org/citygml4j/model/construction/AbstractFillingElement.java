package org.citygml4j.model.construction;

import org.citygml4j.model.core.AbstractOccupiedSpace;
import org.xmlobjects.gml.model.common.ChildList;

import java.util.List;

public abstract class AbstractFillingElement extends AbstractOccupiedSpace {
    private List<ADEPropertyOfAbstractFillingElement> adeProperties;

    public List<ADEPropertyOfAbstractFillingElement> getADEPropertiesOfAbstractFillingElement() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfAbstractFillingElement(List<ADEPropertyOfAbstractFillingElement> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }
}