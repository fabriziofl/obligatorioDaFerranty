package uy.edu.ort.obligatorioferranty.modelo;

public class Tarifa {

    private Categoria categoria;
    private double monto;

    public Tarifa(Categoria categoria, double monto) {
        this.categoria = categoria;
        this.monto = monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
