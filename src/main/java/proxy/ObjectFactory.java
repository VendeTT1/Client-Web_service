
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConsulterCompte_QNAME = new QName("http://ws/", "consulterCompte");
    private static final QName _ConsulterCompteResponse_QNAME = new QName("http://ws/", "consulterCompteResponse");
    private static final QName _Counvertir_QNAME = new QName("http://ws/", "counvertir");
    private static final QName _CounvertirResponse_QNAME = new QName("http://ws/", "counvertirResponse");
    private static final QName _ListeCompte_QNAME = new QName("http://ws/", "listeCompte");
    private static final QName _ListeCompteResponse_QNAME = new QName("http://ws/", "listeCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterCompte }
     * 
     * @return
     *     the new instance of {@link ConsulterCompte }
     */
    public ConsulterCompte createConsulterCompte() {
        return new ConsulterCompte();
    }

    /**
     * Create an instance of {@link ConsulterCompteResponse }
     * 
     * @return
     *     the new instance of {@link ConsulterCompteResponse }
     */
    public ConsulterCompteResponse createConsulterCompteResponse() {
        return new ConsulterCompteResponse();
    }

    /**
     * Create an instance of {@link Counvertir }
     * 
     * @return
     *     the new instance of {@link Counvertir }
     */
    public Counvertir createCounvertir() {
        return new Counvertir();
    }

    /**
     * Create an instance of {@link CounvertirResponse }
     * 
     * @return
     *     the new instance of {@link CounvertirResponse }
     */
    public CounvertirResponse createCounvertirResponse() {
        return new CounvertirResponse();
    }

    /**
     * Create an instance of {@link ListeCompte }
     * 
     * @return
     *     the new instance of {@link ListeCompte }
     */
    public ListeCompte createListeCompte() {
        return new ListeCompte();
    }

    /**
     * Create an instance of {@link ListeCompteResponse }
     * 
     * @return
     *     the new instance of {@link ListeCompteResponse }
     */
    public ListeCompteResponse createListeCompteResponse() {
        return new ListeCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterCompte")
    public JAXBElement<ConsulterCompte> createConsulterCompte(ConsulterCompte value) {
        return new JAXBElement<>(_ConsulterCompte_QNAME, ConsulterCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterCompteResponse")
    public JAXBElement<ConsulterCompteResponse> createConsulterCompteResponse(ConsulterCompteResponse value) {
        return new JAXBElement<>(_ConsulterCompteResponse_QNAME, ConsulterCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Counvertir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Counvertir }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "counvertir")
    public JAXBElement<Counvertir> createCounvertir(Counvertir value) {
        return new JAXBElement<>(_Counvertir_QNAME, Counvertir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounvertirResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CounvertirResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "counvertirResponse")
    public JAXBElement<CounvertirResponse> createCounvertirResponse(CounvertirResponse value) {
        return new JAXBElement<>(_CounvertirResponse_QNAME, CounvertirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listeCompte")
    public JAXBElement<ListeCompte> createListeCompte(ListeCompte value) {
        return new JAXBElement<>(_ListeCompte_QNAME, ListeCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listeCompteResponse")
    public JAXBElement<ListeCompteResponse> createListeCompteResponse(ListeCompteResponse value) {
        return new JAXBElement<>(_ListeCompteResponse_QNAME, ListeCompteResponse.class, null, value);
    }

}
