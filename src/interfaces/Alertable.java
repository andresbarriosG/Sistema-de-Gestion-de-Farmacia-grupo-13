package interfaces;

import models.AlertaStock;

public interface Alertable {

    void verificarStock();

    AlertaStock generarAlerta();
}