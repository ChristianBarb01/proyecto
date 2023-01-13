
package sv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv package. 
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

    private final static QName _Potencia_QNAME = new QName("http://sv/", "Potencia");
    private final static QName _Hello_QNAME = new QName("http://sv/", "hello");
    private final static QName _EurodollResponse_QNAME = new QName("http://sv/", "EurodollResponse");
    private final static QName _NumPrimo_QNAME = new QName("http://sv/", "NumPrimo");
    private final static QName _NumPrimoResponse_QNAME = new QName("http://sv/", "NumPrimoResponse");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sv/", "DiccionarioResponse");
    private final static QName _PotenciaResponse_QNAME = new QName("http://sv/", "PotenciaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://sv/", "helloResponse");
    private final static QName _Eurodoll_QNAME = new QName("http://sv/", "Eurodoll");
    private final static QName _Diccionario_QNAME = new QName("http://sv/", "Diccionario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link PotenciaResponse }
     * 
     */
    public PotenciaResponse createPotenciaResponse() {
        return new PotenciaResponse();
    }

    /**
     * Create an instance of {@link NumPrimoResponse }
     * 
     */
    public NumPrimoResponse createNumPrimoResponse() {
        return new NumPrimoResponse();
    }

    /**
     * Create an instance of {@link NumPrimo }
     * 
     */
    public NumPrimo createNumPrimo() {
        return new NumPrimo();
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link Eurodoll }
     * 
     */
    public Eurodoll createEurodoll() {
        return new Eurodoll();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Potencia }
     * 
     */
    public Potencia createPotencia() {
        return new Potencia();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link EurodollResponse }
     * 
     */
    public EurodollResponse createEurodollResponse() {
        return new EurodollResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Potencia")
    public JAXBElement<Potencia> createPotencia(Potencia value) {
        return new JAXBElement<Potencia>(_Potencia_QNAME, Potencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EurodollResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "EurodollResponse")
    public JAXBElement<EurodollResponse> createEurodollResponse(EurodollResponse value) {
        return new JAXBElement<EurodollResponse>(_EurodollResponse_QNAME, EurodollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumPrimo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "NumPrimo")
    public JAXBElement<NumPrimo> createNumPrimo(NumPrimo value) {
        return new JAXBElement<NumPrimo>(_NumPrimo_QNAME, NumPrimo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumPrimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "NumPrimoResponse")
    public JAXBElement<NumPrimoResponse> createNumPrimoResponse(NumPrimoResponse value) {
        return new JAXBElement<NumPrimoResponse>(_NumPrimoResponse_QNAME, NumPrimoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "DiccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "PotenciaResponse")
    public JAXBElement<PotenciaResponse> createPotenciaResponse(PotenciaResponse value) {
        return new JAXBElement<PotenciaResponse>(_PotenciaResponse_QNAME, PotenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eurodoll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Eurodoll")
    public JAXBElement<Eurodoll> createEurodoll(Eurodoll value) {
        return new JAXBElement<Eurodoll>(_Eurodoll_QNAME, Eurodoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

}
