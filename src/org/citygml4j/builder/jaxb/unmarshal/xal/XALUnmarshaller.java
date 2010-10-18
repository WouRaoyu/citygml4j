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
package org.citygml4j.builder.jaxb.unmarshal.xal;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.xal.AddressDetailsImpl;
import org.citygml4j.impl.xal.AddressIdentifierImpl;
import org.citygml4j.impl.xal.AddressImpl;
import org.citygml4j.impl.xal.AddressLatitudeDirectionImpl;
import org.citygml4j.impl.xal.AddressLatitudeImpl;
import org.citygml4j.impl.xal.AddressLineImpl;
import org.citygml4j.impl.xal.AddressLinesImpl;
import org.citygml4j.impl.xal.AddressLongitudeDirectionImpl;
import org.citygml4j.impl.xal.AddressLongitudeImpl;
import org.citygml4j.impl.xal.AdministrativeAreaImpl;
import org.citygml4j.impl.xal.AdministrativeAreaNameImpl;
import org.citygml4j.impl.xal.BarcodeImpl;
import org.citygml4j.impl.xal.BuildingNameImpl;
import org.citygml4j.impl.xal.CountryImpl;
import org.citygml4j.impl.xal.CountryNameCodeImpl;
import org.citygml4j.impl.xal.CountryNameImpl;
import org.citygml4j.impl.xal.DepartmentImpl;
import org.citygml4j.impl.xal.DepartmentNameImpl;
import org.citygml4j.impl.xal.DependentLocalityImpl;
import org.citygml4j.impl.xal.DependentLocalityNameImpl;
import org.citygml4j.impl.xal.DependentLocalityNumberImpl;
import org.citygml4j.impl.xal.DependentThoroughfareImpl;
import org.citygml4j.impl.xal.EndorsementLineCodeImpl;
import org.citygml4j.impl.xal.FirmImpl;
import org.citygml4j.impl.xal.FirmNameImpl;
import org.citygml4j.impl.xal.KeyLineCodeImpl;
import org.citygml4j.impl.xal.LargeMailUserIdentifierImpl;
import org.citygml4j.impl.xal.LargeMailUserImpl;
import org.citygml4j.impl.xal.LargeMailUserNameImpl;
import org.citygml4j.impl.xal.LocalityImpl;
import org.citygml4j.impl.xal.LocalityNameImpl;
import org.citygml4j.impl.xal.MailStopImpl;
import org.citygml4j.impl.xal.MailStopNameImpl;
import org.citygml4j.impl.xal.MailStopNumberImpl;
import org.citygml4j.impl.xal.PostBoxImpl;
import org.citygml4j.impl.xal.PostBoxNumberExtensionImpl;
import org.citygml4j.impl.xal.PostBoxNumberImpl;
import org.citygml4j.impl.xal.PostBoxNumberPrefixImpl;
import org.citygml4j.impl.xal.PostBoxNumberSuffixImpl;
import org.citygml4j.impl.xal.PostOfficeImpl;
import org.citygml4j.impl.xal.PostOfficeNameImpl;
import org.citygml4j.impl.xal.PostOfficeNumberImpl;
import org.citygml4j.impl.xal.PostTownImpl;
import org.citygml4j.impl.xal.PostTownNameImpl;
import org.citygml4j.impl.xal.PostTownSuffixImpl;
import org.citygml4j.impl.xal.PostalCodeImpl;
import org.citygml4j.impl.xal.PostalCodeNumberExtensionImpl;
import org.citygml4j.impl.xal.PostalCodeNumberImpl;
import org.citygml4j.impl.xal.PostalRouteImpl;
import org.citygml4j.impl.xal.PostalRouteNameImpl;
import org.citygml4j.impl.xal.PostalRouteNumberImpl;
import org.citygml4j.impl.xal.PostalServiceElementsImpl;
import org.citygml4j.impl.xal.PremiseImpl;
import org.citygml4j.impl.xal.PremiseLocationImpl;
import org.citygml4j.impl.xal.PremiseNameImpl;
import org.citygml4j.impl.xal.PremiseNumberImpl;
import org.citygml4j.impl.xal.PremiseNumberPrefixImpl;
import org.citygml4j.impl.xal.PremiseNumberRangeFromImpl;
import org.citygml4j.impl.xal.PremiseNumberRangeImpl;
import org.citygml4j.impl.xal.PremiseNumberRangeToImpl;
import org.citygml4j.impl.xal.PremiseNumberSuffixImpl;
import org.citygml4j.impl.xal.SortingCodeImpl;
import org.citygml4j.impl.xal.SubAdministrativeAreaImpl;
import org.citygml4j.impl.xal.SubAdministrativeAreaNameImpl;
import org.citygml4j.impl.xal.SubPremiseImpl;
import org.citygml4j.impl.xal.SubPremiseLocationImpl;
import org.citygml4j.impl.xal.SubPremiseNameImpl;
import org.citygml4j.impl.xal.SubPremiseNumberImpl;
import org.citygml4j.impl.xal.SubPremiseNumberPrefixImpl;
import org.citygml4j.impl.xal.SubPremiseNumberSuffixImpl;
import org.citygml4j.impl.xal.SupplementaryPostalServiceDataImpl;
import org.citygml4j.impl.xal.ThoroughfareImpl;
import org.citygml4j.impl.xal.ThoroughfareLeadingTypeImpl;
import org.citygml4j.impl.xal.ThoroughfareNameImpl;
import org.citygml4j.impl.xal.ThoroughfareNumberFromImpl;
import org.citygml4j.impl.xal.ThoroughfareNumberImpl;
import org.citygml4j.impl.xal.ThoroughfareNumberPrefixImpl;
import org.citygml4j.impl.xal.ThoroughfareNumberRangeImpl;
import org.citygml4j.impl.xal.ThoroughfareNumberSuffixImpl;
import org.citygml4j.impl.xal.ThoroughfareNumberToImpl;
import org.citygml4j.impl.xal.ThoroughfarePostDirectionImpl;
import org.citygml4j.impl.xal.ThoroughfarePreDirectionImpl;
import org.citygml4j.impl.xal.ThoroughfareTrailingTypeImpl;
import org.citygml4j.jaxb.xal.AddressDetails;
import org.citygml4j.jaxb.xal.AddressLineElement;
import org.citygml4j.jaxb.xal.AddressLinesType;
import org.citygml4j.jaxb.xal.AdministrativeAreaElement;
import org.citygml4j.jaxb.xal.BuildingNameType;
import org.citygml4j.jaxb.xal.CountryNameElement;
import org.citygml4j.jaxb.xal.DepartmentElement;
import org.citygml4j.jaxb.xal.DependentLocalityType;
import org.citygml4j.jaxb.xal.FirmType;
import org.citygml4j.jaxb.xal.LargeMailUserType;
import org.citygml4j.jaxb.xal.LocalityElement;
import org.citygml4j.jaxb.xal.MailStopType;
import org.citygml4j.jaxb.xal.PostBoxElement;
import org.citygml4j.jaxb.xal.PostOfficeElement;
import org.citygml4j.jaxb.xal.PostalCodeElement;
import org.citygml4j.jaxb.xal.PostalRouteType;
import org.citygml4j.jaxb.xal.PremiseElement;
import org.citygml4j.jaxb.xal.PremiseNumberElement;
import org.citygml4j.jaxb.xal.PremiseNumberPrefixElement;
import org.citygml4j.jaxb.xal.PremiseNumberSuffixElement;
import org.citygml4j.jaxb.xal.SubPremiseType;
import org.citygml4j.jaxb.xal.ThoroughfareElement;
import org.citygml4j.jaxb.xal.ThoroughfareLeadingTypeType;
import org.citygml4j.jaxb.xal.ThoroughfareNameType;
import org.citygml4j.jaxb.xal.ThoroughfareNumberElement;
import org.citygml4j.jaxb.xal.ThoroughfareNumberPrefixElement;
import org.citygml4j.jaxb.xal.ThoroughfareNumberSuffixElement;
import org.citygml4j.jaxb.xal.ThoroughfarePostDirectionType;
import org.citygml4j.jaxb.xal.ThoroughfarePreDirectionType;
import org.citygml4j.jaxb.xal.ThoroughfareTrailingTypeType;
import org.citygml4j.model.module.xal.XALCoreModule;
import org.citygml4j.model.xal.Address;
import org.citygml4j.model.xal.AddressIdentifier;
import org.citygml4j.model.xal.AddressLatitude;
import org.citygml4j.model.xal.AddressLatitudeDirection;
import org.citygml4j.model.xal.AddressLine;
import org.citygml4j.model.xal.AddressLines;
import org.citygml4j.model.xal.AddressLongitude;
import org.citygml4j.model.xal.AddressLongitudeDirection;
import org.citygml4j.model.xal.AdministrativeArea;
import org.citygml4j.model.xal.AdministrativeAreaName;
import org.citygml4j.model.xal.Barcode;
import org.citygml4j.model.xal.BuildingName;
import org.citygml4j.model.xal.Country;
import org.citygml4j.model.xal.CountryName;
import org.citygml4j.model.xal.CountryNameCode;
import org.citygml4j.model.xal.Department;
import org.citygml4j.model.xal.DepartmentName;
import org.citygml4j.model.xal.DependentLocality;
import org.citygml4j.model.xal.DependentLocalityName;
import org.citygml4j.model.xal.DependentLocalityNumber;
import org.citygml4j.model.xal.DependentThoroughfare;
import org.citygml4j.model.xal.EndorsementLineCode;
import org.citygml4j.model.xal.Firm;
import org.citygml4j.model.xal.FirmName;
import org.citygml4j.model.xal.KeyLineCode;
import org.citygml4j.model.xal.LargeMailUser;
import org.citygml4j.model.xal.LargeMailUserIdentifier;
import org.citygml4j.model.xal.LargeMailUserName;
import org.citygml4j.model.xal.Locality;
import org.citygml4j.model.xal.LocalityName;
import org.citygml4j.model.xal.MailStop;
import org.citygml4j.model.xal.MailStopName;
import org.citygml4j.model.xal.MailStopNumber;
import org.citygml4j.model.xal.PostBox;
import org.citygml4j.model.xal.PostBoxNumber;
import org.citygml4j.model.xal.PostBoxNumberExtension;
import org.citygml4j.model.xal.PostBoxNumberPrefix;
import org.citygml4j.model.xal.PostBoxNumberSuffix;
import org.citygml4j.model.xal.PostOffice;
import org.citygml4j.model.xal.PostOfficeName;
import org.citygml4j.model.xal.PostOfficeNumber;
import org.citygml4j.model.xal.PostTown;
import org.citygml4j.model.xal.PostTownName;
import org.citygml4j.model.xal.PostTownSuffix;
import org.citygml4j.model.xal.PostalCode;
import org.citygml4j.model.xal.PostalCodeNumber;
import org.citygml4j.model.xal.PostalCodeNumberExtension;
import org.citygml4j.model.xal.PostalRoute;
import org.citygml4j.model.xal.PostalRouteName;
import org.citygml4j.model.xal.PostalRouteNumber;
import org.citygml4j.model.xal.PostalServiceElements;
import org.citygml4j.model.xal.Premise;
import org.citygml4j.model.xal.PremiseLocation;
import org.citygml4j.model.xal.PremiseName;
import org.citygml4j.model.xal.PremiseNumber;
import org.citygml4j.model.xal.PremiseNumberPrefix;
import org.citygml4j.model.xal.PremiseNumberRange;
import org.citygml4j.model.xal.PremiseNumberRangeFrom;
import org.citygml4j.model.xal.PremiseNumberRangeTo;
import org.citygml4j.model.xal.PremiseNumberSuffix;
import org.citygml4j.model.xal.SortingCode;
import org.citygml4j.model.xal.SubAdministrativeArea;
import org.citygml4j.model.xal.SubAdministrativeAreaName;
import org.citygml4j.model.xal.SubPremise;
import org.citygml4j.model.xal.SubPremiseLocation;
import org.citygml4j.model.xal.SubPremiseName;
import org.citygml4j.model.xal.SubPremiseNumber;
import org.citygml4j.model.xal.SubPremiseNumberPrefix;
import org.citygml4j.model.xal.SubPremiseNumberSuffix;
import org.citygml4j.model.xal.SupplementaryPostalServiceData;
import org.citygml4j.model.xal.Thoroughfare;
import org.citygml4j.model.xal.ThoroughfareLeadingType;
import org.citygml4j.model.xal.ThoroughfareName;
import org.citygml4j.model.xal.ThoroughfareNumber;
import org.citygml4j.model.xal.ThoroughfareNumberFrom;
import org.citygml4j.model.xal.ThoroughfareNumberPrefix;
import org.citygml4j.model.xal.ThoroughfareNumberRange;
import org.citygml4j.model.xal.ThoroughfareNumberSuffix;
import org.citygml4j.model.xal.ThoroughfareNumberTo;
import org.citygml4j.model.xal.ThoroughfarePostDirection;
import org.citygml4j.model.xal.ThoroughfarePreDirection;
import org.citygml4j.model.xal.ThoroughfareTrailingType;
import org.citygml4j.model.xal.XAL;

public class XALUnmarshaller {
	
	public XAL unmarshal(JAXBElement<?> src) {
		XAL dest = null;
		
		if (src.getName().getNamespaceURI().equals(XALCoreModule.v2_0.getNamespaceURI()))
			dest = unmarshal(src.getValue());

		return dest;		
	}

	public XAL unmarshal(Object src) {
		if (src instanceof JAXBElement<?>)
			return unmarshal((JAXBElement<?>)src);
		
		XAL dest = null;

		if (src instanceof AddressDetails.Address)
			dest = unmarshalAddress((AddressDetails.Address)src);
		else if (src instanceof AddressDetails)
			dest = unmarshalAddressDetails((AddressDetails)src);
		else if (src instanceof AddressDetails.PostalServiceElements.AddressIdentifier)
			dest = unmarshalAddressIdentifier((AddressDetails.PostalServiceElements.AddressIdentifier)src);
		else if (src instanceof AddressDetails.PostalServiceElements.AddressLatitude)
			dest = unmarshalAddressLatitude((AddressDetails.PostalServiceElements.AddressLatitude)src);
		else if (src instanceof AddressDetails.PostalServiceElements.AddressLatitudeDirection)
			dest = unmarshalAddressLatitudeDirection((AddressDetails.PostalServiceElements.AddressLatitudeDirection)src);
		else if (src instanceof AddressLineElement)
			dest = unmarshalAddressLine((AddressLineElement)src);
		else if (src instanceof AddressLinesType)
			dest = unmarshalAddressLines((AddressLinesType)src);
		else if (src instanceof AddressDetails.PostalServiceElements.AddressLongitude)
			dest = unmarshalAddressLongitude((AddressDetails.PostalServiceElements.AddressLongitude)src);
		else if (src instanceof AddressDetails.PostalServiceElements.AddressLongitudeDirection)
			dest = unmarshalAddressLongitudeDirection((AddressDetails.PostalServiceElements.AddressLongitudeDirection)src);
		else if (src instanceof AdministrativeAreaElement)
			dest = unmarshalAdministrativeArea((AdministrativeAreaElement)src);
		else if (src instanceof AdministrativeAreaElement.AdministrativeAreaName)
			dest = unmarshalAdministrativeAreaName((AdministrativeAreaElement.AdministrativeAreaName)src);
		else if (src instanceof AddressDetails.PostalServiceElements.Barcode)
			dest = unmarshalBarcode((AddressDetails.PostalServiceElements.Barcode)src);
		else if (src instanceof BuildingNameType)
			dest = unmarshalBuildingName((BuildingNameType)src);
		else if (src instanceof AddressDetails.Country)
			dest = unmarshalCountry((AddressDetails.Country)src);
		else if (src instanceof CountryNameElement)
			dest = unmarshalCountryName((CountryNameElement)src);
		else if (src instanceof AddressDetails.Country.CountryNameCode)
			dest = unmarshalCountryNameCode((AddressDetails.Country.CountryNameCode)src);
		else if (src instanceof DepartmentElement)
			dest = unmarshalDepartment((DepartmentElement)src);
		else if (src instanceof DepartmentElement.DepartmentName)
			dest = unmarshalDepartmentName((DepartmentElement.DepartmentName)src);
		else if (src instanceof DependentLocalityType)
			dest = unmarshalDependentLocality((DependentLocalityType)src);
		else if (src instanceof DependentLocalityType.DependentLocalityName)
			dest = unmarshalDependentLocalityName((DependentLocalityType.DependentLocalityName)src);
		else if (src instanceof DependentLocalityType.DependentLocalityNumber)
			dest = unmarshalDependentLocalityNumber((DependentLocalityType.DependentLocalityNumber)src);
		else if (src instanceof ThoroughfareElement.DependentThoroughfare)
			dest = unmarshalDependentThoroughfare((ThoroughfareElement.DependentThoroughfare)src);
		else if (src instanceof AddressDetails.PostalServiceElements.EndorsementLineCode)
			dest = unmarshalEndorsementLineCode((AddressDetails.PostalServiceElements.EndorsementLineCode)src);
		else if (src instanceof FirmType)
			dest = unmarshalFirm((FirmType)src);
		else if (src instanceof FirmType.FirmName)
			dest = unmarshalFirmName((FirmType.FirmName)src);
		else if (src instanceof AddressDetails.PostalServiceElements.KeyLineCode)
			dest = unmarshalKeyLineCode((AddressDetails.PostalServiceElements.KeyLineCode)src);
		else if (src instanceof LargeMailUserType)
			dest = unmarshalLargeMailUser((LargeMailUserType)src);
		else if (src instanceof LargeMailUserType.LargeMailUserIdentifier)
			dest = unmarshalLargeMailUserIdentifier((LargeMailUserType.LargeMailUserIdentifier)src);
		else if (src instanceof LargeMailUserType.LargeMailUserName)
			dest = unmarshalLargeMailUserName((LargeMailUserType.LargeMailUserName)src);
		else if (src instanceof LocalityElement)
			dest = unmarshalLocality((LocalityElement)src);
		else if (src instanceof LocalityElement.LocalityName)
			dest = unmarshalLocalityName((LocalityElement.LocalityName)src);
		else if (src instanceof MailStopType)
			dest = unmarshalMailStop((MailStopType)src);
		else if (src instanceof MailStopType.MailStopName)
			dest = unmarshalMailStopName((MailStopType.MailStopName)src);
		else if (src instanceof MailStopType.MailStopNumber)
			dest = unmarshalMailStopNumber((MailStopType.MailStopNumber)src);
		else if (src instanceof PostalCodeElement)
			dest = unmarshalPostalCode((PostalCodeElement)src);
		else if (src instanceof PostalCodeElement.PostalCodeNumber)
			dest = unmarshalPostalCodeNumber((PostalCodeElement.PostalCodeNumber)src);
		else if (src instanceof PostalCodeElement.PostalCodeNumberExtension)
			dest = unmarshalPostalCodeNumberExtension((PostalCodeElement.PostalCodeNumberExtension)src);
		else if (src instanceof PostalRouteType)
			dest = unmarshalPostalRoute((PostalRouteType)src);
		else if (src instanceof PostalRouteType.PostalRouteName)
			dest = unmarshalPostalRouteName((PostalRouteType.PostalRouteName)src);
		else if (src instanceof PostalRouteType.PostalRouteNumber)
			dest = unmarshalPostalRouteNumber((PostalRouteType.PostalRouteNumber)src);
		else if (src instanceof AddressDetails.PostalServiceElements)
			dest = unmarshalPostalServiceElements((AddressDetails.PostalServiceElements)src);
		else if (src instanceof PostBoxElement)
			dest = unmarshalPostBox((PostBoxElement)src);
		else if (src instanceof PostBoxElement.PostBoxNumber)
			dest = unmarshalPostBoxNumber((PostBoxElement.PostBoxNumber)src);
		else if (src instanceof PostBoxElement.PostBoxNumberExtension)
			dest = unmarshalPostBoxNumberExtension((PostBoxElement.PostBoxNumberExtension)src);
		else if (src instanceof PostBoxElement.PostBoxNumberPrefix)
			dest = unmarshalPostBoxNumberPrefix((PostBoxElement.PostBoxNumberPrefix)src);
		else if (src instanceof PostBoxElement.PostBoxNumberSuffix)
			dest = unmarshalPostBoxNumberSuffix((PostBoxElement.PostBoxNumberSuffix)src);
		else if (src instanceof PostOfficeElement)
			dest = unmarshalPostOffice((PostOfficeElement)src);
		else if (src instanceof PostOfficeElement.PostOfficeName)
			dest = unmarshalPostOfficeName((PostOfficeElement.PostOfficeName)src);
		else if (src instanceof PostOfficeElement.PostOfficeNumber)
			dest = unmarshalPostOfficeNumber((PostOfficeElement.PostOfficeNumber)src);
		else if (src instanceof PostalCodeElement.PostTown)
			dest = unmarshalPostTown((PostalCodeElement.PostTown)src);
		else if (src instanceof PostalCodeElement.PostTown.PostTownName)
			dest = unmarshalPostTownName((PostalCodeElement.PostTown.PostTownName)src);
		else if (src instanceof PostalCodeElement.PostTown.PostTownSuffix)
			dest = unmarshalPostTownSuffix((PostalCodeElement.PostTown.PostTownSuffix)src);
		else if (src instanceof PremiseElement)
			dest = unmarshalPremise((PremiseElement)src);
		else if (src instanceof PremiseElement.PremiseLocation)
			dest = unmarshalPremiseLocation((PremiseElement.PremiseLocation)src);
		else if (src instanceof PremiseElement.PremiseName)
			dest = unmarshalPremiseName((PremiseElement.PremiseName)src);
		else if (src instanceof PremiseNumberElement)
			dest = unmarshalPremiseNumber((PremiseNumberElement)src);
		else if (src instanceof PremiseNumberPrefixElement)
			dest = unmarshalPremiseNumberPrefix((PremiseNumberPrefixElement)src);
		else if (src instanceof PremiseElement.PremiseNumberRange)
			dest = unmarshalPremiseNumberRange((PremiseElement.PremiseNumberRange)src);
		else if (src instanceof PremiseElement.PremiseNumberRange.PremiseNumberRangeFrom)
			dest = unmarshalPremiseNumberRangeFrom((PremiseElement.PremiseNumberRange.PremiseNumberRangeFrom)src);
		else if (src instanceof PremiseElement.PremiseNumberRange.PremiseNumberRangeTo)
			dest = unmarshalPremiseNumberRangeTo((PremiseElement.PremiseNumberRange.PremiseNumberRangeTo)src);
		else if (src instanceof PremiseNumberSuffixElement)
			dest = unmarshalPremiseNumberSuffix((PremiseNumberSuffixElement)src);
		else if (src instanceof AddressDetails.PostalServiceElements.SortingCode)
			dest = unmarshalSortingCode((AddressDetails.PostalServiceElements.SortingCode)src);
		else if (src instanceof AdministrativeAreaElement.SubAdministrativeArea)
			dest = unmarshalSubAdministrativeArea((AdministrativeAreaElement.SubAdministrativeArea)src);
		else if (src instanceof AdministrativeAreaElement.SubAdministrativeArea.SubAdministrativeAreaName)
			dest = unmarshalSubAdministrativeAreaName((AdministrativeAreaElement.SubAdministrativeArea.SubAdministrativeAreaName)src);
		else if (src instanceof SubPremiseType)
			dest = unmarshalSubPremise((SubPremiseType)src);
		else if (src instanceof SubPremiseType.SubPremiseLocation)
			dest = unmarshalSubPremiseLocation((SubPremiseType.SubPremiseLocation)src);
		else if (src instanceof SubPremiseType.SubPremiseName)
			dest = unmarshalSubPremiseName((SubPremiseType.SubPremiseName)src);
		else if (src instanceof SubPremiseType.SubPremiseNumber)
			dest = unmarshalSubPremiseNumber((SubPremiseType.SubPremiseNumber)src);
		else if (src instanceof SubPremiseType.SubPremiseNumberPrefix)
			dest = unmarshalSubPremiseNumberPrefix((SubPremiseType.SubPremiseNumberPrefix)src);
		else if (src instanceof SubPremiseType.SubPremiseNumberSuffix)
			dest = unmarshalSubPremiseNumberSuffix((SubPremiseType.SubPremiseNumberSuffix)src);
		else if (src instanceof AddressDetails.PostalServiceElements.SupplementaryPostalServiceData)
			dest = unmarshalSupplementaryPostalServiceData((AddressDetails.PostalServiceElements.SupplementaryPostalServiceData)src);
		else if (src instanceof ThoroughfareElement)
			dest = unmarshalThoroughfare((ThoroughfareElement)src);
		else if (src instanceof ThoroughfareLeadingTypeType)
			dest = unmarshalThoroughfareLeadingType((ThoroughfareLeadingTypeType)src);
		else if (src instanceof ThoroughfareNameType)
			dest = unmarshalThoroughfareName((ThoroughfareNameType)src);
		else if (src instanceof ThoroughfareNumberElement)
			dest = unmarshalThoroughfareNumber((ThoroughfareNumberElement)src);
		else if (src instanceof ThoroughfareElement.ThoroughfareNumberRange.ThoroughfareNumberFrom)
			dest = unmarshalThoroughfareNumberFrom((ThoroughfareElement.ThoroughfareNumberRange.ThoroughfareNumberFrom)src);		
		else if (src instanceof ThoroughfareNumberPrefixElement)
			dest = unmarshalThoroughfareNumberPrefix((ThoroughfareNumberPrefixElement)src);
		else if (src instanceof ThoroughfareElement.ThoroughfareNumberRange)
			dest = unmarshalThoroughfareNumberRange((ThoroughfareElement.ThoroughfareNumberRange)src);		
		else if (src instanceof ThoroughfareNumberSuffixElement)
			dest = unmarshalThoroughfareNumberSuffix((ThoroughfareNumberSuffixElement)src);
		else if (src instanceof ThoroughfareElement.ThoroughfareNumberRange.ThoroughfareNumberTo)
			dest = unmarshalThoroughfareNumberTo((ThoroughfareElement.ThoroughfareNumberRange.ThoroughfareNumberTo)src);
		else if (src instanceof ThoroughfarePostDirectionType)
			dest = unmarshalThoroughfarePostDirection((ThoroughfarePostDirectionType)src);
		else if (src instanceof ThoroughfarePreDirectionType)
			dest = unmarshalThoroughfarePreDirection((ThoroughfarePreDirectionType)src);
		else if (src instanceof ThoroughfareTrailingTypeType)
			dest = unmarshalThoroughfareTrailingType((ThoroughfareTrailingTypeType)src);

		return dest;
	}

	public Address unmarshalAddress(AddressDetails.Address src) {
		Address dest = new AddressImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public org.citygml4j.model.xal.AddressDetails unmarshalAddressDetails(AddressDetails src) {
		org.citygml4j.model.xal.AddressDetails dest = new AddressDetailsImpl();

		if (src.isSetAddress())
			dest.setAddress(unmarshalAddress(src.getAddress()));

		if (src.isSetAddressDetailsKey())
			dest.setAddressDetailsKey(src.getAddressDetailsKey());

		if (src.isSetAddressLines())
			dest.setAddressLines(unmarshalAddressLines(src.getAddressLines()));

		if (src.isSetAddressType())
			dest.setAddressType(src.getAddressType());

		if (src.isSetAdministrativeArea())
			dest.setAdministrativeArea(unmarshalAdministrativeArea(src.getAdministrativeArea()));

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetCountry())
			dest.setCountry(unmarshalCountry(src.getCountry()));

		if (src.isSetCurrentStatus())
			dest.setCurrentStatus(src.getCurrentStatus());

		if (src.isSetLocality())
			dest.setLocality(unmarshalLocality(src.getLocality()));

		if (src.isSetPostalServiceElements())
			dest.setPostalServiceElements(unmarshalPostalServiceElements(src.getPostalServiceElements()));

		if (src.isSetThoroughfare())
			dest.setThoroughfare(unmarshalThoroughfare(src.getThoroughfare()));

		if (src.isSetUsage())
			dest.setUsage(src.getUsage());

		if (src.isSetValidFromDate())
			dest.setValidFromDate(src.getValidFromDate());

		if (src.isSetValidToDate())
			dest.setValidToDate(src.getValidToDate());		

		return dest;
	}

	public AddressIdentifier unmarshalAddressIdentifier(AddressDetails.PostalServiceElements.AddressIdentifier src) {
		AddressIdentifier dest = new AddressIdentifierImpl();

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetIdentifierType())
			dest.setIdentifierType(src.getIdentifierType());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public AddressLatitude unmarshalAddressLatitude(AddressDetails.PostalServiceElements.AddressLatitude src) {
		AddressLatitude dest = new AddressLatitudeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public AddressLatitudeDirection unmarshalAddressLatitudeDirection(AddressDetails.PostalServiceElements.AddressLatitudeDirection src) {
		AddressLatitudeDirection dest = new AddressLatitudeDirectionImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public AddressLine unmarshalAddressLine(AddressLineElement src) {
		AddressLine dest = new AddressLineImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public AddressLines unmarshalAddressLines(AddressLinesType src) {
		AddressLines dest = new AddressLinesImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		return dest;
	}

	public AddressLongitude unmarshalAddressLongitude(AddressDetails.PostalServiceElements.AddressLongitude src) {
		AddressLongitude dest = new AddressLongitudeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public AddressLongitudeDirection unmarshalAddressLongitudeDirection(AddressDetails.PostalServiceElements.AddressLongitudeDirection src) {
		AddressLongitudeDirection dest = new AddressLongitudeDirectionImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public AdministrativeArea unmarshalAdministrativeArea(AdministrativeAreaElement src) {
		AdministrativeArea dest = new AdministrativeAreaImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetAdministrativeAreaName()) {
			for (AdministrativeAreaElement.AdministrativeAreaName administrativeAreaName : src.getAdministrativeAreaName())
				dest.addAdministrativeAreaName(unmarshalAdministrativeAreaName(administrativeAreaName));
		}

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetLocality())
			dest.setLocality(unmarshalLocality(src.getLocality()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostOffice())
			dest.setPostOffice(unmarshalPostOffice(src.getPostOffice()));

		if (src.isSetSubAdministrativeArea())
			dest.setSubAdministrativeArea(unmarshalSubAdministrativeArea(src.getSubAdministrativeArea()));

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetUsageType())
			dest.setUsageType(src.getUsageType());

		return dest;
	}

	public AdministrativeAreaName unmarshalAdministrativeAreaName(AdministrativeAreaElement.AdministrativeAreaName src) {
		AdministrativeAreaName dest = new AdministrativeAreaNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public Barcode unmarshalBarcode(AddressDetails.PostalServiceElements.Barcode src) {
		Barcode dest = new BarcodeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public BuildingName unmarshalBuildingName(BuildingNameType src) {
		BuildingName dest = new BuildingNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetTypeOccurrence())
			dest.setTypeOccurrence(src.getTypeOccurrence());

		return dest;
	}

	public Country unmarshalCountry(AddressDetails.Country src) {
		Country dest = new CountryImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetAdministrativeArea())
			dest.setAdministrativeArea(unmarshalAdministrativeArea(src.getAdministrativeArea()));

		if (src.isSetCountryName()) {
			for (CountryNameElement countryName : src.getCountryName())
				dest.addCountryName(unmarshalCountryName(countryName));
		}

		if (src.isSetCountryNameCode()) {
			for (AddressDetails.Country.CountryNameCode countryNameCode : src.getCountryNameCode())
				dest.addCountryNameCode(unmarshalCountryNameCode(countryNameCode));
		}

		if (src.isSetLocality())
			dest.setLocality(unmarshalLocality(src.getLocality()));

		if (src.isSetThoroughfare())
			dest.setThoroughfare(unmarshalThoroughfare(src.getThoroughfare()));		

		return dest;
	}

	public CountryName unmarshalCountryName(CountryNameElement src) {
		CountryName dest = new CountryNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public CountryNameCode unmarshalCountryNameCode(AddressDetails.Country.CountryNameCode src) {
		CountryNameCode dest = new CountryNameCodeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetScheme())
			dest.setScheme(src.getScheme());

		return dest;
	}

	public Department unmarshalDepartment(DepartmentElement src) {
		Department dest = new DepartmentImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetDepartmentName()) {
			for (DepartmentElement.DepartmentName departmentName : src.getDepartmentName())
				dest.addDepartmentName(unmarshalDepartmentName(departmentName));
		}

		if (src.isSetMailStop())
			dest.setMailStop(unmarshalMailStop(src.getMailStop()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public DepartmentName unmarshalDepartmentName(DepartmentElement.DepartmentName src) {
		DepartmentName dest = new DepartmentNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public DependentLocality unmarshalDependentLocality(DependentLocalityType src) {
		DependentLocality dest = new DependentLocalityImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetConnector())
			dest.setConnector(src.getConnector());

		if (src.isSetDependentLocality())
			dest.setDependentLocality(unmarshalDependentLocality(src.getDependentLocality()));

		if (src.isSetDependentLocalityName()) {
			for (DependentLocalityType.DependentLocalityName dependentLocalityName : src.getDependentLocalityName())
				dest.addDependentLocalityName(unmarshalDependentLocalityName(dependentLocalityName));
		}

		if (src.isSetDependentLocalityNumber())
			dest.setDependentLocalityNumber(unmarshalDependentLocalityNumber(src.getDependentLocalityNumber()));

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetLargeMailUser())
			dest.setLargeMailUser(unmarshalLargeMailUser(src.getLargeMailUser()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostalRoute())
			dest.setPostalRoute(unmarshalPostalRoute(src.getPostalRoute()));

		if (src.isSetPostBox())
			dest.setPostBox(unmarshalPostBox(src.getPostBox()));

		if (src.isSetPostOffice())
			dest.setPostOffice(unmarshalPostOffice(src.getPostOffice()));

		if (src.isSetPremise())
			dest.setPremise(unmarshalPremise(src.getPremise()));

		if (src.isSetThoroughfare())
			dest.setThoroughfare(unmarshalThoroughfare(src.getThoroughfare()));

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetUsageType())
			dest.setUsageType(src.getUsageType());

		return dest;
	}

	public DependentLocalityName unmarshalDependentLocalityName(DependentLocalityType.DependentLocalityName src) {
		DependentLocalityName dest = new DependentLocalityNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public DependentLocalityNumber unmarshalDependentLocalityNumber(DependentLocalityType.DependentLocalityNumber src) {
		DependentLocalityNumber dest = new DependentLocalityNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetNameNumberOccurrence())
			dest.setNameNumberOccurrence(src.getNameNumberOccurrence());

		return dest;
	}

	public DependentThoroughfare unmarshalDependentThoroughfare(ThoroughfareElement.DependentThoroughfare src) {
		DependentThoroughfare dest = new DependentThoroughfareImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetThoroughfareLeadingType())
			dest.setThoroughfareLeadingType(unmarshalThoroughfareLeadingType(src.getThoroughfareLeadingType()));

		if (src.isSetThoroughfareName()) {
			for (ThoroughfareNameType thoroughfareName : src.getThoroughfareName())
				dest.addThoroughfareName(unmarshalThoroughfareName(thoroughfareName));
		}

		if (src.isSetThoroughfarePostDirection())
			dest.setThoroughfarePostDirection(unmarshalThoroughfarePostDirection(src.getThoroughfarePostDirection()));

		if (src.isSetThoroughfarePreDirection())
			dest.setThoroughfarePreDirection(unmarshalThoroughfarePreDirection(src.getThoroughfarePreDirection()));

		if (src.isSetThoroughfareTrailingType())
			dest.setThoroughfareTrailingType(unmarshalThoroughfareTrailingType(src.getThoroughfareTrailingType()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public EndorsementLineCode unmarshalEndorsementLineCode(AddressDetails.PostalServiceElements.EndorsementLineCode src) {
		EndorsementLineCode dest = new EndorsementLineCodeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public Firm unmarshalFirm(FirmType src) {
		Firm dest = new FirmImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetDepartment()) {
			for (DepartmentElement department : src.getDepartment())
				dest.addDepartment(unmarshalDepartment(department));
		}

		if (src.isSetFirmName()) {
			for (FirmType.FirmName firmName : src.getFirmName())
				dest.addFirmName(unmarshalFirmName(firmName));
		}

		if (src.isSetMailStop())
			dest.setMailStop(unmarshalMailStop(src.getMailStop()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public FirmName unmarshalFirmName(FirmType.FirmName src) {
		FirmName dest = new FirmNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public KeyLineCode unmarshalKeyLineCode(AddressDetails.PostalServiceElements.KeyLineCode src) {
		KeyLineCode dest = new KeyLineCodeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public LargeMailUser unmarshalLargeMailUser(LargeMailUserType src) {
		LargeMailUser dest = new LargeMailUserImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetBuildingName()) {
			for (BuildingNameType buildingName : src.getBuildingName())
				dest.addBuildingName(unmarshalBuildingName(buildingName));
		}

		if (src.isSetDepartment())
			dest.setDepartment(unmarshalDepartment(src.getDepartment()));

		if (src.isSetLargeMailUserIdentifier())
			dest.setLargeMailUserIdentifier(unmarshalLargeMailUserIdentifier(src.getLargeMailUserIdentifier()));

		if (src.isSetLargeMailUserName()) {
			for (LargeMailUserType.LargeMailUserName largeMailUserName : src.getLargeMailUserName())
				dest.addLargeMailUserName(unmarshalLargeMailUserName(largeMailUserName));
		}

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostBox())
			dest.setPostBox(unmarshalPostBox(src.getPostBox()));

		if (src.isSetThoroughfare())
			dest.setThoroughfare(unmarshalThoroughfare(src.getThoroughfare()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public LargeMailUserIdentifier unmarshalLargeMailUserIdentifier(LargeMailUserType.LargeMailUserIdentifier src) {
		LargeMailUserIdentifier dest = new LargeMailUserIdentifierImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		return dest;
	}

	public LargeMailUserName unmarshalLargeMailUserName(LargeMailUserType.LargeMailUserName src) {
		LargeMailUserName dest = new LargeMailUserNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public Locality unmarshalLocality(LocalityElement src) {
		Locality dest = new LocalityImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetDependentLocality())
			dest.setDependentLocality(unmarshalDependentLocality(src.getDependentLocality()));

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetLargeMailUser())
			dest.setLargeMailUser(unmarshalLargeMailUser(src.getLargeMailUser()));

		if (src.isSetLocalityName()) {
			for (LocalityElement.LocalityName localityName : src.getLocalityName())
				dest.addLocalityName(unmarshalLocalityName(localityName));
		}

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostalRoute())
			dest.setPostalRoute(unmarshalPostalRoute(src.getPostalRoute()));

		if (src.isSetPostBox())
			dest.setPostBox(unmarshalPostBox(src.getPostBox()));

		if (src.isSetPostOffice())
			dest.setPostOffice(unmarshalPostOffice(src.getPostOffice()));

		if (src.isSetPremise())
			dest.setPremise(unmarshalPremise(src.getPremise()));

		if (src.isSetThoroughfare())
			dest.setThoroughfare(unmarshalThoroughfare(src.getThoroughfare()));

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetUsageType())
			dest.setUsageType(src.getUsageType());

		return dest;
	}

	public LocalityName unmarshalLocalityName(LocalityElement.LocalityName src) {
		LocalityName dest = new LocalityNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public MailStop unmarshalMailStop(MailStopType src) {
		MailStop dest = new MailStopImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetMailStopName())
			dest.setMailStopName(unmarshalMailStopName(src.getMailStopName()));

		if (src.isSetMailStopNumber())
			dest.setMailStopNumber(unmarshalMailStopNumber(src.getMailStopNumber()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public MailStopName unmarshalMailStopName(MailStopType.MailStopName src) {
		MailStopName dest = new MailStopNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public MailStopNumber unmarshalMailStopNumber(MailStopType.MailStopNumber src) {
		MailStopNumber dest = new MailStopNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetNameNumberSeparator())
			dest.setNameNumberSeparator(src.getNameNumberSeparator());

		return dest;
	}

	public PostalCode unmarshalPostalCode(PostalCodeElement src) {
		PostalCode dest = new PostalCodeImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetPostalCodeNumber()) {
			for (PostalCodeElement.PostalCodeNumber postalCodeNumber : src.getPostalCodeNumber())
				dest.addPostalCodeNumber(unmarshalPostalCodeNumber(postalCodeNumber));
		}

		if (src.isSetPostalCodeNumberExtension()) {
			for (PostalCodeElement.PostalCodeNumberExtension postalCodeNumberExtension : src.getPostalCodeNumberExtension())
				dest.addPostalCodeNumberExtension(unmarshalPostalCodeNumberExtension(postalCodeNumberExtension));
		}

		if (src.isSetPostTown())
			dest.setPostTown(unmarshalPostTown(src.getPostTown()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostalCodeNumber unmarshalPostalCodeNumber(PostalCodeElement.PostalCodeNumber src) {
		PostalCodeNumber dest = new PostalCodeNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostalCodeNumberExtension unmarshalPostalCodeNumberExtension(PostalCodeElement.PostalCodeNumberExtension src) {
		PostalCodeNumberExtension dest = new PostalCodeNumberExtensionImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberExtensionSeparator())
			dest.setNumberExtensionSeparator(src.getNumberExtensionSeparator());

		return dest;
	}

	public PostalRoute unmarshalPostalRoute(PostalRouteType src) {
		PostalRoute dest = new PostalRouteImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetPostalRouteName()) {
			for (PostalRouteType.PostalRouteName postalRouteName : src.getPostalRouteName())
				dest.addPostalRouteName(unmarshalPostalRouteName(postalRouteName));
		}

		if (src.isSetPostalRouteNumber())
			dest.setPostalRouteNumber(unmarshalPostalRouteNumber(src.getPostalRouteNumber()));

		if (src.isSetPostBox())
			dest.setPostBox(unmarshalPostBox(src.getPostBox()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostalRouteName unmarshalPostalRouteName(PostalRouteType.PostalRouteName src) {
		PostalRouteName dest = new PostalRouteNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostalRouteNumber unmarshalPostalRouteNumber(PostalRouteType.PostalRouteNumber src) {
		PostalRouteNumber dest = new PostalRouteNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public PostalServiceElements unmarshalPostalServiceElements(AddressDetails.PostalServiceElements src) {
		PostalServiceElements dest = new PostalServiceElementsImpl();

		if (src.isSetAddressIdentifier()) {
			for (AddressDetails.PostalServiceElements.AddressIdentifier addressIdentifier : src.getAddressIdentifier())
				dest.addAddressIdentifier(unmarshalAddressIdentifier(addressIdentifier));
		}

		if (src.isSetAddressLatitude())
			dest.setAddressLatitude(unmarshalAddressLatitude(src.getAddressLatitude()));

		if (src.isSetAddressLatitudeDirection())
			dest.setAddressLatitudeDirection(unmarshalAddressLatitudeDirection(src.getAddressLatitudeDirection()));

		if (src.isSetAddressLongitude())
			dest.setAddressLongitude(unmarshalAddressLongitude(src.getAddressLongitude()));

		if (src.isSetAddressLongitudeDirection())
			dest.setAddressLongitudeDirection(unmarshalAddressLongitudeDirection(src.getAddressLongitudeDirection()));

		if (src.isSetBarcode())
			dest.setBarcode(unmarshalBarcode(src.getBarcode()));

		if (src.isSetEndorsementLineCode())
			dest.setEndorsementLineCode(unmarshalEndorsementLineCode(src.getEndorsementLineCode()));

		if (src.isSetKeyLineCode())
			dest.setKeyLineCode(unmarshalKeyLineCode(src.getKeyLineCode()));

		if (src.isSetSortingCode())
			dest.setSortingCode(unmarshalSortingCode(src.getSortingCode()));

		if (src.isSetSupplementaryPostalServiceData()) {
			for (AddressDetails.PostalServiceElements.SupplementaryPostalServiceData supplementaryPostalServiceData : src.getSupplementaryPostalServiceData())
				dest.addSupplementaryPostalServiceData(unmarshalSupplementaryPostalServiceData(supplementaryPostalServiceData));
		}

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostBox unmarshalPostBox(PostBoxElement src) {
		PostBox dest = new PostBoxImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetFirm())
			dest.setFirm(unmarshalFirm(src.getFirm()));

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostBoxNumber())
			dest.setPostBoxNumber(unmarshalPostBoxNumber(src.getPostBoxNumber()));

		if (src.isSetPostBoxNumberExtension())
			dest.setPostBoxNumberExtension(unmarshalPostBoxNumberExtension(src.getPostBoxNumberExtension()));

		if (src.isSetPostBoxNumberPrefix())
			dest.setPostBoxNumberPrefix(unmarshalPostBoxNumberPrefix(src.getPostBoxNumberPrefix()));

		if (src.isSetPostBoxNumberSuffix())
			dest.setPostBoxNumberSuffix(unmarshalPostBoxNumberSuffix(src.getPostBoxNumberSuffix()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostBoxNumber unmarshalPostBoxNumber(PostBoxElement.PostBoxNumber src) {
		PostBoxNumber dest = new PostBoxNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public PostBoxNumberExtension unmarshalPostBoxNumberExtension(PostBoxElement.PostBoxNumberExtension src) {
		PostBoxNumberExtension dest = new PostBoxNumberExtensionImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetNumberExtensionSeparator())
			dest.setNumberExtensionSeparator(src.getNumberExtensionSeparator());

		return dest;
	}

	public PostBoxNumberPrefix unmarshalPostBoxNumberPrefix(PostBoxElement.PostBoxNumberPrefix src) {
		PostBoxNumberPrefix dest = new PostBoxNumberPrefixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetNumberPrefixSeparator())
			dest.setNumberPrefixSeparator(src.getNumberPrefixSeparator());

		return dest;
	}

	public PostBoxNumberSuffix unmarshalPostBoxNumberSuffix(PostBoxElement.PostBoxNumberSuffix src) {
		PostBoxNumberSuffix dest = new PostBoxNumberSuffixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetNumberSuffixSeparator())
			dest.setNumberSuffixSeparator(src.getNumberSuffixSeparator());

		return dest;
	}

	public PostOffice unmarshalPostOffice(PostOfficeElement src) {
		PostOffice dest = new PostOfficeImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostalRoute())
			dest.setPostalRoute(unmarshalPostalRoute(src.getPostalRoute()));

		if (src.isSetPostBox())
			dest.setPostBox(unmarshalPostBox(src.getPostBox()));

		if (src.isSetPostOfficeName()) {
			for (PostOfficeElement.PostOfficeName postOfficeName : src.getPostOfficeName())
				dest.addPostOfficeName(unmarshalPostOfficeName(postOfficeName));
		}

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostOfficeName unmarshalPostOfficeName(PostOfficeElement.PostOfficeName src) {
		PostOfficeName dest = new PostOfficeNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostOfficeNumber unmarshalPostOfficeNumber(PostOfficeElement.PostOfficeNumber src) {
		PostOfficeNumber dest = new PostOfficeNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetIndicatorOccurrence())
			dest.setIndicatorOccurrence(src.getIndicatorOccurrence());

		return dest;
	}

	public PostTown unmarshalPostTown(PostalCodeElement.PostTown src) {
		PostTown dest = new PostTownImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetPostTownName()) {
			for (PostalCodeElement.PostTown.PostTownName postTownName : src.getPostTownName())
				dest.addPostTownName(unmarshalPostTownName(postTownName));
		}

		if (src.isSetPostTownSuffix())
			dest.setPostTownSuffix(unmarshalPostTownSuffix(src.getPostTownSuffix()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostTownName unmarshalPostTownName(PostalCodeElement.PostTown.PostTownName src) {
		PostTownName dest = new PostTownNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PostTownSuffix unmarshalPostTownSuffix(PostalCodeElement.PostTown.PostTownSuffix src) {
		PostTownSuffix dest = new PostTownSuffixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public Premise unmarshalPremise(PremiseElement src) {
		Premise dest = new PremiseImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetBuildingName()) {
			for (BuildingNameType buildingName : src.getBuildingName())
				dest.addBuildingName(unmarshalBuildingName(buildingName));
		}

		if (src.isSetFirm())
			dest.setFirm(unmarshalFirm(src.getFirm()));

		if (src.isSetMailStop())
			dest.setMailStop(unmarshalMailStop(src.getMailStop()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPremise())
			dest.setPremise(unmarshalPremise(src.getPremise()));

		if (src.isSetPremiseDependency())
			dest.setPremiseDependency(src.getPremiseDependency());

		if (src.isSetPremiseDependencyType())
			dest.setPremiseDependencyType(src.getPremiseDependencyType());

		if (src.isSetPremiseLocation())
			dest.setPremiseLocation(unmarshalPremiseLocation(src.getPremiseLocation()));

		if (src.isSetPremiseName()) {
			for (PremiseElement.PremiseName premiseName : src.getPremiseName())
				dest.addPremiseName(unmarshalPremiseName(premiseName));
		}

		if (src.isSetPremiseNumber()) {
			for (PremiseNumberElement premiseNumber : src.getPremiseNumber())
				dest.addPremiseNumber(unmarshalPremiseNumber(premiseNumber));
		}

		if (src.isSetPremiseNumberPrefix()) {
			for (PremiseNumberPrefixElement premiseNumberPrefix : src.getPremiseNumberPrefix())
				dest.addPremiseNumberPrefix(unmarshalPremiseNumberPrefix(premiseNumberPrefix));
		}

		if (src.isSetPremiseNumberSuffix()) {
			for (PremiseNumberSuffixElement premiseNumberSuffix : src.getPremiseNumberSuffix())
				dest.addPremiseNumberSuffix(unmarshalPremiseNumberSuffix(premiseNumberSuffix));
		}

		if (src.isSetPremiseNumberRange())
			dest.setPremiseNumberRange(unmarshalPremiseNumberRange(src.getPremiseNumberRange()));

		if (src.isSetPremiseThoroughfareConnector())
			dest.setPremiseThoroughfareConnector(src.getPremiseThoroughfareConnector());

		if (src.isSetSubPremise()) {
			for (SubPremiseType subPremise : src.getSubPremise())
				dest.addSubPremise(unmarshalSubPremise(subPremise));
		}

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public PremiseLocation unmarshalPremiseLocation(PremiseElement.PremiseLocation src) {
		PremiseLocation dest = new PremiseLocationImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public PremiseName unmarshalPremiseName(PremiseElement.PremiseName src) {
		PremiseName dest = new PremiseNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetTypeOccurrence())
			dest.setTypeOccurrence(src.getTypeOccurrence());

		return dest;
	}

	public PremiseNumber unmarshalPremiseNumber(PremiseNumberElement src) {
		PremiseNumber dest = new PremiseNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberType())
			dest.setType(src.getNumberType());

		if (src.isSetNumberTypeOccurrence())
			dest.setNumberTypeOccurrence(src.getNumberTypeOccurrence());

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetIndicatorOccurrence())
			dest.setIndicatorOccurrence(src.getIndicatorOccurrence());

		return dest;
	}

	public PremiseNumberPrefix unmarshalPremiseNumberPrefix(PremiseNumberPrefixElement src) {
		PremiseNumberPrefix dest = new PremiseNumberPrefixImpl();

		if (src.isSetValue())
			dest.setValue(src.getValue());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberPrefixSeparator())
			dest.setNumberPrefixSeparator(src.getNumberPrefixSeparator());

		return dest;
	}

	public PremiseNumberRange unmarshalPremiseNumberRange(PremiseElement.PremiseNumberRange src) {
		PremiseNumberRange dest = new PremiseNumberRangeImpl();

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetIndicatorOccurence())
			dest.setIndicatorOccurence(src.getIndicatorOccurence());

		if (src.isSetNumberRangeOccurence())
			dest.setNumberRangeOccurence(src.getNumberRangeOccurence());

		if (src.isSetPremiseNumberRangeFrom())
			dest.setPremiseNumberRangeFrom(unmarshalPremiseNumberRangeFrom(src.getPremiseNumberRangeFrom()));

		if (src.isSetPremiseNumberRangeTo())
			dest.setPremiseNumberRangeTo(unmarshalPremiseNumberRangeTo(src.getPremiseNumberRangeTo()));

		if (src.isSetRangeType())
			dest.setRangeType(src.getRangeType());

		if (src.isSetSeparator())
			dest.setSeparator(src.getSeparator());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;		
	}

	public PremiseNumberRangeFrom unmarshalPremiseNumberRangeFrom(PremiseElement.PremiseNumberRange.PremiseNumberRangeFrom src) {
		PremiseNumberRangeFrom dest = new PremiseNumberRangeFromImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetPremiseNumber()) {
			for (PremiseNumberElement premiseNumber : src.getPremiseNumber())
				dest.addPremiseNumber(unmarshalPremiseNumber(premiseNumber));
		}

		if (src.isSetPremiseNumberPrefix()) {
			for (PremiseNumberPrefixElement premiseNumberPrefix : src.getPremiseNumberPrefix())
				dest.addPremiseNumberPrefix(unmarshalPremiseNumberPrefix(premiseNumberPrefix));
		}

		if (src.isSetPremiseNumberSuffix()) {
			for (PremiseNumberSuffixElement premiseNumberSuffix : src.getPremiseNumberSuffix())
				dest.addPremiseNumberSuffix(unmarshalPremiseNumberSuffix(premiseNumberSuffix));
		}

		return dest;
	}

	public PremiseNumberRangeTo unmarshalPremiseNumberRangeTo(PremiseElement.PremiseNumberRange.PremiseNumberRangeTo src) {
		PremiseNumberRangeTo dest = new PremiseNumberRangeToImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetPremiseNumber()) {
			for (PremiseNumberElement premiseNumber : src.getPremiseNumber())
				dest.addPremiseNumber(unmarshalPremiseNumber(premiseNumber));
		}

		if (src.isSetPremiseNumberPrefix()) {
			for (PremiseNumberPrefixElement premiseNumberPrefix : src.getPremiseNumberPrefix())
				dest.addPremiseNumberPrefix(unmarshalPremiseNumberPrefix(premiseNumberPrefix));
		}

		if (src.isSetPremiseNumberSuffix()) {
			for (PremiseNumberSuffixElement premiseNumberSuffix : src.getPremiseNumberSuffix())
				dest.addPremiseNumberSuffix(unmarshalPremiseNumberSuffix(premiseNumberSuffix));
		}

		return dest;
	}

	public PremiseNumberSuffix unmarshalPremiseNumberSuffix(PremiseNumberSuffixElement src) {
		PremiseNumberSuffix dest = new PremiseNumberSuffixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberSuffixSeparator())
			dest.setNumberSuffixSeparator(src.getNumberSuffixSeparator());

		return dest;
	}

	public SortingCode unmarshalSortingCode(AddressDetails.PostalServiceElements.SortingCode src) {
		SortingCode dest = new SortingCodeImpl();

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public SubAdministrativeArea unmarshalSubAdministrativeArea(AdministrativeAreaElement.SubAdministrativeArea src) {
		SubAdministrativeArea dest = new SubAdministrativeAreaImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetLocality())
			dest.setLocality(unmarshalLocality(src.getLocality()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPostOffice())
			dest.setPostOffice(unmarshalPostOffice(src.getPostOffice()));

		if (src.isSetSubAdministrativeAreaName()) {
			for (AdministrativeAreaElement.SubAdministrativeArea.SubAdministrativeAreaName subAdministrativeAreaName : src.getSubAdministrativeAreaName())
				dest.addSubAdministrativeAreaName(unmarshalSubAdministrativeAreaName(subAdministrativeAreaName));
		}

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetUsageType())
			dest.setUsageType(src.getUsageType());

		return dest;
	}

	public SubAdministrativeAreaName unmarshalSubAdministrativeAreaName(AdministrativeAreaElement.SubAdministrativeArea.SubAdministrativeAreaName src) {
		SubAdministrativeAreaName dest = new SubAdministrativeAreaNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public SubPremise unmarshalSubPremise(SubPremiseType src) {
		SubPremise dest = new SubPremiseImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetBuildingName()) {
			for (BuildingNameType buildingName : src.getBuildingName())
				dest.addBuildingName(unmarshalBuildingName(buildingName));
		}

		if (src.isSetFirm())
			dest.setFirm(unmarshalFirm(src.getFirm()));

		if (src.isSetMailStop())
			dest.setMailStop(unmarshalMailStop(src.getMailStop()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetSubPremise())
			dest.setSubPremise(unmarshalSubPremise(src.getSubPremise()));

		if (src.isSetSubPremiseLocation())
			dest.setSubPremiseLocation(unmarshalSubPremiseLocation(src.getSubPremiseLocation()));

		if (src.isSetSubPremiseName()) {
			for (SubPremiseType.SubPremiseName subPremiseName : src.getSubPremiseName())
				dest.addSubPremiseName(unmarshalSubPremiseName(subPremiseName));
		}

		if (src.isSetSubPremiseNumber()) {
			for (SubPremiseType.SubPremiseNumber subPremiseNumber : src.getSubPremiseNumber())
				dest.addSubPremiseNumber(unmarshalSubPremiseNumber(subPremiseNumber));
		}

		if (src.isSetSubPremiseNumberPrefix()) {
			for (SubPremiseType.SubPremiseNumberPrefix subPremiseNumberPrefix : src.getSubPremiseNumberPrefix())
				dest.addSubPremiseNumberPrefix(unmarshalSubPremiseNumberPrefix(subPremiseNumberPrefix));
		}

		if (src.isSetSubPremiseNumberSuffix()) {
			for (SubPremiseType.SubPremiseNumberSuffix subPremiseNumberSuffix : src.getSubPremiseNumberSuffix())
				dest.addSubPremiseNumberSuffix(unmarshalSubPremiseNumberSuffix(subPremiseNumberSuffix));
		}

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public SubPremiseLocation unmarshalSubPremiseLocation(SubPremiseType.SubPremiseLocation src) {
		SubPremiseLocation dest = new SubPremiseLocationImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public SubPremiseName unmarshalSubPremiseName(SubPremiseType.SubPremiseName src) {
		SubPremiseName dest = new SubPremiseNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetTypeOccurrence())
			dest.setTypeOccurrence(src.getTypeOccurrence());

		return dest;
	}

	public SubPremiseNumber unmarshalSubPremiseNumber(SubPremiseType.SubPremiseNumber src) {
		SubPremiseNumber dest = new SubPremiseNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetIndicatorOccurrence())
			dest.setIndicatorOccurrence(src.getIndicatorOccurrence());

		if (src.isSetNumberTypeOccurrence())
			dest.setNumberTypeOccurrence(src.getNumberTypeOccurrence());

		if (src.isSetPremiseNumberSeparator())
			dest.setPremiseNumberSeparator(src.getPremiseNumberSeparator());

		return dest;
	}

	public SubPremiseNumberPrefix unmarshalSubPremiseNumberPrefix(SubPremiseType.SubPremiseNumberPrefix src) {
		SubPremiseNumberPrefix dest = new SubPremiseNumberPrefixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberPrefixSeparator())
			dest.setNumberPrefixSeparator(src.getNumberPrefixSeparator());

		return dest;
	}

	public SubPremiseNumberSuffix unmarshalSubPremiseNumberSuffix(SubPremiseType.SubPremiseNumberSuffix src) {
		SubPremiseNumberSuffix dest = new SubPremiseNumberSuffixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberSuffixSeparator())
			dest.setNumberSuffixSeparator(src.getNumberSuffixSeparator());

		return dest;
	}

	public SupplementaryPostalServiceData unmarshalSupplementaryPostalServiceData(AddressDetails.PostalServiceElements.SupplementaryPostalServiceData src) {
		SupplementaryPostalServiceData dest = new SupplementaryPostalServiceDataImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public Thoroughfare unmarshalThoroughfare(ThoroughfareElement src) {
		Thoroughfare dest = new ThoroughfareImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetDependentLocality())
			dest.setDependentLocality(unmarshalDependentLocality(src.getDependentLocality()));

		if (src.isSetDependentThoroughfare())
			dest.setDependentThoroughfare(unmarshalDependentThoroughfare(src.getDependentThoroughfare()));

		if (src.isSetDependentThoroughfares())
			dest.setDependentThoroughfares(src.getDependentThoroughfares());

		if (src.isSetDependentThoroughfaresConnector())
			dest.setDependentThoroughfaresConnector(src.getDependentThoroughfaresConnector());

		if (src.isSetDependentThoroughfaresIndicator())
			dest.setDependentThoroughfaresIndicator(src.getDependentThoroughfaresIndicator());

		if (src.isSetDependentThoroughfaresType())
			dest.setDependentThoroughfaresType(src.getDependentThoroughfaresType());

		if (src.isSetFirm())
			dest.setFirm(unmarshalFirm(src.getFirm()));

		if (src.isSetPostalCode())
			dest.setPostalCode(unmarshalPostalCode(src.getPostalCode()));

		if (src.isSetPremise())
			dest.setPremise(unmarshalPremise(src.getPremise()));

		if (src.isSetThoroughfareLeadingType())
			dest.setThoroughfareLeadingType(unmarshalThoroughfareLeadingType(src.getThoroughfareLeadingType()));

		if (src.isSetThoroughfareName()) {
			for (ThoroughfareNameType thoroughfareName : src.getThoroughfareName())
				dest.addThoroughfareName(unmarshalThoroughfareName(thoroughfareName));
		}

		if (src.isSetThoroughfareNumberOrThoroughfareNumberRange()) {
			for (Object content : src.getThoroughfareNumberOrThoroughfareNumberRange()) {
				XAL value = unmarshal(content);
				if (value instanceof ThoroughfareNumber)
					dest.addThoroughfareNumber((ThoroughfareNumber)value);
				else if (value instanceof ThoroughfareNumberRange)
					dest.addThoroughfareNumberRange((ThoroughfareNumberRange)value);
			}
		}

		if (src.isSetThoroughfareNumberPrefix()) {
			for (ThoroughfareNumberPrefixElement thoroughfareNumberPrefix : src.getThoroughfareNumberPrefix())
				dest.addThoroughfareNumberPrefix(unmarshalThoroughfareNumberPrefix(thoroughfareNumberPrefix));
		}

		if (src.isSetThoroughfareNumberSuffix()) {
			for (ThoroughfareNumberSuffixElement thoroughfareNumberSuffix : src.getThoroughfareNumberSuffix())
				dest.addThoroughfareNumberSuffix(unmarshalThoroughfareNumberSuffix(thoroughfareNumberSuffix));
		}

		if (src.isSetThoroughfarePostDirection())
			dest.setThoroughfarePostDirection(unmarshalThoroughfarePostDirection(src.getThoroughfarePostDirection()));

		if (src.isSetThoroughfarePreDirection())
			dest.setThoroughfarePreDirection(unmarshalThoroughfarePreDirection(src.getThoroughfarePreDirection()));

		if (src.isSetThoroughfareTrailingType())
			dest.setThoroughfareTrailingType(unmarshalThoroughfareTrailingType(src.getThoroughfareTrailingType()));

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public ThoroughfareLeadingType unmarshalThoroughfareLeadingType(ThoroughfareLeadingTypeType src) {
		ThoroughfareLeadingType dest = new ThoroughfareLeadingTypeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public ThoroughfareName unmarshalThoroughfareName(ThoroughfareNameType src) {
		ThoroughfareName dest = new ThoroughfareNameImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public ThoroughfareNumber unmarshalThoroughfareNumber(ThoroughfareNumberElement src) {
		ThoroughfareNumber dest = new ThoroughfareNumberImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetIndicatorOccurrence())
			dest.setIndicatorOccurrence(src.getIndicatorOccurrence());

		if (src.isSetNumberOccurrence())
			dest.setNumberOccurrence(src.getNumberOccurrence());

		if (src.isSetNumberType())
			dest.setNumberType(src.getNumberType());

		return dest;
	}

	public ThoroughfareNumberFrom unmarshalThoroughfareNumberFrom(ThoroughfareElement.ThoroughfareNumberRange.ThoroughfareNumberFrom src) {
		ThoroughfareNumberFrom dest = new ThoroughfareNumberFromImpl();

		if (src.isSetContent()) {
			for (Object content : src.getContent()) {
				if (content instanceof String)
					dest.addString((String)content);
				else {
					XAL value = unmarshal(content);
					if (value instanceof AddressLine)
						dest.addAddressLine((AddressLine)value);
					else if (value instanceof ThoroughfareNumber)
						dest.addThoroughfareNumber((ThoroughfareNumber)value);
					else if (value instanceof ThoroughfareNumberPrefix)
						dest.addThoroughfareNumberPrefix((ThoroughfareNumberPrefix)value);
					else if (value instanceof ThoroughfareNumberSuffix)
						dest.addThoroughfareNumberSuffix((ThoroughfareNumberSuffix)value);
				}
			}
		}

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public ThoroughfareNumberPrefix unmarshalThoroughfareNumberPrefix(ThoroughfareNumberPrefixElement src) {
		ThoroughfareNumberPrefix dest = new ThoroughfareNumberPrefixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberPrefixSeparator())
			dest.setNumberPrefixSeparator(src.getNumberPrefixSeparator());

		return dest;
	}

	public ThoroughfareNumberRange unmarshalThoroughfareNumberRange(ThoroughfareElement.ThoroughfareNumberRange src) {
		ThoroughfareNumberRange dest = new ThoroughfareNumberRangeImpl();

		if (src.isSetAddressLine()) {
			for (AddressLineElement addressLine : src.getAddressLine())
				dest.addAddressLine(unmarshalAddressLine(addressLine));
		}

		if (src.isSetThoroughfareNumberFrom())
			dest.setThoroughfareNumberFrom(unmarshalThoroughfareNumberFrom(src.getThoroughfareNumberFrom()));

		if (src.isSetThoroughfareNumberTo())
			dest.setThoroughfareNumberTo(unmarshalThoroughfareNumberTo(src.getThoroughfareNumberTo()));

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetIndicator())
			dest.setIndicator(src.getIndicator());

		if (src.isSetIndicatorOccurrence())
			dest.setIndicatorOccurrence(src.getIndicatorOccurrence());

		if (src.isSetNumberRangeOccurrence())
			dest.setNumberRangeOccurrence(src.getNumberRangeOccurrence());

		if (src.isSetRangeType())
			dest.setRangeType(src.getRangeType());

		if (src.isSetSeparator())
			dest.setSeparator(src.getSeparator());

		if (src.isSetType())
			dest.setType(src.getType());		

		return dest;
	}

	public ThoroughfareNumberSuffix unmarshalThoroughfareNumberSuffix(ThoroughfareNumberSuffixElement src) {
		ThoroughfareNumberSuffix dest = new ThoroughfareNumberSuffixImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		if (src.isSetNumberSuffixSeparator())
			dest.setNumberSuffixSeparator(src.getNumberSuffixSeparator());

		return dest;
	}

	public ThoroughfareNumberTo unmarshalThoroughfareNumberTo(ThoroughfareElement.ThoroughfareNumberRange.ThoroughfareNumberTo src) {
		ThoroughfareNumberTo dest = new ThoroughfareNumberToImpl();

		if (src.isSetContent()) {
			for (Object content : src.getContent()) {
				if (content instanceof String)
					dest.addString((String)content);
				else {
					XAL value = unmarshal(content);
					if (value instanceof AddressLine)
						dest.addAddressLine((AddressLine)value);
					else if (value instanceof ThoroughfareNumber)
						dest.addThoroughfareNumber((ThoroughfareNumber)value);
					else if (value instanceof ThoroughfareNumberPrefix)
						dest.addThoroughfareNumberPrefix((ThoroughfareNumberPrefix)value);
					else if (value instanceof ThoroughfareNumberSuffix)
						dest.addThoroughfareNumberSuffix((ThoroughfareNumberSuffix)value);
				}
			}
		}

		if (src.isSetCode())
			dest.setCode(src.getCode());

		return dest;
	}

	public ThoroughfarePostDirection unmarshalThoroughfarePostDirection(ThoroughfarePostDirectionType src) {
		ThoroughfarePostDirection dest = new ThoroughfarePostDirectionImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public ThoroughfarePreDirection unmarshalThoroughfarePreDirection(ThoroughfarePreDirectionType src) {
		ThoroughfarePreDirection dest = new ThoroughfarePreDirectionImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

	public ThoroughfareTrailingType unmarshalThoroughfareTrailingType(ThoroughfareTrailingTypeType src) {
		ThoroughfareTrailingType dest = new ThoroughfareTrailingTypeImpl();

		if (src.isSetContent())
			dest.setContent(src.getContent());

		if (src.isSetCode())
			dest.setCode(src.getCode());

		if (src.isSetType())
			dest.setType(src.getType());

		return dest;
	}

}