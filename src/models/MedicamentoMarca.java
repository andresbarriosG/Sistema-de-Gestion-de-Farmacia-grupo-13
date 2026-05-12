package models;

import abstractas.Medicamento;
import interfaces.Alertable;
import interfaces.Vendible;

public class MedicamentoMarca extends Medicamento
        implements Vendible, Alertable {

    private String marcaComercial;
    private boolean patenteVigente;
    private String genericoEquivalente;

    public MedicamentoMarca(String id,
                            String nombre,
                            String principioActivo,
                            double precio,
                            int stockMinimo,
                            String marcaComercial,
                            boolean patenteVigente,
                            String genericoEquivalente) {

        super(id, nombre, principioActivo,
                precio, stockMinimo);

        this.marcaComercial = marcaComercial;
        this.patenteVigente = patenteVigente;
        this.genericoEquivalente = genericoEquivalente;
    }

    @Override
    public double calcularPrecio() {

        if (patenteVigente) {
            return precio * 1.2;
        }

        return precio;
    }

    @Override
    public boolean esVendible() {
        return stockDisponible() > 0;
    }

    @Override
    public void verificarStock() {

        if (stockDisponible() < stockMinimo) {
            System.out.println("Alerta de stock bajo");
        }
    }

    @Override
    public AlertaStock generarAlerta() {

        return new AlertaStock(
                "A001",
                "Stock Bajo",
                "ALTA"
        );
    }
}