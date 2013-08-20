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
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByRutUsuario", query = "SELECT u FROM Usuario u WHERE u.rutUsuario = :rutUsuario"),
    @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Usuario.findByApellidoPaternoUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidoPaternoUsuario = :apellidoPaternoUsuario"),
    @NamedQuery(name = "Usuario.findByApellidoMaternoUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidoMaternoUsuario = :apellidoMaternoUsuario"),
    @NamedQuery(name = "Usuario.findByFonoContactoUsuario", query = "SELECT u FROM Usuario u WHERE u.fonoContactoUsuario = :fonoContactoUsuario"),
    @NamedQuery(name = "Usuario.findByEmailUsuario", query = "SELECT u FROM Usuario u WHERE u.emailUsuario = :emailUsuario"),
    @NamedQuery(name = "Usuario.findByPasswordUsuario", query = "SELECT u FROM Usuario u WHERE u.passwordUsuario = :passwordUsuario"),
    @NamedQuery(name = "Usuario.findByDireccionUsuario", query = "SELECT u FROM Usuario u WHERE u.direccionUsuario = :direccionUsuario"),
    @NamedQuery(name = "Usuario.findByEstadoUsuario", query = "SELECT u FROM Usuario u WHERE u.estadoUsuario = :estadoUsuario"),
    @NamedQuery(name = "Usuario.findByFechaHoraRegistroUsuario", query = "SELECT u FROM Usuario u WHERE u.fechaHoraRegistroUsuario = :fechaHoraRegistroUsuario")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "RUT_USUARIO")
    private String rutUsuario;
    @Size(max = 30)
    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;
    @Size(max = 30)
    @Column(name = "APELLIDO_PATERNO_USUARIO")
    private String apellidoPaternoUsuario;
    @Size(max = 30)
    @Column(name = "APELLIDO_MATERNO_USUARIO")
    private String apellidoMaternoUsuario;
    @Size(max = 30)
    @Column(name = "FONO_CONTACTO_USUARIO")
    private String fonoContactoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EMAIL_USUARIO")
    private String emailUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "PASSWORD_USUARIO")
    private String passwordUsuario;
    @Size(max = 60)
    @Column(name = "DIRECCION_USUARIO")
    private String direccionUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ESTADO_USUARIO")
    private String estadoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HORA_REGISTRO_USUARIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraRegistroUsuario;

    public Usuario() {
    }

    public Usuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public Usuario(String rutUsuario, String emailUsuario, String passwordUsuario, String estadoUsuario, Date fechaHoraRegistroUsuario) {
        this.rutUsuario = rutUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
        this.estadoUsuario = estadoUsuario;
        this.fechaHoraRegistroUsuario = fechaHoraRegistroUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoPaternoUsuario() {
        return apellidoPaternoUsuario;
    }

    public void setApellidoPaternoUsuario(String apellidoPaternoUsuario) {
        this.apellidoPaternoUsuario = apellidoPaternoUsuario;
    }

    public String getApellidoMaternoUsuario() {
        return apellidoMaternoUsuario;
    }

    public void setApellidoMaternoUsuario(String apellidoMaternoUsuario) {
        this.apellidoMaternoUsuario = apellidoMaternoUsuario;
    }

    public String getFonoContactoUsuario() {
        return fonoContactoUsuario;
    }

    public void setFonoContactoUsuario(String fonoContactoUsuario) {
        this.fonoContactoUsuario = fonoContactoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Date getFechaHoraRegistroUsuario() {
        return fechaHoraRegistroUsuario;
    }

    public void setFechaHoraRegistroUsuario(Date fechaHoraRegistroUsuario) {
        this.fechaHoraRegistroUsuario = fechaHoraRegistroUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutUsuario != null ? rutUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.rutUsuario == null && other.rutUsuario != null) || (this.rutUsuario != null && !this.rutUsuario.equals(other.rutUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.simimare.entities.Usuario[ rutUsuario=" + rutUsuario + " ]";
    }
    
}
