package uy.edu.ort.obligatorioferranty.modelo;

import java.sql.Date;

public class Asignacion {

    private UsuarioPropietario propietario;
    private Bonificacion bonificacion;
    private Puesto puesto;
    private Date fechaAsignacion;
    private Transito transito;

    public Transito getTransito() {
        return transito;
    }

    public void setTransito(Transito transito) {
        this.transito = transito;
    }

    public UsuarioPropietario getPropietario() {
        return propietario;
    }

    public void setPropietario(UsuarioPropietario propietario) {
        this.propietario = propietario;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Asignacion(UsuarioPropietario propietario, Bonificacion bonificacion, Puesto puesto, Date fechaAsignacion) {
        this.propietario = propietario;
        this.bonificacion = bonificacion;
        this.puesto = puesto;
        this.fechaAsignacion = fechaAsignacion;
    }

}
