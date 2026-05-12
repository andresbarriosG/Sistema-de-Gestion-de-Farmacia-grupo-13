package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import abstractas.Medicamento;

public class Venta {

    private String idVenta;
    private LocalDate fecha;
    private boolean requiereFormula;
    private double total;

    private List<Medicamento> medicamentos;

    public Venta(String idVenta,
                 boolean requiereFormula) {

        this.idVenta = idVenta;
        this.fecha = LocalDate.now();
        this.requiereFormula = requiereFormula;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void procesarVenta() {

        total = calcularTotal();

        System.out.println("Venta procesada");
    }

    public double calcularTotal() {

        double suma = 0;

        for (Medicamento medicamento : medicamentos) {
            suma += medicamento.calcularPrecio();
        }

        return suma;
    }

    public String generarRecibo() {

        return "Recibo generado. Total: " + total;
    }
}