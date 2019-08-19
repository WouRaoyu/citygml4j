package org.citygml4j.model.pointcloud;

import org.citygml4j.model.CityGMLObject;
import org.xmlobjects.gml.model.basictypes.Code;
import org.xmlobjects.gml.model.common.ChildList;
import org.xmlobjects.gml.model.feature.AbstractFeature;
import org.xmlobjects.gml.model.geometry.aggregates.MultiPointProperty;

import java.util.List;

public class PointCloud extends AbstractFeature implements CityGMLObject {
    private Code mimeType;
    private String pointFile;
    private String pointFileSrsName;
    private MultiPointProperty points;
    private List<ADEPropertyOfPointCloud> adeProperties;

    public PointCloud() {
    }

    public PointCloud(Code mimeType, String pointFile, String pointFileSrsName) {
        this.mimeType = mimeType;
        this.pointFile = pointFile;
        this.pointFileSrsName = pointFileSrsName;
    }

    public PointCloud(MultiPointProperty points) {
        setPoints(points);
    }

    public Code getMimeType() {
        return mimeType;
    }

    public void setMimeType(Code mimeType) {
        this.mimeType = mimeType;
    }

    public String getPointFile() {
        return pointFile;
    }

    public void setPointFile(String pointFile) {
        this.pointFile = pointFile;
    }

    public String getPointFileSrsName() {
        return pointFileSrsName;
    }

    public void setPointFileSrsName(String pointFileSrsName) {
        this.pointFileSrsName = pointFileSrsName;
    }

    public MultiPointProperty getPoints() {
        return points;
    }

    public void setPoints(MultiPointProperty points) {
        this.points = asChild(points);
    }

    public List<ADEPropertyOfPointCloud> getADEPropertiesOfPointCloud() {
        if (adeProperties == null)
            adeProperties = new ChildList<>(this);

        return adeProperties;
    }

    public void setADEPropertiesOfPointCloud(List<ADEPropertyOfPointCloud> adeProperties) {
        this.adeProperties = asChild(adeProperties);
    }
}
