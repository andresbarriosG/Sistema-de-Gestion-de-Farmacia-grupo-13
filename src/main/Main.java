package main;

import java.time.LocalDate;
import java.util.Arrays;

import models.FormulaMedica;
import models.Lote;
import models.MedicamentoGenerico;
import models.MedicamentoMarca;
import models.Venta;

public class Main {

    public static void main(String[] args) {

        MedicamentoGenerico generico =
                new MedicamentoGenerico(
                        "M001",
                        "Acetaminofen",
                        "Paracetamol",
                        5000,
                        10,
                        "MK",
                        false,
                        "INV123"
                );

        MedicamentoMarca marca =
                new MedicamentoMarca(
                        "M002",
                        "Dolex",
                        "Paracetamol",
                        12000,
                        5,
                        "Bayer",
                        true,
                        "Acetaminofen"
                );

        Lote lote1 =
                new Lote(
                        "L001",
                        LocalDate.now().plusDays(200),
                        50,
                        2000
                );

        generico.agregarLote(lote1);

        Venta venta = new Venta("V001", false);

        venta.agregarMedicamento(generico);
        venta.agregarMedicamento(marca);

        venta.procesarVenta();

        System.out.println(
                venta.generarRecibo()
        );

        FormulaMedica formula =
                new FormulaMedica(
                        "F001",
                        "Dr. Juan",
                        LocalDate.now(),
                        Arrays.asList(
                                "Acetaminofen",
                                "Dolex"
                        )
                );

        System.out.println(
                "Formula válida: "
                        + formula.esValida()
        );
    }
}