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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "MUNICIPALIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municipalidad.findAll", query = "SELECT m FROM Municipalidad m"),
    @NamedQuery(name = "Municipalidad.findByCodigoMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.codigoMunicipalidad = :codigoMunicipalidad"),
    @NamedQuery(name = "Municipalidad.findByNombreMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.nombreMunicipalidad = :nombreMunicipalidad"),
    @NamedQuery(name = "Municipalidad.findByFonoMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.fonoMunicipalidad = :fonoMunicipalidad"),
    @NamedQuery(name = "Municipalidad.findByEmailMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.emailMunicipalidad = :emailMunicipalidad"),
    @NamedQuery(name = "Municipalidad.findByDireccionMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.direccionMunicipalidad = :direccionMunicipalidad"),
    @NamedQuery(name = "Municipalidad.findByEstadoMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.estadoMunicipalidad = :estadoMunicipalidad"),
    @NamedQuery(name = "Municipalidad.findByFechaHoraCreacionMunicipalidad", query = "SELECT m FROM Municipalidad m WHERE m.fechaHoraCreacionMunicipalidad = :fechaHoraCreacionMunicipalidad")})
public class Municipalidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODIGO_MUNICIPALIDAD")
    private String codigoMunicipalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMBRE_MUNICIPALIDAD")
    private String nombreMunicipalidad;
    @Size(max = 15)
    @Column(name = "FONO_MUNICIPALIDAD")
    private String fonoMunicipalidad;
    @Size(max = 30)
    @Column(name = "EMAIL_MUNICIPALIDAD")
    private String emailMunicipalidad;
    @Size(max = 60)
    @Column(name = "DIRECCION_MUNICIPALIDAD")
    private String direccionMunicipalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ESTADO_MUNICIPALIDAD")
    private String estadoMunicipalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HORA_CREACION_MUNICIPALIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCreacionMunicipalidad;

    public Municipalidad() {
    }

    public Municipalidad(String codigoMunicipalidad) {
        this.codigoMunicipalidad = codigoMunicipalidad;
    }

    public Municipalidad(String codigoMunicipalidad, String nombreMunicipalidad, String estadoMunicipalidad, Date fechaHoraCreacionMunicipalidad) {
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
        if (!(object instanceof Municipalidad)) {
            return false;
        }
        Municipalidad other = (Municipalidad) object;
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
