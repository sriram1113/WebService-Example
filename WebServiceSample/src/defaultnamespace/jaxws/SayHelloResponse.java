
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

@XmlRootElement(name = "sayHelloResponse", namespace = "http://default_package/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloResponse", namespace = "http://default_package/")

public class SayHelloResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String get_return() {
        return this._return;
    }
    
    public void set_return( java.lang.String new_return ) {
        this._return = new_return;
    }
    
}

