package org.citygml4j.adapter.xml.core;

import org.citygml4j.model.core.AbstractPointCloudProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class AbstractPointCloudPropertyAdapter extends AbstractFeaturePropertyAdapter<AbstractPointCloudProperty> {

    @Override
    public AbstractPointCloudProperty createObject(QName name) throws ObjectBuildException {
        return new AbstractPointCloudProperty();
    }
}