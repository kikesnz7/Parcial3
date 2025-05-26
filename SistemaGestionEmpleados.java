import java.util.Scanner;
class Mensajes {
    public static final String INTRODUCIR_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";
    public static final String LISTA_EMPLEADOS = "Lista de Empleados:";
}

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleados empleados = new Empleados(10); // Capacidad máxima de empleados

        // Dar de alta empleados de ejemplo
        empleados.darDeAltaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darDeAltaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.darDeAltaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(INTRODUCIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}

