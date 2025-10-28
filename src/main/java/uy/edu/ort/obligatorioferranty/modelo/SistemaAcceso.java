package uy.edu.ort.obligatorioferranty.modelo;

import java.util.ArrayList;

public class SistemaAcceso {

    private ArrayList<UsuarioAdministrador> administradores = new ArrayList<>();
    private ArrayList<UsuarioPropietario> propietarios = new ArrayList<>();
    private ArrayList<Sesion> sesionesActivas = new ArrayList<>();

    public void agregarUsuarioPropietario(String documento, String contrasenia, String nombre, String apellido) {
        UsuarioPropietario nuevoPropietario = new UsuarioPropietario(documento, contrasenia, nombre, apellido);
        propietarios.add(nuevoPropietario);
    }

    public void agregarUsuarioAdministrador(String documento, String contrasenia, String nombre, String apellido) {
        UsuarioAdministrador nuevoAdministrador = new UsuarioAdministrador(documento, contrasenia, nombre, apellido);
        administradores.add(nuevoAdministrador);
    }

    public Sesion loginPropietario(String documento, String contrasenia) throws Exception {
        Sesion sesion = null;
        UsuarioPropietario usuario = (UsuarioPropietario) login(documento, contrasenia, propietarios);
        if (usuario != null) {
            sesion = new Sesion(usuario);
            sesionesActivas.add(sesion);
            return sesion;
        }
        throw new Exception("Login Incorrecto");
    }
    // falta login admin

    private Usuario login(String documento, String contrasenia, ArrayList listaUsuarios) {
        for (Object objUsuario : listaUsuarios) {
            Usuario usuario = (Usuario) objUsuario;
            if (usuario.getDocumento().equals(documento) && usuario.getContrasenia().equals(contrasenia)) {
                return usuario;
            }
        }
        return null;
    }

    public ArrayList<Sesion> getSesionesActivas() {
        return sesionesActivas;
    }

    public void logout(Sesion sesion) {
        sesionesActivas.remove(sesion);
    }
}
