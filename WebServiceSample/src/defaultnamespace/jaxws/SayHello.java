
package defaultnamespace.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by the CXF 2.0.10
 * Tue Oct 31 15:30:25 AEDT 2017
 * Generated source version: 2.0.10
 * 
 */

@XmlRootElement(name = "sayHello", namespace = "http://default_package/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", namespace = "http://default_package/")

public class SayHello {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }
    
    public void setArg0( java.lang.String newArg0 ) {
        this.arg0 = newArg0;
    }
    
}
