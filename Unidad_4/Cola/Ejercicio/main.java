import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            // Zona de declaración de variables
            Scanner sc = new Scanner(System.in);
            cola<tarea> colaTarea = new cola<>();
            int opprin;

            // Zona de menú principal
            do {
                System.out.println("---------- COLA DE TAREAS ----------\n");
                System.out.println("¿Qué desea hacer?");
                System.out.println(
                        "1.Agregar Tarea\n2.Eliminar Tarea\n3.Mostrar Tareas\n4.Ejecutar Tarea\n5.Salir");
                System.out.print("\nSelecciona una opcíon: ");
                opprin = sc.nextInt();
                sc.nextLine();

                switch (opprin) {
                    case 1:
                        System.out.println("---------- AGREGAR TAREA -----------\n");

                        break;
                    case 2:
                        System.out.println("---------- ELIMINAR TAREA ----------\n");

                        break;
                    case 3:
                        System.out.println("---------- MOSTRAR TAREAS ----------\n");

                        break;
                    case 4:
                        System.out.println("---------- EJECUTAR TAREA -----------\n");

                        break;
                    case 5:
                        System.out.println("SALIENDO...\n");
                        break;
                    default:
                        System.out.println("¡OPCIÓN INVÁLIDA!");
                        break;
                }
            } while (opprin != 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
