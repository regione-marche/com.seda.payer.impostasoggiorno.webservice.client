/**
 * ResponseTypeRetCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class ResponseTypeRetCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResponseTypeRetCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "00";
    public static final java.lang.String _value2 = "01";
    public static final java.lang.String _value3 = "02";
    public static final java.lang.String _value4 = "03";
    public static final java.lang.String _value5 = "04";
    public static final java.lang.String _value6 = "05";
    public static final java.lang.String _value7 = "06";
    public static final java.lang.String _value8 = "07";
    public static final java.lang.String _value9 = "08";
    public static final ResponseTypeRetCode value1 = new ResponseTypeRetCode(_value1);
    public static final ResponseTypeRetCode value2 = new ResponseTypeRetCode(_value2);
    public static final ResponseTypeRetCode value3 = new ResponseTypeRetCode(_value3);
    public static final ResponseTypeRetCode value4 = new ResponseTypeRetCode(_value4);
    public static final ResponseTypeRetCode value5 = new ResponseTypeRetCode(_value5);
    public static final ResponseTypeRetCode value6 = new ResponseTypeRetCode(_value6);
    public static final ResponseTypeRetCode value7 = new ResponseTypeRetCode(_value7);
    public static final ResponseTypeRetCode value8 = new ResponseTypeRetCode(_value8);
    public static final ResponseTypeRetCode value9 = new ResponseTypeRetCode(_value9);
    public java.lang.String getValue() { return _value_;}
    public static ResponseTypeRetCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ResponseTypeRetCode enumeration = (ResponseTypeRetCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResponseTypeRetCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseTypeRetCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", ">ResponseType>retCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
