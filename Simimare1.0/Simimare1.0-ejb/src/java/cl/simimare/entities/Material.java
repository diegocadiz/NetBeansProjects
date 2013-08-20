/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "MATERIAL")
@NamedQueries({
    @NamedQuery(name = "Material.findAll", query = "SELECT m FROM Material m")})
public class Material implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODIGO_MATERIAL")
    private String codigoMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMBRE_MATERIAL")
    private String nombreMaterial;
    @Size(max = 60)
    @Column(name = "DESCRIPCION_MATERIAL")
    private String descripcionMaterial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO_COMPRA_TONELADA_MATERIAL")
    private int precioCompraToneladaMaterial;
    @Column(name = "PRECIO_VENTA_TONELADA_MATERIAL")
    private Integer precioVentaToneladaMaterial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PUREZA_INGRESO_MATERIAL")
    private Double purezaIngresoMaterial;
    @Column(name = "PUREZA_SALIDA_MATERIAL")
    private Double purezaSalidaMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ESTADO_MATERIAL")
    private String estadoMaterial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HORA_CREACION_MATERIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCreacionMaterial;

    public Material() {
    }

    public Material(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }
    
    public Material(String codigoMaterial, String nombreMaterial, String descripcionMaterial, int precioCompraToneladaMaterial, int precioVentaToneladaMaterial, int purezaIngresoMaterial, int purezaSalidaMaterial, String estadoMaterial, Date fechaHoraCreacionMaterial) {
        this.codigoMaterial = codigoMaterial;
        this.nombreMaterial = nombreMaterial;
        this.precioCompraToneladaMaterial = precioCompraToneladaMaterial;
        this.estadoMaterial = estadoMaterial;
        this.fechaHoraCreacionMaterial = fechaHoraCreacionMaterial;
    }
    
    public Material(String codigoMaterial, String nombreMaterial, int precioCompraToneladaMaterial, String estadoMaterial, Date fechaHoraCreacionMaterial) {
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
        if (!(object instanceof Material)) {
            return false;
        }
        Material other = (Material) object;
        if ((this.codigoMaterial == null && other.codigoMaterial != null) || (this.codigoMaterial != null && !this.codigoMaterial.equals(other.codigoMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.simimare.entities.Material[ codigoMaterial=" + codigoMaterial + " ]";
    }
    
}
