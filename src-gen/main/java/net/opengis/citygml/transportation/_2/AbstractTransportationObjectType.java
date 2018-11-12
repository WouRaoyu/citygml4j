//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.12 um 10:17:11 PM CET 
//


package net.opengis.citygml.transportation._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;


/**
 * Type describing the abstract superclass for transportation objects. 
 * 
 * <p>Java-Klasse für AbstractTransportationObjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractTransportationObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/citygml/transportation/2.0}_GenericApplicationPropertyOfTransportationObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTransportationObjectType", propOrder = {
    "_GenericApplicationPropertyOfTransportationObject"
})
@XmlSeeAlso({
    TrafficAreaType.class,
    AuxiliaryTrafficAreaType.class,
    TransportationComplexType.class
})
public abstract class AbstractTransportationObjectType
    extends AbstractCityObjectType
{

    @XmlElementRef(name = "_GenericApplicationPropertyOfTransportationObject", namespace = "http://www.opengis.net/citygml/transportation/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfTransportationObject;

    /**
     * Gets the value of the genericApplicationPropertyOfTransportationObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfTransportationObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfTransportationObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfTransportationObject() {
        if (_GenericApplicationPropertyOfTransportationObject == null) {
            _GenericApplicationPropertyOfTransportationObject = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfTransportationObject;
    }

    public boolean isSet_GenericApplicationPropertyOfTransportationObject() {
        return ((this._GenericApplicationPropertyOfTransportationObject!= null)&&(!this._GenericApplicationPropertyOfTransportationObject.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfTransportationObject() {
        this._GenericApplicationPropertyOfTransportationObject = null;
    }

    public void set_GenericApplicationPropertyOfTransportationObject(List<JAXBElement<Object>> value) {
        this._GenericApplicationPropertyOfTransportationObject = value;
    }

}
