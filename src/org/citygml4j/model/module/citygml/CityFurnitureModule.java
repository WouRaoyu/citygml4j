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
package org.citygml4j.model.module.citygml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.citygml4j.model.citygml.CityGML;
import org.citygml4j.model.citygml.cityfurniture.CityFurniture;
import org.citygml4j.model.module.Module;

public class CityFurnitureModule extends AbstractCityGMLModule {
	private static final List<CityFurnitureModule> instances = new ArrayList<CityFurnitureModule>();

	public static final CityFurnitureModule v1_0_0;
	public static final CityFurnitureModule v0_4_0;

	private CityFurnitureModule (
			CityGMLModuleType type, 
			CityGMLModuleVersion version,
			String namespaceURI, 
			String namespacePrefix, 
			String schemaLocation,
			Module... dependencies) {
		super(type, version, namespaceURI, namespacePrefix, schemaLocation, dependencies);		
		instances.add(this);
	}

	static {
		v1_0_0 = new CityFurnitureModule (
				CityGMLModuleType.CITY_FURNITURE,
				CityGMLModuleVersion.v1_0_0,
				"http://www.opengis.net/citygml/cityfurniture/1.0",
				"frn",
				"http://schemas.opengis.net/citygml/cityfurniture/1.0/cityFurniture.xsd",			
				CoreModule.v1_0_0);

		v0_4_0 = new CityFurnitureModule (
				CityGMLModuleType.CITY_FURNITURE,
				CoreModule.v0_4_0.getVersion(),
				CoreModule.v0_4_0.getNamespaceURI(),
				CoreModule.v0_4_0.getNamespacePrefix(),
				CoreModule.v0_4_0.getSchemaLocation(),		
				CoreModule.v0_4_0);
		
		v1_0_0.elementMap = new HashMap<String, Class<? extends CityGML>>();
		v1_0_0.elementMap.put("CityFurniture", CityFurniture.class);
		v0_4_0.elementMap = v1_0_0.elementMap;
	}

	public static List<CityFurnitureModule> getInstances() {
		return instances;
	}

}