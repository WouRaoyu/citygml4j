//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.12.21 um 08:38:03 AM CET 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LabelStyleRef
    extends JAXBElement<LabelStylePropertyType>
{

    protected final static QName NAME = new QName("http://www.opengis.net/gml", "labelStyle");

    public LabelStyleRef(LabelStylePropertyType value) {
        super(NAME, ((Class) LabelStylePropertyType.class), null, value);
    }

    public LabelStyleRef() {
        super(NAME, ((Class) LabelStylePropertyType.class), null, null);
    }

}
