
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Cargardatos_QNAME = new QName("http://ws/", "Cargardatos");
    private final static QName _CargardatosResponse_QNAME = new QName("http://ws/", "CargardatosResponse");
    private final static QName _Depositar_QNAME = new QName("http://ws/", "Depositar");
    private final static QName _DepositarResponse_QNAME = new QName("http://ws/", "DepositarResponse");
    private final static QName _LoguinAcceso_QNAME = new QName("http://ws/", "LoguinAcceso");
    private final static QName _LoguinAccesoResponse_QNAME = new QName("http://ws/", "LoguinAccesoResponse");
    private final static QName _Registrar_QNAME = new QName("http://ws/", "Registrar");
    private final static QName _RegistrarResponse_QNAME = new QName("http://ws/", "RegistrarResponse");
    private final static QName _Retirar_QNAME = new QName("http://ws/", "Retirar");
    private final static QName _RetirarResponse_QNAME = new QName("http://ws/", "RetirarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cargardatos }
     * 
     */
    public Cargardatos createCargardatos() {
        return new Cargardatos();
    }

    /**
     * Create an instance of {@link CargardatosResponse }
     * 
     */
    public CargardatosResponse createCargardatosResponse() {
        return new CargardatosResponse();
    }

    /**
     * Create an instance of {@link Depositar }
     * 
     */
    public Depositar createDepositar() {
        return new Depositar();
    }

    /**
     * Create an instance of {@link DepositarResponse }
     * 
     */
    public DepositarResponse createDepositarResponse() {
        return new DepositarResponse();
    }

    /**
     * Create an instance of {@link LoguinAcceso }
     * 
     */
    public LoguinAcceso createLoguinAcceso() {
        return new LoguinAcceso();
    }

    /**
     * Create an instance of {@link LoguinAccesoResponse }
     * 
     */
    public LoguinAccesoResponse createLoguinAccesoResponse() {
        return new LoguinAccesoResponse();
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link Retirar }
     * 
     */
    public Retirar createRetirar() {
        return new Retirar();
    }

    /**
     * Create an instance of {@link RetirarResponse }
     * 
     */
    public RetirarResponse createRetirarResponse() {
        return new RetirarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cargardatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Cargardatos")
    public JAXBElement<Cargardatos> createCargardatos(Cargardatos value) {
        return new JAXBElement<Cargardatos>(_Cargardatos_QNAME, Cargardatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargardatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CargardatosResponse")
    public JAXBElement<CargardatosResponse> createCargardatosResponse(CargardatosResponse value) {
        return new JAXBElement<CargardatosResponse>(_CargardatosResponse_QNAME, CargardatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Depositar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Depositar")
    public JAXBElement<Depositar> createDepositar(Depositar value) {
        return new JAXBElement<Depositar>(_Depositar_QNAME, Depositar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "DepositarResponse")
    public JAXBElement<DepositarResponse> createDepositarResponse(DepositarResponse value) {
        return new JAXBElement<DepositarResponse>(_DepositarResponse_QNAME, DepositarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguinAcceso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoguinAcceso")
    public JAXBElement<LoguinAcceso> createLoguinAcceso(LoguinAcceso value) {
        return new JAXBElement<LoguinAcceso>(_LoguinAcceso_QNAME, LoguinAcceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguinAccesoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoguinAccesoResponse")
    public JAXBElement<LoguinAccesoResponse> createLoguinAccesoResponse(LoguinAccesoResponse value) {
        return new JAXBElement<LoguinAccesoResponse>(_LoguinAccesoResponse_QNAME, LoguinAccesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Registrar")
    public JAXBElement<Registrar> createRegistrar(Registrar value) {
        return new JAXBElement<Registrar>(_Registrar_QNAME, Registrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "RegistrarResponse")
    public JAXBElement<RegistrarResponse> createRegistrarResponse(RegistrarResponse value) {
        return new JAXBElement<RegistrarResponse>(_RegistrarResponse_QNAME, RegistrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Retirar")
    public JAXBElement<Retirar> createRetirar(Retirar value) {
        return new JAXBElement<Retirar>(_Retirar_QNAME, Retirar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "RetirarResponse")
    public JAXBElement<RetirarResponse> createRetirarResponse(RetirarResponse value) {
        return new JAXBElement<RetirarResponse>(_RetirarResponse_QNAME, RetirarResponse.class, null, value);
    }

}
