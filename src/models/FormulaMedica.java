package models;

import java.time.LocalDate;
import java.util.List;

public class FormulaMedica {

    private String codigoFormula;
    private String medico;
    private LocalDate fechaEmision;
    private List<String> medicamentosFormulados;

    public FormulaMedica(String codigoFormula,
                         String medico,
                         LocalDate fechaEmision,
                         List<String> medicamentosFormulados) {

        this.codigoFormula = codigoFormula;
        this.medico = medico;
        this.fechaEmision = fechaEmision;
        this.medicamentosFormulados = medicamentosFormulados;
    }

    public boolean esValida() {
        return fechaEmision.plusDays(30)
                .isAfter(LocalDate.now());
    }

    public void verificarMedicamentos() {
        System.out.println("Medicamentos verificados");
    }

    public int diasVigencia() {

        return fechaEmision.plusDays(30)
                .getDayOfYear()
                - LocalDate.now().getDayOfYear();
    }
}