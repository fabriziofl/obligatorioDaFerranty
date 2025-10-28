package uy.edu.ort.obligatorioferranty.modelo;

import java.time.LocalDate;

public class BonificacionFrecuentes extends Bonificacion {

    public BonificacionFrecuentes() {
        super("Frecuentes");
    }

    // metodo para que el descuento se aplique solo si no es el primer transito en
    // el día por un puesto determinado
    // con el mismo vehículo
    public double devolverPrecioBonificado(Transito transito) {
        Puesto puesto = transito.getPuesto();
        String matricula = transito.getMatricula();
        LocalDate fechaHora = transito.getFechaHora().toLocalDate();
        if (puesto.yaPasoHoy(matricula, fechaHora)) {
            return transito.getMonto() * 0.5; // 50% de descuento para frecuentes
        } else {
            return transito.getMonto(); // sin descuento
        }

    }
}