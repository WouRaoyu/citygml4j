package org.citygml4j.model.construction;

import org.citygml4j.model.common.GeometryInfo;
import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.gml.model.geometry.Envelope;
import org.xmlobjects.gml.util.EnvelopeOptions;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class FloorSurface extends AbstractConstructionSurface {
    private List<ADEOfFloorSurface> adeOfFloorSurface;

    public List<ADEOfFloorSurface> getADEOfFloorSurface() {
        if (adeOfFloorSurface == null)
            adeOfFloorSurface = new ChildList<>(this);

        return adeOfFloorSurface;
    }

    public void setADEOfFloorSurface(List<ADEOfFloorSurface> adeOfFloorSurface) {
        this.adeOfFloorSurface = asChild(adeOfFloorSurface);
    }

    @Override
    protected void updateEnvelope(Envelope envelope, EnvelopeOptions options) {
        super.updateEnvelope(envelope, options);

        if (adeOfFloorSurface != null) {
            for (ADEOfFloorSurface container : adeOfFloorSurface)
                updateEnvelope(container, envelope, options);
        }
    }

    @Override
    protected void updateGeometryInfo(GeometryInfo geometryInfo) {
        super.updateGeometryInfo(geometryInfo);

        if (adeOfFloorSurface != null) {
            for (ADEOfFloorSurface container : adeOfFloorSurface)
                updateGeometryInfo(container, geometryInfo);
        }
    }

    @Override
    public void accept(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
