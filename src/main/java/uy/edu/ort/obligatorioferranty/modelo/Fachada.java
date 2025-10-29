package uy.edu.ort.obligatorioferranty.modelo;

import java.util.ArrayList;

public class Fachada {

    private SistemaAcceso sistemaAcceso = new SistemaAcceso();

    // singleton
    private static Fachada instancia = new Fachada();

    public static Fachada getInstancia() {
        return instancia;
    }

    // DELEGACIONES

    public Sesion loginPropietario(String documento, String contrasenia) throws Exception {
        return sistemaAcceso.loginPropietario(documento, contrasenia);
    }

    public void agregarUsuarioPropietario(String documento, String contrasenia, String nombreCompleto, Estado estado) {
        sistemaAcceso.agregarUsuarioPropietario(documento, contrasenia, nombreCompleto, estado);
    }

    public ArrayList<Sesion> getSesionesActivas() {
        return sistemaAcceso.getSesionesActivas();
    }

    public void logout(Sesion sesion) {
        sistemaAcceso.logout(sesion);
    }
}
