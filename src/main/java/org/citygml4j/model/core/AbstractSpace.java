package org.citygml4j.model.core;

import org.xmlobjects.gml.model.common.ChildList;
import org.xmlobjects.gml.model.geometry.aggregates.MultiCurveProperty;
import org.xmlobjects.gml.model.geometry.aggregates.MultiSurfaceProperty;
import org.xmlobjects.gml.model.geometry.primitives.PointProperty;
import org.xmlobjects.gml.model.geometry.primitives.SolidProperty;

import java.util.List;

public abstract class AbstractSpace extends AbstractCityObject {
    private SpaceType spaceType;
    private List<QualifiedVolumeProperty> volumes;
    private List<QualifiedAreaProperty> areas;
    private List<AbstractThematicSurfaceProperty> boundarySurfaces;
    private PointProperty lod0Point;
    private MultiSurfaceProperty lod0MultiSurface;
    private SolidProperty lod1Solid;
    private SolidProperty lod2Solid;
    private MultiSurfaceProperty lod2MultiSurface;
    private MultiCurveProperty lod2MultiCurve;
    private SolidProperty lod3Solid;
    private MultiSurfaceProperty lod3MultiSurface;
    private MultiCurveProperty lod3MultiCurve;
    private List<ADEPropertyOfAbstractSpace> adeProperties;

    public abstract boolean isValidBoundarySurface(AbstractThematicSurface boundarySurface);

    public SpaceType getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(SpaceType spaceType) {
        this.spaceType = spaceType;
    }

    public List<QualifiedVolumeProperty> getVolumes() {
        if (volumes == null)
            volumes = new ChildList<>(this);

        return volumes;
    }

    public void setVolumes(List<QualifiedVolumeProperty> volumes) {
        this.volumes = asChild(volumes);
    }

    public List<QualifiedAreaProperty> getAreas() {
        if (areas == null)
            areas = new ChildList<>(this);

        return areas;
    }

    public void setAreas(List<QualifiedAreaProperty> areas) {
        this.areas = areas;
    }

    public boolean isValidBoundarySurface(AbstractThematicSurfaceProperty property) {
        return property == null || property.getObject() == null || isValidBoundarySurface(property.getObject());
    }

    public List<AbstractThematicSurfaceProperty> getBoundarySurfaces() {
        if (boundarySurfaces == null)
            boundarySurfaces = new ChildList<>(this);

        return boundarySurfaces;
    }

    public void setBoundarySurfaces(List<AbstractThematicSurfaceProperty> boundarySurfaces) {
        this.boundarySurfaces = asChild(boundarySurfaces);
        if (boundarySurfaces != null)
            boundarySurfaces.removeIf(property -> !isValidBoundarySurface(property));
    }

    public void addBoundarySurface(AbstractThematicSurfaceProperty property) {
        if (isValidBoundarySurface(property))
            getBoundarySurfaces().add(property);
    }

    public PointProperty getLod0Point() {
        return lod0Point;
    }

    public void setLod0Point(PointProperty lod0Point) {
        this.lod0Point = asChild(lod0Point);
    }

    public MultiSurfaceProperty getLod0MultiSurface() {
        return lod0MultiSurface;
    }

    public void setLod0MultiSurface(MultiSurfaceProperty lod0MultiSurface) {
        this.lod0MultiSurface = asChild(lod0MultiSurface);
    }

    public SolidProperty getLod1Solid() {
        return lod1Solid;
    }

    public void setLod1Solid(SolidProperty lod1Solid) {
        this.lod1Solid = asChild(lod1Solid);
    }

    public SolidProperty getLod2Solid() {
        return lod2Solid;
    }

    public void setLod2Solid(SolidProperty lod2Solid) {
        this.lod2Solid = asChild(lod2Solid);
    }

    public MultiSurfaceProperty getLod2MultiSurface() {
        return lod2MultiSurface;
    }

    public void setLod2MultiSurface(MultiSurfaceProperty lod2MultiSurface) {
        this.lod2MultiSurface = asChild(lod2MultiSurface);
    }

    public MultiCurveProperty getLod2MultiCurve() {
        return lod2MultiCurve;
    }

    public void setLod2MultiCurve(MultiCurveProperty lod2MultiCurve) {
        this.lod2MultiCurve = asChild(lod2MultiCurve);
    }

    public SolidProperty getLod3Solid() {
        return lod3Solid;
    }

    public void setLod3Solid(SolidProperty lod3Solid) {
        this.lod3Solid = asChild(lod3Solid);
    }

    public MultiSurfaceProperty getLod3MultiSurface() {
        return lod3MultiSurface;
    }

    public void setLod3MultiSurface(MultiSurfaceProperty lod3MultiSurface) {
        this.lod3MultiSurface = asChild(lod3MultiSurface);
    }

    public MultiCurveProperty getLod3MultiCurve() {
        return lod3MultiCurve;
    }

    public void setLod3MultiCurve(MultiCurveProperty lod3MultiCurve) {
        this.lod3MultiCurve = asChild(lod3MultiCurve);
    }

    public List<ADEPropertyOfAbstractSpace> getADEPropertiesOfAbstractSpace() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfAbstractSpace(List<ADEPropertyOfAbstractSpace> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }

    public SolidProperty getSolid(int lod) {
        switch (lod) {
            case 1:
                return getLod1Solid();
            case 2:
                return getLod2Solid();
            case 3:
                return getLod3Solid();
            default:
                return null;
        }
    }

    public boolean setSolid(int lod, SolidProperty property) {
        switch (lod) {
            case 1:
                setLod1Solid(property);
                return true;
            case 2:
                setLod2Solid(property);
                return true;
            case 3:
                setLod3Solid(property);
                return true;
            default:
                return false;
        }
    }

    public MultiSurfaceProperty getMultiSurface(int lod) {
        switch (lod) {
            case 0:
                return getLod0MultiSurface();
            case 2:
                return getLod2MultiSurface();
            case 3:
                return getLod3MultiSurface();
            default:
                return null;
        }
    }

    public boolean setMultiSurface(int lod, MultiSurfaceProperty property) {
        switch (lod) {
            case 0:
                setLod0MultiSurface(property);
                return true;
            case 2:
                setLod2MultiSurface(property);
                return true;
            case 3:
                setLod3MultiSurface(property);
                return true;
            default:
                return false;
        }
    }

    public MultiCurveProperty getMultiCurve(int lod) {
        switch (lod) {
            case 2:
                return getLod2MultiCurve();
            case 3:
                return getLod3MultiCurve();
            default:
                return null;
        }
    }

    public boolean setMultiCurve(int lod, MultiCurveProperty property) {
        switch (lod) {
            case 2:
                setLod2MultiCurve(property);
                return true;
            case 3:
                setLod3MultiCurve(property);
                return true;
            default:
                return false;
        }
    }
}