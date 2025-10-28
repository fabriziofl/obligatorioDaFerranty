package uy.edu.ort.obligatorioferranty.modelo;

import java.sql.Date;

public class Sesion {

    private Date fechaIngreso = new Date(System.currentTimeMillis());
    private UsuarioPropietario usuario;

    public Sesion(UsuarioPropietario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public UsuarioPropietario getUsuario() {
        return usuario;
    }

}
