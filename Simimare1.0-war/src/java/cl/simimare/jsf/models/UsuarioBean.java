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
public class UsuarioBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String rutUsuario;
    private String nombreUsuario;
    private String apellidoPaternoUsuario;
    private String apellidoMaternoUsuario;
    private String fonoContactoUsuario;
    private String emailUsuario;
    private String passwordUsuario;
    private String direccionUsuario;
    private String estadoUsuario;
    private Date fechaHoraRegistroUsuario;

    public UsuarioBean() {
    }

    public UsuarioBean(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public UsuarioBean(String rutUsuario, String emailUsuario, String passwordUsuario, String estadoUsuario, Date fechaHoraRegistroUsuario) {
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
        if (!(object instanceof UsuarioBean)) {
            return false;
        }
        UsuarioBean other = (UsuarioBean) object;
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
