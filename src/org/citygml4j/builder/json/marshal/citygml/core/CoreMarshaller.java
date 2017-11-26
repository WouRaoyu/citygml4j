package org.citygml4j.builder.json.marshal.citygml.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.citygml4j.builder.json.marshal.CityJSONMarshaller;
import org.citygml4j.builder.json.marshal.citygml.CityGMLMarshaller;
import org.citygml4j.builder.json.marshal.util.AffineTransform;
import org.citygml4j.builder.json.objects.feature.AbstractCityObjectType;
import org.citygml4j.builder.json.objects.feature.AddressType;
import org.citygml4j.builder.json.objects.feature.Attributes;
import org.citygml4j.builder.json.objects.geometry.AbstractGeometryType;
import org.citygml4j.builder.json.objects.geometry.GeometryTypeName;
import org.citygml4j.builder.json.objects.geometry.MultiPointType;
import org.citygml4j.geometry.Matrix;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.Address;
import org.citygml4j.model.citygml.core.CityModel;
import org.citygml4j.model.citygml.core.CityObjectMember;
import org.citygml4j.model.citygml.core.ImplicitGeometry;
import org.citygml4j.model.citygml.core.ImplicitRepresentationProperty;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.geometry.AbstractGeometry;
import org.citygml4j.model.xal.CountryName;
import org.citygml4j.model.xal.LocalityName;
import org.citygml4j.model.xal.PostalCodeNumber;
import org.citygml4j.model.xal.ThoroughfareName;
import org.citygml4j.model.xal.ThoroughfareNumber;
import org.citygml4j.util.walker.XALWalker;

public class CoreMarshaller {
	private final CityJSONMarshaller json;
	private final CityGMLMarshaller citygml;

	public CoreMarshaller(CityGMLMarshaller citygml) {
		this.citygml = citygml;
		json = citygml.getCityJSONMarshaller();
	}

	public List<AbstractCityObjectType> marshal(ModelObject src) {
		if (src instanceof CityModel)
			return marshalCityModel((CityModel)src);
		
		return Collections.emptyList();	
	}

	public void marshalAbstractCityObject(AbstractCityObject src, AbstractCityObjectType dest, Attributes attributes) {
		if (src.isSetCreationDate())
			attributes.setCreationDate(src.getCreationDate().getTime());

		if (src.isSetTerminationDate())
			attributes.setTerminationDate(src.getTerminationDate().getTime());

		if (src.isSetGenericAttribute())
			citygml.getGenericsMarshaller().marshalGenericAttributes(src.getGenericAttribute(), attributes);
	}

	public List<AbstractCityObjectType> marshalCityModel(CityModel src) {
		List<AbstractCityObjectType> cityObjects = new ArrayList<>();
		if (src.isSetCityObjectMember()) {
			for (CityObjectMember property : src.getCityObjectMember()) {
				if (property.isSetCityObject())
					cityObjects.addAll(citygml.marshal(property.getCityObject()));			
			}
		}

		return cityObjects;
	}

	public AbstractGeometryType marshalImplicitGeometry(ImplicitGeometry src) {	
		AffineTransform transformer = null;

		// get transformation matrix
		Matrix matrix = src.isSetTransformationMatrix() ? src.getTransformationMatrix().getMatrix().copy() : null;

		// add translation
		if (matrix != null && src.isSetReferencePoint() && src.getReferencePoint().isSetPoint()) {
			List<Double> point = src.getReferencePoint().getPoint().toList3d();
			matrix.set(0, 3, matrix.get(0, 3) + point.get(0));
			matrix.set(1, 3, matrix.get(1, 3) + point.get(1));
			matrix.set(2, 3, matrix.get(2, 3) + point.get(2));
		}

		// create affine transform if required
		if (matrix != null)
			transformer = new AffineTransform(matrix);

		return json.getGMLMarshaller().marshalGeometryProperty(src.getRelativeGMLGeometry(), transformer);
	}

	public AbstractGeometryType marshalImplicitRepresentationProperty(ImplicitRepresentationProperty src) {
		Object dest = null;
		if (src.isSetImplicitGeometry())
			dest = marshalImplicitGeometry(src.getImplicitGeometry());
		else if (src.hasLocalProperty(CityJSONMarshaller.GEOMETRY_XLINK))
			dest = marshal((AbstractGeometry)src.getLocalProperty(CityJSONMarshaller.GEOMETRY_XLINK));

		return dest instanceof AbstractGeometryType ? (AbstractGeometryType)dest : null;
	}
	
	public void marshalAddress(Address src, AddressType dest) {
		if (src.isSetXalAddress() && src.getXalAddress().isSetAddressDetails()) {
			src.getXalAddress().getAddressDetails().accept(new XALWalker() {
				
				@Override
				public void visit(CountryName countryName) {
					if (!dest.isSetCountryName())
						dest.setCountryName(countryName.getContent());

					super.visit(countryName);
				}

				@Override
				public void visit(LocalityName localityName) {
					if (!dest.isSetLocalityName())
						dest.setLocalityName(localityName.getContent());

					super.visit(localityName);
				}

				@Override
				public void visit(PostalCodeNumber postalCodeNumber) {
					if (!dest.isSetPostalCode())
						dest.setPostalCode(postalCodeNumber.getContent());

					super.visit(postalCodeNumber);
				}

				@Override
				public void visit(ThoroughfareName thoroughfareName) {
					if (!dest.isSetThoroughfareName())
						dest.setThoroughfareName(thoroughfareName.getContent());

					super.visit(thoroughfareName);
				}

				@Override
				public void visit(ThoroughfareNumber thoroughfareNumber) {
					if (!dest.isSetThoroughfareNumber())
						dest.setThoroughfareNumber(thoroughfareNumber.getContent());

					super.visit(thoroughfareNumber);
				}
			});
		}
		
		if (src.isSetMultiPoint()) {
			AbstractGeometryType geometry = json.getGMLMarshaller().marshalGeometryProperty(src.getMultiPoint());
			if (geometry != null && geometry.getType() == GeometryTypeName.MULTI_POINT)
				dest.setLocation((MultiPointType)geometry);
		}
	}
	
	public AddressType marshalAddress(Address src) {
		AddressType dest = new AddressType();
		marshalAddress(src, dest);
		
		return dest;
	}

}