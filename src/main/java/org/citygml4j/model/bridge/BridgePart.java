package org.citygml4j.model.bridge;

import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class BridgePart extends AbstractBridge {
    private List<ADEPropertyOfBridgePart<?>> adeProperties;

    public List<ADEPropertyOfBridgePart<?>> getADEPropertiesOfBridgePart() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfBridgePart(List<ADEPropertyOfBridgePart<?>> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }

    @Override
    public void accept(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
