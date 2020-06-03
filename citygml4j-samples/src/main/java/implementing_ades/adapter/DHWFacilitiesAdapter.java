/*
 * citygml4j - The Open Source Java API for CityGML
 * https://github.com/citygml4j
 *
 * Copyright 2013-2020 Claus Nagel <claus.nagel@gmail.com>
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

package implementing_ades.adapter;

import implementing_ades.model.DHWFacilities;
import implementing_ades.module.TestADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "DHWFacilities", namespaceURI = TestADEModule.NAMESPACE_1_0)
public class DHWFacilitiesAdapter extends FacilitiesAdapter<DHWFacilities> {

    @Override
    public DHWFacilities createObject(QName name, XMLReader reader) throws ObjectBuildException, XMLReadException {
        return new DHWFacilities();
    }

    @Override
    public Element createElement(DHWFacilities object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        return Element.of(TestADEModule.NAMESPACE_1_0, "DHWFacilities");
    }
}
