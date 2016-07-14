
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _EntrAuto_QNAME = new QName("http://services/", "EntrAuto");
    private final static QName _EntrAutoResponse_QNAME = new QName("http://services/", "EntrAutoResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://services/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://services/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link EntrAutoResponse }
     * 
     */
    public EntrAutoResponse createEntrAutoResponse() {
        return new EntrAutoResponse();
    }

    /**
     * Create an instance of {@link EntrAuto }
     * 
     */
    public EntrAuto createEntrAuto() {
        return new EntrAuto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntrAuto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "EntrAuto")
    public JAXBElement<EntrAuto> createEntrAuto(EntrAuto value) {
        return new JAXBElement<EntrAuto>(_EntrAuto_QNAME, EntrAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntrAutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "EntrAutoResponse")
    public JAXBElement<EntrAutoResponse> createEntrAutoResponse(EntrAutoResponse value) {
        return new JAXBElement<EntrAutoResponse>(_EntrAutoResponse_QNAME, EntrAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
