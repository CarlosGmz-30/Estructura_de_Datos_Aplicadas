package EjercicioManipulacionTareas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Zona de declaración de variables
        Queue<tarea> colaTareas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opprin = 0;

        // Zona de menú principal
        do {
            System.out.println("------------ LISTA DE TAREAS ------------\n");
            System.out.println("¿Qué desea hacer?\n");
            System.out.println("1.Añadir tarea\n2.Consultar tarea\n3.Completar tarea\n4.Salir");
            System.out.print("\nSelecciona una opción: ");
            opprin = sc.nextInt();
            sc.nextLine();
            switch (opprin) {
                case 1:
                    System.out.println("\n----------- AÑADIR TAREA -----------\n");
                    System.out.print("Título de tarea: ");
                    String titulo = sc.nextLine();
                    System.out.print("Instrucciones de tarea: ");
                    String instrucciones = sc.nextLine();
                    System.out.print("Fecha de entrega: ");
                    String fechaEntrega = sc.nextLine();
                    // Creamos una nueva tarea y la añadimos a nuestra cola
                    tarea nuevaTarea = new tarea(titulo, instrucciones, fechaEntrega);
                    colaTareas.add(nuevaTarea);
                    System.out.println("\n¡TAREA AGREGADA CON ÉXITO!\n");
                    break;
                case 2:
                    System.out.println("\n---------- CONSULTAR TAREA ---------\n");
                    if (colaTareas.isEmpty()) {
                        System.out.println("¡NO HAY TAREAS REGISTRADAS AÚN!\n");
                    } else {
                        for (tarea tarea : colaTareas) {
                            System.out.println("Tarea: " + tarea.getTitulo());
                            System.out.println("Instrucciones: " + tarea.getInstrucciones());
                            System.out.println("Fecha de entrega: " + tarea.getFechaEntrega());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n---------- COMPLETAR TAREA ---------\n");
                    if (colaTareas.isEmpty()) {
                        System.out.println("¡NO HAY TAREAS REGISTRADAS AÚN!\n");
                    } else {
                        int numTareasCompletadas = colaTareas.size();
                        for (int i = 0; i < numTareasCompletadas; i++) {
                            tarea tarea = colaTareas.poll();
                            System.out.println("Tarea [" + tarea.getTitulo() + "] completada correctamente");
                        }
                        System.out.println("\n¡TODAS LAS TAREAS COMPLETADAS!\n");
                    }
                    break;
                case 4:
                    System.out.println("\nSALIENDO...\n");
                    sc.close();
                    break;
                default:
                    System.out.println("¡ERROR! Selecciona una opción válida");
                    break;
            }
        } while (opprin != 4);
    }
}
