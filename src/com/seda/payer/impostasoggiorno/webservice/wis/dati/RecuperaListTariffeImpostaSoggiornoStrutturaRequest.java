/**
 * RecuperaListTariffeImpostaSoggiornoStrutturaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RecuperaListTariffeImpostaSoggiornoStrutturaRequest  implements java.io.Serializable {
    private java.lang.String codiceBelfiore;

    private java.lang.String chiaveTipologisStruttura;

    private java.lang.String ricercaDataDa;

    private java.lang.String ricercaDataA;

    public RecuperaListTariffeImpostaSoggiornoStrutturaRequest() {
    }

    public RecuperaListTariffeImpostaSoggiornoStrutturaRequest(
           java.lang.String codiceBelfiore,
           java.lang.String chiaveTipologisStruttura,
           java.lang.String ricercaDataDa,
           java.lang.String ricercaDataA) {
           this.codiceBelfiore = codiceBelfiore;
           this.chiaveTipologisStruttura = chiaveTipologisStruttura;
           this.ricercaDataDa = ricercaDataDa;
           this.ricercaDataA = ricercaDataA;
    }


    /**
     * Gets the codiceBelfiore value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @return codiceBelfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @param codiceBelfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the chiaveTipologisStruttura value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @return chiaveTipologisStruttura
     */
    public java.lang.String getChiaveTipologisStruttura() {
        return chiaveTipologisStruttura;
    }


    /**
     * Sets the chiaveTipologisStruttura value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @param chiaveTipologisStruttura
     */
    public void setChiaveTipologisStruttura(java.lang.String chiaveTipologisStruttura) {
        this.chiaveTipologisStruttura = chiaveTipologisStruttura;
    }

    /**
     * Gets the ricercaDataDa value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @return ricercaDataDa
     */
    public java.lang.String getRicercaDataDa() {
		return ricercaDataDa;
	}

    /**
     * Sets the ricercaDataA value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @param ricercaDataA
     */
	public java.lang.String getRicercaDataA() {
		return ricercaDataA;
	}

	/**
     * Gets the ricercaDataDa value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @return ricercaDataDa
     */
	public void setRicercaDataDa(java.lang.String ricercaDataDa) {
		this.ricercaDataDa = ricercaDataDa;
	}
	/**
     * Sets the ricercaDataA value for this RecuperaListTariffeImpostaSoggiornoStrutturaRequest.
     * 
     * @param ricercaDataA
     */
	public void setRicercaDataA(java.lang.String ricercaDataA) {
		this.ricercaDataA = ricercaDataA;
	}

	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListTariffeImpostaSoggiornoStrutturaRequest)) return false;
        RecuperaListTariffeImpostaSoggiornoStrutturaRequest other = (RecuperaListTariffeImpostaSoggiornoStrutturaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceBelfiore==null && other.getCodiceBelfiore()==null) || 
             (this.codiceBelfiore!=null &&
              this.codiceBelfiore.equals(other.getCodiceBelfiore()))) &&
            ((this.chiaveTipologisStruttura==null && other.getChiaveTipologisStruttura()==null) || 
             (this.chiaveTipologisStruttura!=null &&
              this.chiaveTipologisStruttura.equals(other.getChiaveTipologisStruttura()))) &&
            ((this.ricercaDataDa==null && other.getRicercaDataDa()==null) || 
             (this.ricercaDataDa!=null &&
              this.ricercaDataDa.equals(other.getRicercaDataDa()))) && 
            ((this.ricercaDataA==null && other.getRicercaDataA()==null) || 
             (this.ricercaDataA!=null &&
              this.ricercaDataA.equals(other.getRicercaDataA())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodiceBelfiore() != null) {
            _hashCode += getCodiceBelfiore().hashCode();
        }
        if (getChiaveTipologisStruttura() != null) {
            _hashCode += getChiaveTipologisStruttura().hashCode();
        }
        if (getRicercaDataDa() != null) {
            _hashCode += getRicercaDataDa().hashCode();
        }
        if (getRicercaDataA() != null) {
            _hashCode += getRicercaDataA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListTariffeImpostaSoggiornoStrutturaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListTariffeImpostaSoggiornoStrutturaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfiore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceBelfiore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTipologisStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveTipologisStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaDataDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "ricercaDataDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaDataA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "ricercaDataA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
