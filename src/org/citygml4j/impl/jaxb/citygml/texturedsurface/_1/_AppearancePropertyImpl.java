package org.citygml4j.impl.jaxb.citygml.texturedsurface._1;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ObjectFactory;
import org.citygml4j.impl.jaxb.citygml.core._1.CityGMLBaseImpl;
import org.citygml4j.jaxb.citygml.tex._1.AbstractAppearanceType;
import org.citygml4j.jaxb.citygml.tex._1.AppearancePropertyType;
import org.citygml4j.jaxb.citygml.tex._1.MaterialType;
import org.citygml4j.jaxb.citygml.tex._1.SimpleTextureType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.texturedsurface.TexturedSurfaceModule;
import org.citygml4j.model.citygml.texturedsurface._Appearance;
import org.citygml4j.model.citygml.texturedsurface._AppearanceProperty;

public class _AppearancePropertyImpl extends CityGMLBaseImpl implements _AppearanceProperty {
	private AppearancePropertyType _appearancePropertyType;

	public _AppearancePropertyImpl() {
		_appearancePropertyType = new AppearancePropertyType();
	}

	public _AppearancePropertyImpl(AppearancePropertyType _appearancePropertyType) {
		this._appearancePropertyType = _appearancePropertyType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass._APPEARANCEPROPERTY;
	}

	@Override
	public final CityGMLModule getCityGMLModule() {
		return TexturedSurfaceModule.v1_0_0;
	}

	@Override
	public AppearancePropertyType getJAXBObject() {
		return _appearancePropertyType;
	}

	public _Appearance getAppearance() {
		if (_appearancePropertyType.isSet_Appearance()) {
			JAXBElement<? extends AbstractAppearanceType> jaxbElem = _appearancePropertyType.get_Appearance();

			if (jaxbElem.getValue() != null) {
				if (jaxbElem.getValue() instanceof MaterialType)
					return new _MaterialImpl((MaterialType)jaxbElem.getValue());
				else if (jaxbElem.getValue() instanceof SimpleTextureType)
					return new _SimpleTextureImpl((SimpleTextureType)jaxbElem.getValue());
			}
		}

		return null;
	}

	public String getOrientation() {
		return _appearancePropertyType.getOrientation();
	}

	public void setAppearance(_Appearance _appearance) {
		JAXBElement<? extends AbstractAppearanceType> elem = null;

		switch (_appearance.getCityGMLClass()) {
		case _MATERIAL:
			elem = ObjectFactory.TEX_1.createMaterial(((_MaterialImpl)_appearance).getJAXBObject());
			break;
		case _SIMPLETEXTURE:
			elem = ObjectFactory.TEX_1.createSimpleTexture(((_SimpleTextureImpl)_appearance).getJAXBObject());
			break;
		}

		if (elem != null)
			_appearancePropertyType.set_Appearance(elem);
	}

	public void setOrientation(String orientation) {
		_appearancePropertyType.setOrientation(orientation);
	}

	public String getActuate() {
		return _appearancePropertyType.getActuate();
	}

	public String getArcrole() {
		return _appearancePropertyType.getActuate();
	}

	public String getHref() {
		return _appearancePropertyType.getHref();
	}

	public String getRemoteSchema() {
		return _appearancePropertyType.getRemoteSchema();
	}

	public String getRole() {
		return _appearancePropertyType.getRole();
	}

	public String getShow() {
		return _appearancePropertyType.getShow();
	}

	public String getTitle() {
		return _appearancePropertyType.getTitle();
	}

	public String getType() {
		return _appearancePropertyType.getType();
	}

	public void setActuate(String actuate) {
		_appearancePropertyType.setActuate(actuate);
	}

	public void setArcrole(String arcrole) {
		_appearancePropertyType.setArcrole(arcrole);
	}

	public void setHref(String href) {
		_appearancePropertyType.setHref(href);
	}

	public void setRemoteSchema(String remoteSchema) {
		_appearancePropertyType.setRemoteSchema(remoteSchema);
	}

	public void setRole(String role) {
		_appearancePropertyType.setRole(role);
	}

	public void setShow(String show) {
		_appearancePropertyType.setShow(show);
	}

	public void setTitle(String title) {
		_appearancePropertyType.setTitle(title);
	}

	public void setType(String type) {
		_appearancePropertyType.setType(type);
	}

	public boolean isSetAppearance() {
		return _appearancePropertyType.isSet_Appearance();
	}

	public boolean isSetOrientation() {
		return _appearancePropertyType.isSetOrientation();
	}

	public void unsetAppearance() {
		_appearancePropertyType.set_Appearance(null);
	}
	
	public boolean isSetActuate() {
		return _appearancePropertyType.isSetActuate();
	}

	public boolean isSetArcrole() {
		return _appearancePropertyType.isSetArcrole();
	}

	public boolean isSetHref() {
		return _appearancePropertyType.isSetHref();
	}

	public boolean isSetRemoteSchema() {
		return _appearancePropertyType.isSetRemoteSchema();
	}

	public boolean isSetRole() {
		return _appearancePropertyType.isSetRole();
	}

	public boolean isSetShow() {
		return _appearancePropertyType.isSetShow();
	}

	public boolean isSetTitle() {
		return _appearancePropertyType.isSetTitle();
	}

	public boolean isSetType() {
		return _appearancePropertyType.isSetType();
	}

	public void unsetActuate() {
		_appearancePropertyType.setActuate(null);
	}

	public void unsetArcrole() {
		_appearancePropertyType.setArcrole(null);
	}

	public void unsetHref() {
		_appearancePropertyType.setHref(null);
	}

	public void unsetRemoteSchema() {
		_appearancePropertyType.setRemoteSchema(null);
	}

	public void unsetRole() {
		_appearancePropertyType.setRole(null);
	}

	public void unsetShow() {
		_appearancePropertyType.setShow(null);
	}

	public void unsetTitle() {
		_appearancePropertyType.setTitle(null);
	}

	public void unsetType() {
		_appearancePropertyType.setType(null);
	}
}
