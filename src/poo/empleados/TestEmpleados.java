package poo.empleados;

public class TestEmpleados {

    public static void main(String[] args) {
        // Creamos empleados usando ambos constructores
        Empleado e1 = new Empleado(1001, "Rodrigo Noguerol", "Programador", 75000);
        Empleado e2 = new Empleado("Juan Pérez", "Diseñador");
        Empleado e3 = new Empleado("Ana López", "Tester");

        // Actualizamos salarios
        e1.actualizarSalario(10); // Aumenta 10%
        e2.actualizarSalario(5000); // Aumenta $5000
        e3.actualizarSalario(15); // Aumenta 15%

        // Mostramos la info de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostramos total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}

