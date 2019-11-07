package org.citygml4j.model.core;

import org.xmlobjects.model.ChildList;

import java.util.List;

public abstract class AbstractVersion extends AbstractFeatureWithLifespan {
    private List<ADEPropertyOfAbstractVersion> adeProperties;

    public List<ADEPropertyOfAbstractVersion> getADEPropertiesOfAbstractVersion() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfAbstractVersion(List<ADEPropertyOfAbstractVersion> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }
}
