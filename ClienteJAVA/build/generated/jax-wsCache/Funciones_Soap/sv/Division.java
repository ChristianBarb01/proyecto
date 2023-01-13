
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Division complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Division"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valor1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="valor2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Division", propOrder = {
    "valor1",
    "valor2"
})
public class Division {

    protected double valor1;
    protected double valor2;

    /**
     * Obtiene el valor de la propiedad valor1.
     * 
     */
    public double getValor1() {
        return valor1;
    }

    /**
     * Define el valor de la propiedad valor1.
     * 
     */
    public void setValor1(double value) {
        this.valor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad valor2.
     * 
     */
    public double getValor2() {
        return valor2;
    }

    /**
     * Define el valor de la propiedad valor2.
     * 
     */
    public void setValor2(double value) {
        this.valor2 = value;
    }

}
