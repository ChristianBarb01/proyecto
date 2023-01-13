
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Calcular_la_Fuerza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Calcular_la_Fuerza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="acelaracion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calcular_la_Fuerza", propOrder = {
    "masa",
    "acelaracion"
})
public class CalcularLaFuerza {

    protected double masa;
    protected double acelaracion;

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
     * Obtiene el valor de la propiedad acelaracion.
     * 
     */
    public double getAcelaracion() {
        return acelaracion;
    }

    /**
     * Define el valor de la propiedad acelaracion.
     * 
     */
    public void setAcelaracion(double value) {
        this.acelaracion = value;
    }

}
