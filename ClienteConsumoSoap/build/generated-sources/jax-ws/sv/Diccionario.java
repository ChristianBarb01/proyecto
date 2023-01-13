
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Diccionario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Diccionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Palabra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diccionario", propOrder = {
    "palabra"
})
public class Diccionario {

    @XmlElement(name = "Palabra")
    protected String palabra;

    /**
     * Obtiene el valor de la propiedad palabra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * Define el valor de la propiedad palabra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalabra(String value) {
        this.palabra = value;
    }

}
