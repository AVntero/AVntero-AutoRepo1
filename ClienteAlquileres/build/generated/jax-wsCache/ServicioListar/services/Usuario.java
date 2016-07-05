
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomusr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "nomusr",
    "passwd"
})
public class Usuario {

    protected String nomusr;
    protected String passwd;

    /**
     * Obtiene el valor de la propiedad nomusr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomusr() {
        return nomusr;
    }

    /**
     * Define el valor de la propiedad nomusr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomusr(String value) {
        this.nomusr = value;
    }

    /**
     * Obtiene el valor de la propiedad passwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Define el valor de la propiedad passwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswd(String value) {
        this.passwd = value;
    }

}
