/**
 * ControllaOverlayPeriodoDiarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class ControllaOverlayPeriodoDiarioRequest  implements java.io.Serializable {
    private java.lang.String chiaveTestataCompilazione;

    private java.lang.String chiaveStrutturaRicettiva;

    private java.lang.String dataInizio;

    private java.lang.String dataFine;

    public ControllaOverlayPeriodoDiarioRequest() {
    }

    public ControllaOverlayPeriodoDiarioRequest(
           java.lang.String chiaveTestataCompilazione,
           java.lang.String chiaveStrutturaRicettiva,
           java.lang.String dataInizio,
           java.lang.String dataFine) {
           this.chiaveTestataCompilazione = chiaveTestataCompilazione;
           this.chiaveStrutturaRicettiva = chiaveStrutturaRicettiva;
           this.dataInizio = dataInizio;
           this.dataFine = dataFine;
    }


    /**
     * Gets the chiaveTestataCompilazione value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @return chiaveTestataCompilazione
     */
    public java.lang.String getChiaveTestataCompilazione() {
        return chiaveTestataCompilazione;
    }


    /**
     * Sets the chiaveTestataCompilazione value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @param chiaveTestataCompilazione
     */
    public void setChiaveTestataCompilazione(java.lang.String chiaveTestataCompilazione) {
        this.chiaveTestataCompilazione = chiaveTestataCompilazione;
    }


    /**
     * Gets the chiaveStrutturaRicettiva value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @return chiaveStrutturaRicettiva
     */
    public java.lang.String getChiaveStrutturaRicettiva() {
        return chiaveStrutturaRicettiva;
    }


    /**
     * Sets the chiaveStrutturaRicettiva value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @param chiaveStrutturaRicettiva
     */
    public void setChiaveStrutturaRicettiva(java.lang.String chiaveStrutturaRicettiva) {
        this.chiaveStrutturaRicettiva = chiaveStrutturaRicettiva;
    }


    /**
     * Gets the dataInizio value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @return dataInizio
     */
    public java.lang.String getDataInizio() {
        return dataInizio;
    }


    /**
     * Sets the dataInizio value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @param dataInizio
     */
    public void setDataInizio(java.lang.String dataInizio) {
        this.dataInizio = dataInizio;
    }


    /**
     * Gets the dataFine value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @return dataFine
     */
    public java.lang.String getDataFine() {
        return dataFine;
    }


    /**
     * Sets the dataFine value for this ControllaOverlayPeriodoDiarioRequest.
     * 
     * @param dataFine
     */
    public void setDataFine(java.lang.String dataFine) {
        this.dataFine = dataFine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControllaOverlayPeriodoDiarioRequest)) return false;
        ControllaOverlayPeriodoDiarioRequest other = (ControllaOverlayPeriodoDiarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTestataCompilazione==null && other.getChiaveTestataCompilazione()==null) || 
             (this.chiaveTestataCompilazione!=null &&
              this.chiaveTestataCompilazione.equals(other.getChiaveTestataCompilazione()))) &&
            ((this.chiaveStrutturaRicettiva==null && other.getChiaveStrutturaRicettiva()==null) || 
             (this.chiaveStrutturaRicettiva!=null &&
              this.chiaveStrutturaRicettiva.equals(other.getChiaveStrutturaRicettiva()))) &&
            ((this.dataInizio==null && other.getDataInizio()==null) || 
             (this.dataInizio!=null &&
              this.dataInizio.equals(other.getDataInizio()))) &&
            ((this.dataFine==null && other.getDataFine()==null) || 
             (this.dataFine!=null &&
              this.dataFine.equals(other.getDataFine())));
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
        if (getChiaveTestataCompilazione() != null) {
            _hashCode += getChiaveTestataCompilazione().hashCode();
        }
        if (getChiaveStrutturaRicettiva() != null) {
            _hashCode += getChiaveStrutturaRicettiva().hashCode();
        }
        if (getDataInizio() != null) {
            _hashCode += getDataInizio().hashCode();
        }
        if (getDataFine() != null) {
            _hashCode += getDataFine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ControllaOverlayPeriodoDiarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaOverlayPeriodoDiarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataCompilazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataCompilazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveStrutturaRicettiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveStrutturaRicettiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "dataInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "dataFine"));
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
