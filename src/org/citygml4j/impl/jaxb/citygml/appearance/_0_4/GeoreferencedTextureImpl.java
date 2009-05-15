package org.citygml4j.impl.jaxb.citygml.appearance._0_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.impl.jaxb.citygml.core._0_4.TransformationMatrix2x2Impl;
import org.citygml4j.impl.jaxb.gml._3_1_1.PointPropertyImpl;
import org.citygml4j.jaxb.citygml._0_4.GeoreferencedTextureType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.appearance.GeoreferencedTexture;
import org.citygml4j.model.citygml.core.TransformationMatrix2x2;
import org.citygml4j.model.gml.PointProperty;

public class GeoreferencedTextureImpl extends AbstractTextureImpl implements GeoreferencedTexture {
	private GeoreferencedTextureType georeferencedTextureType;

	public GeoreferencedTextureImpl() {
		this(new GeoreferencedTextureType());
	}

	public GeoreferencedTextureImpl(GeoreferencedTextureType georeferencedTextureType) {
		super(georeferencedTextureType);
		this.georeferencedTextureType = georeferencedTextureType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.GEOREFERENCEDTEXTURE;
	}

	@Override
	public GeoreferencedTextureType getJAXBObject() {
		return georeferencedTextureType;
	}

	public void addTarget(String target) {
		georeferencedTextureType.getTarget().add(target);
	}

	public TransformationMatrix2x2 getOrientation() {
		if (georeferencedTextureType.isSetOrientation()) {
			List<Double> vals = georeferencedTextureType.getOrientation();
			if (vals.size() >= 4)
				return new TransformationMatrix2x2Impl(vals.subList(0, 4));
		}

		return null;
	}

	public Boolean getPreferWorldFile() {
		return georeferencedTextureType.isPreferWorldFile();
	}

	public PointProperty getReferencePoint() {
		if (georeferencedTextureType.isSetReferencePoint())
			return new PointPropertyImpl(georeferencedTextureType.getReferencePoint());

		return null;
	}

	public List<String> getTarget() {
		return georeferencedTextureType.getTarget();
	}

	public void setOrientation(TransformationMatrix2x2 orientation) {
		georeferencedTextureType.unsetOrientation();
		georeferencedTextureType.getOrientation().addAll(orientation.getMatrix().toRowPackedList());
	}

	public void setPreferWorldFile(Boolean preferWorldFile) {
		georeferencedTextureType.setPreferWorldFile(preferWorldFile);
	}

	public void setReferencePoint(PointProperty referencePoint) {
		georeferencedTextureType.setReferencePoint(((PointPropertyImpl)referencePoint).getJAXBObject());
	}

	public void setTarget(List<String> target) {
		georeferencedTextureType.unsetTarget();
		georeferencedTextureType.getTarget().addAll(target);
	}

	public void addGenericApplicationPropertyOfGeoreferencedTexture(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			georeferencedTextureType.get_GenericApplicationPropertyOfGeoreferencedTexture().add(jaxbElem);
	}

	public List<ADEComponent> getGenericApplicationPropertyOfGeoreferencedTexture() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();

		for (JAXBElement<?> elem : georeferencedTextureType.get_GenericApplicationPropertyOfGeoreferencedTexture()) {
			if (elem.getValue() != null) {
				ADEComponent ade = ModelMapper.ADE.toADEComponent(elem.getValue(), elem.getName());
				if (ade != null)
					adeList.add(ade);
			}
		}

		return adeList;
	}

	public void setGenericApplicationPropertyOfGeoreferencedTexture(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			georeferencedTextureType.unset_GenericApplicationPropertyOfGeoreferencedTexture();
			georeferencedTextureType.get_GenericApplicationPropertyOfGeoreferencedTexture().addAll(elemList);
		}
	}

	public boolean isSetGenericApplicationPropertyOfGeoreferencedTexture() {
		return georeferencedTextureType.isSet_GenericApplicationPropertyOfGeoreferencedTexture();
	}

	public boolean isSetOrientation() {
		return georeferencedTextureType.isSetOrientation();
	}

	public boolean isSetPreferWorldFile() {
		return georeferencedTextureType.isSetPreferWorldFile();
	}

	public boolean isSetReferencePoint() {
		return georeferencedTextureType.isSetReferencePoint();
	}

	public boolean isSetTarget() {
		return georeferencedTextureType.isSetTarget();
	}

	public void unsetGenericApplicationPropertyOfGeoreferencedTexture() {
		georeferencedTextureType.unset_GenericApplicationPropertyOfGeoreferencedTexture();
	}

	public void unsetOrientation() {
		georeferencedTextureType.unsetOrientation();
	}

	public void unsetPreferWorldFile() {
		georeferencedTextureType.setPreferWorldFile(null);
	}

	public void unsetReferencePoint() {
		georeferencedTextureType.setReferencePoint(null);
	}

	public void unsetTarget() {
		georeferencedTextureType.unsetTarget();
	}

	public boolean unsetGenericApplicationPropertyOfGeoreferencedTexture(ADEComponent adeObject) {
		if (georeferencedTextureType.isSet_GenericApplicationPropertyOfGeoreferencedTexture()) {
			Iterator<JAXBElement<?>> iter = georeferencedTextureType.get_GenericApplicationPropertyOfGeoreferencedTexture().iterator();
			while (iter.hasNext()) {
				JAXBElement<?> elem = iter.next();
				if (elem.getValue() != null && elem.getValue() != null) {
					JAXBElement<?> ade = ModelMapper.ADE.toJAXB(adeObject);
					if (ade != null && ade.getValue() != null && elem.getValue().equals(ade.getValue())) {
						iter.remove();
						return true;
					}
				}
			}				
		}
		
		return false;
	}

	public boolean unsetTarget(String target) {
		if (georeferencedTextureType.isSetTarget())
			return georeferencedTextureType.getTarget().remove(target);
		
		return false;
	}

}
