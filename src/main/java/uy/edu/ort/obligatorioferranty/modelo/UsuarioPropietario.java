package uy.edu.ort.obligatorioferranty.modelo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioPropietario extends Usuario {

    private int saldoActual = 2000;
    private int saldoMinimoParaNotificaciones = 500;
    private Estado estado;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<Notificacion> notificaciones = new ArrayList<>();
    private List<Asignacion> asignaciones = new ArrayList<>();

    public UsuarioPropietario(String documento, String contrasenia, String nombreCompleto, int saldoActual,
            int saldoMinimoParaNotificaciones, Estado estado, List<Vehiculo> vehiculos,
            List<Notificacion> notificaciones, List<Asignacion> asignaciones) {
        super(documento, contrasenia, nombreCompleto);
        this.saldoActual = saldoActual;
        this.saldoMinimoParaNotificaciones = saldoMinimoParaNotificaciones;
        this.estado = estado;
        this.vehiculos = vehiculos;
        this.notificaciones = notificaciones;
        this.asignaciones = asignaciones;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getSaldoMinimoParaNotificaciones() {
        return saldoMinimoParaNotificaciones;
    }

    if(estado==null)

    {
        this.estado = new EstadoHabilitado();
    }
}
