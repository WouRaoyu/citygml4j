package org.citygml4j.model.construction;

import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class WindowSurface extends AbstractFillingSurface {
    private List<ADEPropertyOfWindowSurface<?>> adeProperties;

    public List<ADEPropertyOfWindowSurface<?>> getADEPropertiesOfWindowSurface() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfWindowSurface(List<ADEPropertyOfWindowSurface<?>> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }

    @Override
    public void accept(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
