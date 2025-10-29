package uy.edu.ort.obligatorioferranty.modelo;

import java.util.ArrayList;

public class SistemaAcceso {

    private ArrayList<UsuarioAdministrador> administradores = new ArrayList<>();
    private ArrayList<UsuarioPropietario> propietarios = new ArrayList<>();
    private ArrayList<Sesion> sesionesActivas = new ArrayList<>();

    public void agregarUsuarioPropietario(String documento, String contrasenia, String nombreCompleto, Estado estado) {
        UsuarioPropietario nuevoPropietario = new UsuarioPropietario(documento, contrasenia, nombreCompleto, 4000, 500,
                null, null, null, null);
        propietarios.add(nuevoPropietario);
    }

    public void agregarUsuarioAdministrador(String documento, String contrasenia, String nombreCompleto) {
        UsuarioAdministrador nuevoAdministrador = new UsuarioAdministrador(documento, contrasenia, nombreCompleto);
        administradores.add(nuevoAdministrador);
    }

    public Sesion loginPropietario(String documento, String contrasenia, Estado estado) throws Exception {
        Sesion sesion = null;
        UsuarioPropietario usuario = (UsuarioPropietario) login(documento, contrasenia, propietarios);

        if (usuario == null) {
            throw new Exception("Acceso denegado");
        }
        // Verificar estado del usuario
        // Si el estado es Deshabilitado, no puede ingresar al sistema

        if (usuario.getEstado() instanceof EstadoDeshabilitado) {
            // Curso alternativo: usuario deshabilitado
            throw new Exception("Usuario deshabilitado, no puede ingresar al sistema");
        }

        sesion = new Sesion(usuario);
        sesionesActivas.add(sesion);
        return sesion;
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
