package abstractas;

import java.util.ArrayList;
import java.util.List;

import interfaces.Controlable;
import models.Lote;

public abstract class Medicamento implements Controlable {

    protected String id;
    protected String nombre;
    protected String principioActivo;
    protected double precio;
    protected int stockMinimo;

    protected List<Lote> lotes;

    public Medicamento(String id, String nombre,
                        String principioActivo,
                        double precio,
                        int stockMinimo) {

        this.id = id;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.precio = precio;
        this.stockMinimo = stockMinimo;
        this.lotes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    @Override
    public void agregarLote(Lote lote) {
        lotes.add(lote);
    }

    @Override
    public int stockDisponible() {

        int total = 0;

        for (Lote lote : lotes) {
            total += lote.getCantidadDisponible();
        }

        return total;
    }

    protected void aplicarDescuento() {
        precio *= 0.95;
    }

    public abstract double calcularPrecio();
}