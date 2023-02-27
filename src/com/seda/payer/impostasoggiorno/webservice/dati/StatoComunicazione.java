/**
 * StatoComunicazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class StatoComunicazione implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatoComunicazione(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DA_INVIARE_AD_ENTRATE = "DA_INVIARE_AD_ENTRATE";
    public static final java.lang.String _INVIATA_AD_ENTRATE = "INVIATA_AD_ENTRATE";
    public static final java.lang.String _CARICATA_SU_ENTRATE = "CARICATA_SU_ENTRATE";
    public static final java.lang.String _ANNULLATA = "ANNULLATA";
    public static final StatoComunicazione DA_INVIARE_AD_ENTRATE = new StatoComunicazione(_DA_INVIARE_AD_ENTRATE);
    public static final StatoComunicazione INVIATA_AD_ENTRATE = new StatoComunicazione(_INVIATA_AD_ENTRATE);
    public static final StatoComunicazione CARICATA_SU_ENTRATE = new StatoComunicazione(_CARICATA_SU_ENTRATE);
    public static final StatoComunicazione ANNULLATA = new StatoComunicazione(_ANNULLATA);
    public java.lang.String getValue() { return _value_;}
    public static StatoComunicazione fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatoComunicazione enumeration = (StatoComunicazione)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatoComunicazione fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StatoComunicazione.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "StatoComunicazione"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
