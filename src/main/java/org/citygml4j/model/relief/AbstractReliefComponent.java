package org.citygml4j.model.relief;

import org.citygml4j.model.core.AbstractSpaceBoundary;
import org.xmlobjects.model.ChildList;

import java.util.List;

public abstract class AbstractReliefComponent extends AbstractSpaceBoundary {
    private int lod;
    private ExtentProperty extent;
    private List<ADEPropertyOfAbstractReliefComponent<?>> adeProperties;

    public AbstractReliefComponent() {
    }

    public AbstractReliefComponent(int lod) {
        setLod(lod);
    }

    public int getLod() {
        return lod;
    }

    public void setLod(int lod) {
        if (lod >= 0)
            this.lod = lod;
    }

    public ExtentProperty getExtent() {
        return extent;
    }

    public void setExtent(ExtentProperty extent) {
        this.extent = asChild(extent);
    }

    public List<ADEPropertyOfAbstractReliefComponent<?>> getADEPropertiesOfAbstractReliefComponent() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfAbstractReliefComponent(List<ADEPropertyOfAbstractReliefComponent<?>> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }
}
