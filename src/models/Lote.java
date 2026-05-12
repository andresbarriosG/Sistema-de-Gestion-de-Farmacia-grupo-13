package models;

import java.time.LocalDate;

public class Lote {

    private String numeroLote;
    private LocalDate fechaVencimiento;
    private int cantidadDisponible;
    private double precioCompra;

    public Lote(String numeroLote,
                LocalDate fechaVencimiento,
                int cantidadDisponible,
                double precioCompra) {

        this.numeroLote = numeroLote;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
    }

    public boolean estaVigente() {
        return fechaVencimiento.isAfter(LocalDate.now());
    }

    public int diasParaVencer() {
        return fechaVencimiento.getDayOfYear()
                - LocalDate.now().getDayOfYear();
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}