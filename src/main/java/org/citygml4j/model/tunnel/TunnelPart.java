package org.citygml4j.model.tunnel;

import org.citygml4j.model.core.GeometryInfo;
import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.gml.model.geometry.Envelope;
import org.xmlobjects.gml.util.EnvelopeOptions;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class TunnelPart extends AbstractTunnel {
    private List<ADEPropertyOfTunnelPart<?>> adeProperties;

    public List<ADEPropertyOfTunnelPart<?>> getADEPropertiesOfTunnelPart() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfTunnelPart(List<ADEPropertyOfTunnelPart<?>> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }

    @Override
    protected void updateEnvelope(Envelope envelope, EnvelopeOptions options) {
        super.updateEnvelope(envelope, options);

        if (adeProperties != null) {
            for (ADEPropertyOfTunnelPart<?> property : adeProperties)
                updateEnvelope(property, envelope, options);
        }
    }

    @Override
    protected void updateGeometryInfo(GeometryInfo geometryInfo) {
        super.updateGeometryInfo(geometryInfo);

        if (adeProperties != null) {
            for (ADEPropertyOfTunnelPart<?> property : adeProperties)
                updateGeometryInfo(property, geometryInfo);
        }
    }

    @Override
    public void accept(ObjectVisitor visitor) {
        visitor.visit(this);
    }
}
