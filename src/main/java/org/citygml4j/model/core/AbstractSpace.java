package org.citygml4j.model.core;

import org.xmlobjects.gml.model.common.ChildList;
import org.xmlobjects.gml.model.geometry.aggregates.MultiCurveProperty;
import org.xmlobjects.gml.model.geometry.aggregates.MultiSurfaceProperty;
import org.xmlobjects.gml.model.geometry.primitives.PointProperty;
import org.xmlobjects.gml.model.geometry.primitives.SolidProperty;

import java.util.List;

public abstract class AbstractSpace<T extends AbstractThematicSurface> extends AbstractCityObject {
    private SpaceType spaceType;
    private List<QualifiedVolume> volumes;
    private List<QualifiedArea> areas;
    private PointProperty lod0Point;
    private MultiSurfaceProperty lod0MultiSurface;
    private SolidProperty lod1Solid;
    private SolidProperty lod2Solid;
    private MultiSurfaceProperty lod2MultiSurface;
    private MultiCurveProperty lod2MultiCurve;
    private SolidProperty lod3Solid;
    private MultiSurfaceProperty lod3MultiSurface;
    private MultiCurveProperty lod3MultiCurve;
    private List<T> boundaries;
    private List<ADEPropertyOfAbstractSpace> adeProperties;

    public SpaceType getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(SpaceType spaceType) {
        this.spaceType = spaceType;
    }

    public List<QualifiedVolume> getVolumes() {
        if (volumes == null)
            volumes = new ChildList<>(this);

        return volumes;
    }

    public void setVolumes(List<QualifiedVolume> volumes) {
        this.volumes = asChild(volumes);
    }

    public List<QualifiedArea> getAreas() {
        if (areas == null)
            areas = new ChildList<>(this);

        return areas;
    }

    public void setAreas(List<QualifiedArea> areas) {
        this.areas = areas;
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

    public List<T> getBoundaries() {
        if (boundaries == null)
            boundaries = new ChildList<>(this);

        return boundaries;
    }

    public void setBoundaries(List<T> boundaries) {
        this.boundaries = asChild(boundaries);
    }

    public List<ADEPropertyOfAbstractSpace> getADEPropertyOfAbstractSpace() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertyOfAbstractSpace(List<ADEPropertyOfAbstractSpace> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }
}
