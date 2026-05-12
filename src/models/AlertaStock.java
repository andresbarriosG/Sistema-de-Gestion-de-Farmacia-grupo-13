package models;

import java.time.LocalDate;

public class AlertaStock {

    private String idAlerta;
    private String tipoAlerta;
    private LocalDate fechaGeneracion;
    private String nivelUrgencia;

    public AlertaStock(String idAlerta,
                       String tipoAlerta,
                       String nivelUrgencia) {

        this.idAlerta = idAlerta;
        this.tipoAlerta = tipoAlerta;
        this.nivelUrgencia = nivelUrgencia;
        this.fechaGeneracion = LocalDate.now();
    }

    public void notificar() {
        System.out.println("Notificación enviada");
    }

    public void resolverAlerta() {
        System.out.println("Alerta resuelta");
    }
}