/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.jsf.models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class MaterialBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String codigoMaterial;
    private String nombreMaterial;
    private String descripcionMaterial;
    private int precioCompraToneladaMaterial;
    private Integer precioVentaToneladaMaterial;
    private Double purezaIngresoMaterial;
    private Double purezaSalidaMaterial;
    private String estadoMaterial;
    private Date fechaHoraCreacionMaterial;
    
    public MaterialBean() {
    }

    public MaterialBean(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }
    
    public MaterialBean(String codigoMaterial, String nombreMaterial, String descripcionMaterial, int precioCompraToneladaMaterial, int precioVentaToneladaMaterial, int purezaIngresoMaterial, int purezaSalidaMaterial, String estadoMaterial, Date fechaHoraCreacionMaterial) {
        this.codigoMaterial = codigoMaterial;
        this.nombreMaterial = nombreMaterial;
        this.precioCompraToneladaMaterial = precioCompraToneladaMaterial;
        this.estadoMaterial = estadoMaterial;
        this.fechaHoraCreacionMaterial = fechaHoraCreacionMaterial;
    }
    
    public MaterialBean(String codigoMaterial, String nombreMaterial, int precioCompraToneladaMaterial, String estadoMaterial, Date fechaHoraCreacionMaterial) {
        this.codigoMaterial = codigoMaterial;
        this.nombreMaterial = nombreMaterial;
        this.precioCompraToneladaMaterial = precioCompraToneladaMaterial;
        this.estadoMaterial = estadoMaterial;
        this.fechaHoraCreacionMaterial = fechaHoraCreacionMaterial;
    }
    
    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public int getPrecioCompraToneladaMaterial() {
        return precioCompraToneladaMaterial;
    }

    public void setPrecioCompraToneladaMaterial(int precioCompraToneladaMaterial) {
        this.precioCompraToneladaMaterial = precioCompraToneladaMaterial;
    }

    public Integer getPrecioVentaToneladaMaterial() {
        return precioVentaToneladaMaterial;
    }

    public void setPrecioVentaToneladaMaterial(Integer precioVentaToneladaMaterial) {
        this.precioVentaToneladaMaterial = precioVentaToneladaMaterial;
    }

    public Double getPurezaIngresoMaterial() {
        return purezaIngresoMaterial;
    }

    public void setPurezaIngresoMaterial(Double purezaIngresoMaterial) {
        this.purezaIngresoMaterial = purezaIngresoMaterial;
    }

    public Double getPurezaSalidaMaterial() {
        return purezaSalidaMaterial;
    }

    public void setPurezaSalidaMaterial(Double purezaSalidaMaterial) {
        this.purezaSalidaMaterial = purezaSalidaMaterial;
    }

    public String getEstadoMaterial() {
        return estadoMaterial;
    }

    public void setEstadoMaterial(String estadoMaterial) {
        this.estadoMaterial = estadoMaterial;
    }

    public Date getFechaHoraCreacionMaterial() {
        return fechaHoraCreacionMaterial;
    }

    public void setFechaHoraCreacionMaterial(Date fechaHoraCreacionMaterial) {
        this.fechaHoraCreacionMaterial = fechaHoraCreacionMaterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMaterial != null ? codigoMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialBean)) {
            return false;
        }
        MaterialBean other = (MaterialBean) object;
        if ((this.codigoMaterial == null && other.codigoMaterial != null) || (this.codigoMaterial != null && !this.codigoMaterial.equals(other.codigoMaterial))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "cl.simimare.models.Material[ codigoMaterial=" + codigoMaterial + " ]";
    }
    
}
