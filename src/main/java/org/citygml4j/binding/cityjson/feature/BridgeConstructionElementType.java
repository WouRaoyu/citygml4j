/*
 * citygml4j - The Open Source Java API for CityGML
 * https://github.com/citygml4j
 *
 * Copyright 2013-2018 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.citygml4j.binding.cityjson.feature;

import com.google.gson.annotations.JsonAdapter;
import org.citygml4j.binding.cityjson.geometry.GeometryTypeName;

public class BridgeConstructionElementType extends AbstractCityObjectType {
	private final CityObjectTypeName type = CityObjectTypeName.BRIDGE_CONSTRUCTION_ELEMENT;
	@JsonAdapter(AttributesAdapter.class)
	private Attributes attributes;
	
	BridgeConstructionElementType() {
	}
	
	public BridgeConstructionElementType(String gmlId) {
		super(gmlId);
	}
	
	@Override
	public CityObjectTypeName getType() {
		return type;
	}
	
	@Override
	public Attributes newAttributes() {
		attributes = new Attributes();
		return attributes;
	}
	
	@Override
	public boolean isSetAttributes() {
		return attributes != null;
	}

	@Override
	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	@Override
	public void unsetAttributes() {
		attributes = null;
	}

	@Override
	public boolean isValidGeometryType(GeometryTypeName type) {
		return true;
	}

}
