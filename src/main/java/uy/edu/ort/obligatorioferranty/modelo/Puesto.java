package uy.edu.ort.obligatorioferranty.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Puesto {

    private String nombre;
    private String direccion;
    private List<Transito> transitos = new ArrayList<>();
    private List<Tarifa> tarifas = new ArrayList<>();

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public List<Transito> getTransitos() {
        return transitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Puesto(String nombre, String direccion, List<Transito> transitos, List<Tarifa> tarifas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.transitos = transitos;
        this.tarifas = tarifas;
    }

    public boolean yaPasoHoy(String matricula, LocalDate fecha) {
        for (Transito t : transitos) {
            if (t.getMatricula().equalsIgnoreCase(matricula)
                    && t.getFechaHora().toLocalDate().equals(fecha)) {
                return true;
            }
        }
        return false;
    }

}
