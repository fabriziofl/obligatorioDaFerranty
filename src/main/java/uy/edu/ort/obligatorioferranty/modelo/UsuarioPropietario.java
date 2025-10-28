package uy.edu.ort.obligatorioferranty.modelo;

public class UsuarioPropietario extends Usuario {

    public UsuarioPropietario(String documento, String contrasenia, String nombre, String apellido) {
        super(documento, contrasenia, nombre, apellido);
    }

    private int saldoActual = 2000;
    private int saldoMinimoParaNotificaciones = 500;

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getSaldoMinimoParaNotificaciones() {
        return saldoMinimoParaNotificaciones;
    }

}
