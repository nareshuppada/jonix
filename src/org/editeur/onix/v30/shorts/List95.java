//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:45 AM IST 
//


package org.editeur.onix.v30.shorts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List95.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List95">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lb"/>
 *     &lt;enumeration value="gr"/>
 *     &lt;enumeration value="oz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List95")
@XmlEnum
public enum List95 {

    @XmlEnumValue("lb")
    LB("lb"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("oz")
    OZ("oz");
    private final String value;

    List95(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static List95 fromValue(String v) {
        for (List95 c: List95 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
