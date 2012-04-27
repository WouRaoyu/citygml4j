/*
 * This file is part of citygml4j.
 * Copyright (c) 2007 - 2010
 * Institute for Geodesy and Geoinformation Science
 * Technische Universitaet Berlin, Germany
 * http://www.igg.tu-berlin.de/
 *
 * The citygml4j library is free software:
 * you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. If not, see 
 * <http://www.gnu.org/licenses/>.
 */
package org.citygml4j.builder.jaxb.unmarshal.citygml.cityobjectgroup;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.citygml4j.builder.jaxb.unmarshal.JAXBUnmarshaller;
import org.citygml4j.builder.jaxb.unmarshal.citygml.CityGMLUnmarshaller;
import org.citygml4j.jaxb.citygml._0_4.CityObjectGroupMemberType;
import org.citygml4j.jaxb.citygml._0_4.CityObjectGroupType;
import org.citygml4j.model.citygml.CityGML;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.cityobjectgroup.CityObjectGroup;
import org.citygml4j.model.citygml.cityobjectgroup.CityObjectGroupMember;
import org.citygml4j.model.citygml.cityobjectgroup.CityObjectGroupParent;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.module.citygml.CityObjectGroupModule;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

public class CityObjectGroup040Unmarshaller {
	private final CityObjectGroupModule module = CityObjectGroupModule.v0_4_0;
	private final JAXBUnmarshaller jaxb;
	private final CityGMLUnmarshaller citygml;

	public CityObjectGroup040Unmarshaller(CityGMLUnmarshaller citygml) {
		this.citygml = citygml;
		jaxb = citygml.getJAXBUnmarshaller();
	}

	public CityGML unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
		final String localPart = src.getName().getLocalPart();
		final Object value = src.getValue();

		CityGML dest = null;

		if (localPart.equals("parent"))
			dest = unmarshalCityObjectGroupParent((CityObjectGroupMemberType)value);
		else
			dest = unmarshal(src.getValue());

		return dest;
	}

	public CityGML unmarshal(Object src) throws MissingADESchemaException {
		if (src instanceof JAXBElement<?>)
			return unmarshal((JAXBElement<?>)src);

		CityGML dest = null;

		if (src instanceof CityObjectGroupType)
			dest = unmarshalCityObjectGroup((CityObjectGroupType)src);
		else if (src instanceof CityObjectGroupMemberType)
			dest = unmarshalCityObjectGroupMember((CityObjectGroupMemberType)src);

		return dest;
	}

	public void unmarshalCityObjectGroup(CityObjectGroupType src, CityObjectGroup dest) throws MissingADESchemaException {
		citygml.getCore040Unmarshaller().unmarshalAbstractCityObject(src, dest);

		if (src.isSetClazz())
			dest.setClazz(new Code(src.getClazz()));

		if (src.isSetFunction()) {
			for (String function : src.getFunction())
				dest.addFunction(new Code(function));
		}

		if (src.isSetUsage()) {
			for (String usage : src.getUsage())
				dest.addUsage(new Code(usage));
		}

		if (src.isSetGeometry())
			dest.setGeometry(jaxb.getGMLUnmarshaller().unmarshalGeometryProperty(src.getGeometry()));

		if (src.isSetGroupMember()) {
			for (CityObjectGroupMemberType cityObjectGroupMember : src.getGroupMember())
				dest.addGroupMember(unmarshalCityObjectGroupMember(cityObjectGroupMember));
		}

		if (src.isSetParent())
			dest.setGroupParent(unmarshalCityObjectGroupParent(src.getParent()));	
	}

	public CityObjectGroup unmarshalCityObjectGroup(CityObjectGroupType src) throws MissingADESchemaException {
		CityObjectGroup dest = new CityObjectGroup(module);
		unmarshalCityObjectGroup(src, dest);

		return dest;
	}

	public CityObjectGroupMember unmarshalCityObjectGroupMember(CityObjectGroupMemberType src) throws MissingADESchemaException {
		CityObjectGroupMember dest = new CityObjectGroupMember(module);
		jaxb.getGMLUnmarshaller().unmarshalFeatureProperty(src, dest);

		if (src.isSetGroupRole())
			dest.setGroupRole(src.getGroupRole());

		if (src.isSet_Object()) {
			ModelObject object = jaxb.unmarshal(src.get_Object());
			if (object instanceof AbstractCityObject)
				dest.setObject((AbstractCityObject)object);
		}

		return dest;
	}

	public CityObjectGroupParent unmarshalCityObjectGroupParent(CityObjectGroupMemberType src) throws MissingADESchemaException {
		CityObjectGroupParent dest = new CityObjectGroupParent(module);
		jaxb.getGMLUnmarshaller().unmarshalFeatureProperty(src, dest);

		if (src.isSet_Object()) {
			ModelObject object = jaxb.unmarshal(src.get_Object());
			if (object instanceof AbstractCityObject)
				dest.setObject((AbstractCityObject)object);
		}

		return dest;
	}
	
	public boolean assignGenericProperty(ADEComponent genericProperty, QName substitutionGroup, CityGML dest) {
		String name = substitutionGroup.getLocalPart();
		boolean success = true;
		
		if (dest instanceof CityObjectGroup && name.equals("_GenericApplicationPropertyOfCityObjectGroup"))
			((CityObjectGroup)dest).addGenericApplicationPropertyOfCityObjectGroup(genericProperty);
		else 
			success = false;
		
		return success;
	}
}
