package interfaces;

import models.Lote;

public interface Controlable {

    void agregarLote(Lote lote);

    int stockDisponible();
}