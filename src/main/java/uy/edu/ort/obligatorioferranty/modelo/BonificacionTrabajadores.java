package uy.edu.ort.obligatorioferranty.modelo;

import java.time.LocalDate;

public class BonificacionTrabajadores extends Bonificacion {

    public BonificacionTrabajadores() {
        super("Trabajadores");
    }

    // metodo para devolver monto bonificado (80%) para el transito si es de lunes a
    // viernes
    @Override
    public double devolverPrecioBonificado(Transito transito) {
        double montoBonificado = 0;
        LocalDate fecha = transito.getFechaHora().toLocalDate();
        if (esDiaHabil(fecha)) {
            montoBonificado = transito.getMonto() * 0.2; // 80% de descuento
        } else {
            montoBonificado = transito.getMonto(); // sin descuento
        }
        return montoBonificado;
    }

    private boolean esDiaHabil(LocalDate fecha) {
        int diaSemana = fecha.getDayOfWeek().getValue();
        return diaSemana >= 1 && diaSemana <= 5; // Lunes a Viernes
    }

}
