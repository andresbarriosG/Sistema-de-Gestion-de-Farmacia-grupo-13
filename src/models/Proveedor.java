package models;

import java.util.List;

public class Proveedor {

    private String idProveedor;
    private String nombre;
    private String contacto;
    private List<String> tipoMedicamento;

    public Proveedor(String idProveedor,
                     String nombre,
                     String contacto,
                     List<String> tipoMedicamento) {

        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.tipoMedicamento = tipoMedicamento;
    }

    public Lote suministrarLote() {

        return new Lote(
                "L001",
                java.time.LocalDate.now().plusDays(365),
                100,
                15000
        );
    }

    public void actualizarCatalogo() {
        System.out.println("Catálogo actualizado");
    }
}