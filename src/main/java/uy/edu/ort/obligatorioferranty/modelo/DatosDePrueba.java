package uy.edu.ort.obligatorioferranty.modelo;

public class DatosDePrueba {

    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();

        fachada.agregarUsuarioPropietario("12345678", "pass123", "Juan Perez", null);
        fachada.agregarUsuarioPropietario("1", "1", "Maria Gomez", new EstadoDeshabilitado());
    }   fachada.agregarUsuarioPropietario("87654321", "password", "Ana Lopez", )