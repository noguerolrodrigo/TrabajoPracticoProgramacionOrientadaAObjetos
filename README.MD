# Trabajo Práctico Programación Orientada a Objetos

## Descripción

Se resuelve el caso de **Gestión de Empleados**, aplicando los siguientes conceptos:

- Uso de `this` en constructores.
- Sobrecarga de constructores.
- Sobrecarga de métodos.
- Atributos y métodos estáticos.
- Método `toString()` para mostrar información de los objetos.

## Paquete utilizado

### poo.empleados

## Clases implementadas

### Clase `Empleado`

#### Atributos:

- `id`: Identificador único del empleado (entero).
- `nombre`: Nombre del empleado (String).
- `puesto`: Puesto del empleado (String).
- `salario`: Salario del empleado (double).
- `totalEmpleados`: Contador total de empleados (atributo estático).
- `generadorId`: Generador automático de IDs (atributo estático).

#### Constructores:

- Constructor que recibe: `id`, `nombre`, `puesto` y `salario`.
- Constructor que recibe: `nombre` y `puesto`. Asigna ID automático y salario por defecto.

#### Métodos:

- `actualizarSalario(double porcentaje)`: Aumenta el salario según el porcentaje recibido.
- `actualizarSalario(int montoFijo)`: Aumenta el salario según el monto fijo recibido.
- `toString()`: Devuelve un String con los datos del empleado.
- `mostrarTotalEmpleados()`: Retorna el total de empleados creados (método estático).

### Clase `TestEmpleados`

- Instancia empleados usando ambos constructores.
- Aplica aumentos de salario usando los métodos sobrecargados.
- Muestra la información de cada empleado.
- Muestra el total de empleados creados.


