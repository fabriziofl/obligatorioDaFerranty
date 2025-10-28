package uy.edu.ort.obligatorioferranty.modelo;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    private String nombre;
    private String apellido;
    private int documento;
    private int saldoActual;
    private int saldoMinimoParaAlerta;
    private Estado estado;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<Notificacion> notificaciones = new ArrayList<>();
    private List<Asignacion> asignaciones = new ArrayList<>();

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getSaldoMinimoParaAlerta() {
        return saldoMinimoParaAlerta;
    }

    public void setSaldoMinimoParaAlerta(int saldoMinimoParaAlerta) {
        this.saldoMinimoParaAlerta = saldoMinimoParaAlerta;
    }

    public Propietario(String nombre, String apellido, int documento, int saldoActual, int saldoMinimoParaAlerta,
            Estado estado, List<Vehiculo> vehiculos, List<Notificacion> notificaciones, List<Asignacion> asignaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.saldoActual = saldoActual;
        this.saldoMinimoParaAlerta = saldoMinimoParaAlerta;
        this.estado = estado;
        this.vehiculos = vehiculos;
        this.notificaciones = notificaciones;
        this.asignaciones = asignaciones;
    }

}
