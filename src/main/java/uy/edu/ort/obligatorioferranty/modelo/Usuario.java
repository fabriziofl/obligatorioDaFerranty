package uy.edu.ort.obligatorioferranty.modelo;

public abstract class Usuario {

    private String documento;
    private String contrasenia;

    private String nombre;
    private String apellido;

    public Usuario(String documento, String contrasenia, String nombre, String apellido) {
        this.documento = documento;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }
}
