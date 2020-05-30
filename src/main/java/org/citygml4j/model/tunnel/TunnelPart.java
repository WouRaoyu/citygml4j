package org.citygml4j.model.tunnel;

import org.citygml4j.model.common.GeometryInfo;
import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.gml.model.geometry.Envelope;
import org.xmlobjects.gml.util.EnvelopeOptions;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class TunnelPart extends AbstractTunnel {
    private List<ADEOfTunnelPart> adeOfTunnelPart;

    public List<ADEOfTunnelPart> getADEOfTunnelPart() {
        if (adeOfTunnelPart == null)
            adeOfTunnelPart = new ChildList<>(this);

        return adeOfTunnelPart;
    }

    public void setADEOfTunnelPart(List<ADEOfTunnelPart> adeOfTunnelPart) {
        this.adeOfTunnelPart = asChild(adeOfTunnelPart);
    }

    @Override
    protected void updateEnvelope(Envelope envelope, EnvelopeOptions options) {
        super.updateEnvelope(envelope, options);

        if (adeOfTunnelPart != null) {
            for (ADEOfTunnelPart container : adeOfTunnelPart)
                updateEnvelope(container, envelope, options);
        }
    }

    @Override
    protected void updateGeometryInfo(GeometryInfo geometryInfo) {
        super.updateGeometryInfo(geometryInfo);

        if (adeOfTunnelPart != null) {
            for (ADEOfTunnelPart container : adeOfTunnelPart)
                updateGeometryInfo(container, geometryInfo);
        }
    }

    @Override
    public void accept(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
