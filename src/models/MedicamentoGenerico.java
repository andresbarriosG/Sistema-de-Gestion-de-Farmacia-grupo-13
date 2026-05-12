package models;

import abstractas.Medicamento;
import interfaces.Vendible;

public class MedicamentoGenerico extends Medicamento
        implements Vendible {

    private String laboratorio;
    private boolean requiereFormula;
    private String codigoINVIMA;

    public MedicamentoGenerico(String id,
                               String nombre,
                               String principioActivo,
                               double precio,
                               int stockMinimo,
                               String laboratorio,
                               boolean requiereFormula,
                               String codigoINVIMA) {

        super(id, nombre, principioActivo,
                precio, stockMinimo);

        this.laboratorio = laboratorio;
        this.requiereFormula = requiereFormula;
        this.codigoINVIMA = codigoINVIMA;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public boolean esVendible() {
        return stockDisponible() > 0;
    }

    public void verificarStock() {

        if (stockDisponible() < stockMinimo) {
            System.out.println("Stock bajo");
        }
    }
}