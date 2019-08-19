package org.citygml4j.model.core;

import org.citygml4j.model.CityGMLObject;
import org.citygml4j.model.appearance.AppearanceProperty;
import org.xmlobjects.gml.model.basictypes.Code;
import org.xmlobjects.gml.model.common.ChildList;
import org.xmlobjects.gml.model.feature.AbstractFeature;
import org.xmlobjects.gml.model.geometry.AbstractGeometry;
import org.xmlobjects.gml.model.geometry.GeometryProperty;
import org.xmlobjects.gml.model.geometry.primitives.PointProperty;

import java.util.List;

public class ImplicitGeometry extends AbstractFeature implements CityGMLObject {
    private TransformationMatrix4x4 transformationMatrix;
    private Code mimeType;
    private String libraryObject;
    private PointProperty referencePoint;
    private GeometryProperty<AbstractGeometry> relativeGMLGeometry;
    private List<AppearanceProperty> appearances;
    private List<ADEPropertyOfImplicitGeometry> adeProperties;

    public TransformationMatrix4x4 getTransformationMatrix() {
        return transformationMatrix;
    }

    public void setTransformationMatrix(TransformationMatrix4x4 transformationMatrix) {
        this.transformationMatrix = asChild(transformationMatrix);
    }

    public Code getMimeType() {
        return mimeType;
    }

    public void setMimeType(Code mimeType) {
        this.mimeType = asChild(mimeType);
    }

    public String getLibraryObject() {
        return libraryObject;
    }

    public void setLibraryObject(String libraryObject) {
        this.libraryObject = libraryObject;
    }

    public PointProperty getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(PointProperty referencePoint) {
        this.referencePoint = asChild(referencePoint);
    }

    public GeometryProperty<AbstractGeometry> getRelativeGMLGeometry() {
        return relativeGMLGeometry;
    }

    public void setRelativeGMLGeometry(GeometryProperty<AbstractGeometry> relativeGMLGeometry) {
        this.relativeGMLGeometry = asChild(relativeGMLGeometry);
    }

    public List<AppearanceProperty> getAppearances() {
        if (appearances == null)
            appearances = new ChildList<>(this);

        return appearances;
    }

    public void setAppearances(List<AppearanceProperty> appearances) {
        this.appearances = asChild(appearances);
    }

    public List<ADEPropertyOfImplicitGeometry> getADEPropertyOfImplicitGeometry() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertyOfImplicitGeometry(List<ADEPropertyOfImplicitGeometry> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }
}
