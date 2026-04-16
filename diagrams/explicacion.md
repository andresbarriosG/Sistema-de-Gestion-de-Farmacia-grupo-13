- Descripción
Este proyecto consiste en el diseño de un diagrama de clases UML para un sistema de gestión de farmacia.
El sistema permite administrar medicamentos (genéricos y de marca), controlar inventario mediante lotes, gestionar ventas con o sin fórmula médica, manejar proveedores y generar alertas de stock bajo.

El diseño sigue principios de buenas prácticas como SOLID, garantizando un modelo escalable, mantenible y modular.

- Objetivos
    Aplicar conceptos de:
        1. Clases, herencia e interfaces
        2. Relaciones UML (composición, agregación, asociación, dependencia)
        3. Multiplicidad (cardinalidad)
    Implementar principios SOLID en el diseño.

- Estructura del sistema
El sistema se organiza en tres niveles:

    1. Interfaces

    Definen los contratos de comportamiento:
    - Vendible → operaciones de venta
    - Controlable → gestión de inventario
    - Alertable → generación de alertas

    2. Clase Abstracta

    - Medicamento
    Clase central del sistema:
    Contiene atributos comunes:
        - id
        - nombre
        - precio
        - stock mínimo
    No puede instanciarse directamente
    Implementa las interfaces del sistema

    3.  Clases Concretas

    - MedicamentoGenerico
    Incluye:
        código INVIMA
        requiere fórmula médica

    - MedicamentoMarca
    Incluye:
        marca comercial
        patente vigente

    - Lote
    Representa unidades físicas del medicamento
    Contiene:
        número de lote
        fecha de vencimiento
        cantidad disponible

    - Venta
    Representa una transacción
    Contiene múltiples medicamentos
    Puede tener fórmula médica asociada

    -FormulaMedica
    Valida medicamentos prescritos
    Controla vigencia de la fórmula

    -Proveedor
    Suministra medicamentos al sistema

    -AlertaStock
    Se genera cuando el stock es bajo
    Permite notificar y gestionar alertas

- Relaciones UML

El sistema incluye los siguientes tipos de relaciones:

1. Herencia: MedicamentoGenerico y MedicamentoMarca extienden Medicamento.

2. Implementación: Medicamento implementa las interfaces.

3. Composición: Medicamento contiene Lotes

4. Agregación: Venta agrupa Medicamentos

5. Asociación: Venta se relaciona con FormulaMedica

6. Dependencia: Proveedor y AlertaStock usan otras clases

- Flujo del Sistema

1. Un proveedor suministra medicamentos en forma de lotes
2. Los medicamentos se almacenan en el inventario
3. Se realiza una venta con uno o varios medicamentos
4. Si aplica, se valida mediante una fórmula médica
5. El sistema monitorea el stock
6. Si el stock es bajo, se genera una alerta

- Cardinalidad 
    - Un medicamento tiene 1..* lotes (Composición): Un medicamento debe tener, como mínimo, un lote registrado para existir en el sistema, y puede tener muchos.
    - Una venta contiene 1..* medicamentos (Agregación): Para que una venta sea válida, debe incluir al menos un medicamento. No existe una "venta vacía". El * significa que el cliente puede llevarse todos los que quiera.
    - Una venta puede tener 0..1 fórmula médica (Asociación): Indica que la relación es opcional. 
    - Un proveedor suministra 1..* medicamentos (Asociación/Dependencia): Para que un proveedor esté en tu base de datos, debe suministrarte al menos un tipo de medicamento.


El desarrollo de este diagrama de clases UML permitió modelar de manera estructurada un sistema de gestión de farmacia, integrando conceptos clave de la Programación Orientada a Objetos como herencia, abstracción, encapsulamiento e implementación de interfaces.

A través de la correcta definición de clases, relaciones y cardinalidades, se logró representar el funcionamiento del sistema desde el manejo de inventario hasta el proceso de ventas y generación de alertas.