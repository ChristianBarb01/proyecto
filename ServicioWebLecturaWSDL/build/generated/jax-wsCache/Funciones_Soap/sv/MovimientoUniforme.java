
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MovimientoUniforme complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MovimientoUniforme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimientoUniforme", propOrder = {
    "velocidad",
    "tiempo"
})
public class MovimientoUniforme {

    protected double velocidad;
    protected double tiempo;

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

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     */
    public double getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     */
    public void setTiempo(double value) {
        this.tiempo = value;
    }

}
