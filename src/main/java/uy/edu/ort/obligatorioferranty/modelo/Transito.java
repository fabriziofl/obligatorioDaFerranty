package uy.edu.ort.obligatorioferranty.modelo;

import java.sql.Date;

public class Transito {

    private Puesto puesto;
    private String matricula;
    private Date fechaHora;
    private Tarifa tarifa;

    public Tarifa getTarifa() {
        return tarifa;
    }

    public Transito(Puesto puesto, String matricula, Date fechaHora, Tarifa tarifa) {
        this.puesto = puesto;
        this.matricula = matricula;
        this.fechaHora = fechaHora;
        this.tarifa = tarifa;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getMonto() {
        return tarifa.getMonto();
    }

}
