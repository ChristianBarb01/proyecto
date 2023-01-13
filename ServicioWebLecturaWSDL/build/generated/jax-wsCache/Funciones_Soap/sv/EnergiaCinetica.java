
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnergiaCinetica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnergiaCinetica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergiaCinetica", propOrder = {
    "masa",
    "velocidad"
})
public class EnergiaCinetica {

    protected double masa;
    protected double velocidad;

    /**
     * Obtiene el valor de la propiedad masa.
     * 
     */
    public double getMasa() {
        return masa;
    }

    /**
     * Define el valor de la propiedad masa.
     * 
     */
    public void setMasa(double value) {
        this.masa = value;
    }

    /**
     * Obtiene el valor de la propiedad velocidad.
     * 
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * Define el valor de la propiedad velocidad.
     * 
     */
    public void setVelocidad(double value) {
        this.velocidad = value;
    }

}
