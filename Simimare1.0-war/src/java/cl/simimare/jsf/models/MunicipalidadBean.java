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
public class MunicipalidadBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codigoMunicipalidad;
    private String nombreMunicipalidad;
    private String fonoMunicipalidad;
    private String emailMunicipalidad;
    private String direccionMunicipalidad;
    private String estadoMunicipalidad;
    private Date fechaHoraCreacionMunicipalidad;

    public MunicipalidadBean() {
    }

    public MunicipalidadBean(String codigoMunicipalidad) {
        this.codigoMunicipalidad = codigoMunicipalidad;
    }

    public MunicipalidadBean(String codigoMunicipalidad, String nombreMunicipalidad, String estadoMunicipalidad, Date fechaHoraCreacionMunicipalidad) {
        this.codigoMunicipalidad = codigoMunicipalidad;
        this.nombreMunicipalidad = nombreMunicipalidad;
        this.estadoMunicipalidad = estadoMunicipalidad;
        this.fechaHoraCreacionMunicipalidad = fechaHoraCreacionMunicipalidad;
    }

    public String getCodigoMunicipalidad() {
        return codigoMunicipalidad;
    }

    public void setCodigoMunicipalidad(String codigoMunicipalidad) {
        this.codigoMunicipalidad = codigoMunicipalidad;
    }

    public String getNombreMunicipalidad() {
        return nombreMunicipalidad;
    }

    public void setNombreMunicipalidad(String nombreMunicipalidad) {
        this.nombreMunicipalidad = nombreMunicipalidad;
    }

    public String getFonoMunicipalidad() {
        return fonoMunicipalidad;
    }

    public void setFonoMunicipalidad(String fonoMunicipalidad) {
        this.fonoMunicipalidad = fonoMunicipalidad;
    }

    public String getEmailMunicipalidad() {
        return emailMunicipalidad;
    }

    public void setEmailMunicipalidad(String emailMunicipalidad) {
        this.emailMunicipalidad = emailMunicipalidad;
    }

    public String getDireccionMunicipalidad() {
        return direccionMunicipalidad;
    }

    public void setDireccionMunicipalidad(String direccionMunicipalidad) {
        this.direccionMunicipalidad = direccionMunicipalidad;
    }

    public String getEstadoMunicipalidad() {
        return estadoMunicipalidad;
    }

    public void setEstadoMunicipalidad(String estadoMunicipalidad) {
        this.estadoMunicipalidad = estadoMunicipalidad;
    }

    public Date getFechaHoraCreacionMunicipalidad() {
        return fechaHoraCreacionMunicipalidad;
    }

    public void setFechaHoraCreacionMunicipalidad(Date fechaHoraCreacionMunicipalidad) {
        this.fechaHoraCreacionMunicipalidad = fechaHoraCreacionMunicipalidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMunicipalidad != null ? codigoMunicipalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MunicipalidadBean)) {
            return false;
        }
        MunicipalidadBean other = (MunicipalidadBean) object;
        if ((this.codigoMunicipalidad == null && other.codigoMunicipalidad != null) || (this.codigoMunicipalidad != null && !this.codigoMunicipalidad.equals(other.codigoMunicipalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.simimare.entities.Municipalidad[ codigoMunicipalidad=" + codigoMunicipalidad + " ]";
    }
    
}
