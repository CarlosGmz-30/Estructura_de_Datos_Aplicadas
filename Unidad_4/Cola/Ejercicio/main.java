import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            // Zona de declaración de variables
            Scanner sc = new Scanner(System.in);
            cola<tarea> colaTarea = new cola<>();
            int opprin = 0;

            // Zona de menú principal
            do {
                System.out.println("---------- COLA DE TAREAS ----------\n");
                System.out.println("¿Qué desea hacer?\n");
                System.out.println(
                        "1.Agregar Tarea\n2.Eliminar Tarea\n3.Mostrar Tareas\n4.Ejecutar Tareas\n5.Salir");
                System.out.print("\nSelecciona una opción: ");
                opprin = sc.nextInt();
                sc.nextLine();

                switch (opprin) {
                    case 1:
                        System.out.println("\n---------- AGREGAR TAREA -----------\n");
                        agregarTarea(sc, colaTarea);
                        break;
                    case 2:
                        System.out.println("\n---------- ELIMINAR TAREA ----------\n");
                        eliminarTarea(colaTarea);
                        break;
                    case 3:
                        System.out.println("\n---------- MOSTRAR TAREAS ----------\n");
                        mostrarTarea(colaTarea);
                        break;
                    case 4:
                        System.out.println("\n---------- EJECUTAR TAREAS -----------\n");
                        ejecutarTareas(colaTarea);
                        break;
                    case 5:
                        System.out.println("\nSALIENDO...\n");
                        break;
                    default:
                        System.out.println("\n¡OPCIÓN INVÁLIDA!");
                        break;
                }
            } while (opprin != 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para agregar tarea
    private static void agregarTarea(Scanner sc, cola<tarea> cola) {
        try {
            if (!cola.colaLlena()) {
                System.out.print("Título de tarea: ");
                String tittle = sc.nextLine();
                System.out.print("Ingresa fecha: ");
                String creationTime = sc.nextLine();
                System.out.print("Ingresa descripción: ");
                String description = sc.nextLine();

                // Creamos una instancia de tarea
                tarea tarea = new tarea(tittle, creationTime, description);

                // Agregamos la tarea a nuestra cola
                cola.insertar(tarea);
                System.out.println("\n¡TAREA AGREGADA EXITOSAMENTE!\n");
            }
        } catch (Exception e) {
            System.out.println("\n¡LISTA DE TAREAS LLENA!\n");
        }
    }

    // Método para eliminar tarea
    private static void eliminarTarea(cola<tarea> cola) {
        try {
            tarea tarea = cola.quitar();
            System.out.println("Tarea eliminada: " + tarea.getTittle() + "\n");
        } catch (Exception e) {
            System.out.println("¡SIN TAREAS REGISTRADAS!\n");
        }
    }

    // Método para mostrar tarea
    private static void mostrarTarea(cola<tarea> cola) {
        System.out.println("TAREAS EN COLA:\n");
        cola.mostrar();
    }

    // Método para ejecutar tarea
    private static void ejecutarTareas(cola<tarea> cola) {
        if (cola.colaVacia()) {
            System.out.println("¡SIN TAREAS REGISTRADAS!\n");
        } else {
            while (!cola.colaVacia()) {
                try {
                    tarea tarea = cola.quitar();
                    System.out.println(
                            "Ejecutando tarea: " + tarea.getTittle());
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("¡ERROR!");
                }
            }
            System.out.println("\n!TODAS LAS TAREAS EJECUTADAS¡\n");
            cola.reiniciarCola();
        }
    }
}
