package gestionTareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zona de declaración de lista de tipo tarea
        List<tarea> listaTareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Zona de declaración de variables
        String nombre;
        String descripcion;
        Boolean estado;
        int opprin, opsec;

        // Zona de menú principal
        do {
            System.out.println("--------------------------------------");
            System.out.println("GESTIÓN DE TAREAS\n");
            System.out.println("¿Qué desea hacer?\n");
            System.out.println(
                    "1.Agregar tarea\n2.Mostrar tareas\n3.Completar tarea\n4.Eliminar tarea\n5.Consulta distinguida\n6.Salir");
            System.out.println("\nSelecciona una opción: ");
            opprin = sc.nextInt();
            sc.nextLine();
            switch (opprin) {
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("AGREGAR TAREA:\n");
                    System.out.print("Título: ");
                    nombre = sc.nextLine();
                    System.out.print("Descripción: ");
                    descripcion = sc.nextLine();
                    estado = false;

                    // Agregamos nuestra tarea a la lista
                    tarea listaTarea = new tarea(nombre, descripcion, estado);
                    listaTareas.add(listaTarea);
                    System.out.println("\n¡TAREA CREADO CON ÉXITO!");
                    break;
                case 2:
                    System.out.println("--------------------------------------");
                    System.out.println("MOSTRAR TAREAS:\n");
                    // Validamos si ya existen tareas registradas
                    if (listaTareas.isEmpty()) {
                        System.out.println("¡NO HAY TAREAS REGISTRADAS AÚN!\n");
                    } else {
                        for (tarea mostrarTarea : listaTareas) {
                            System.out.println("Título: " + mostrarTarea.getNombre() +
                                    "\nDescripción: " + mostrarTarea.getDescripcion() +
                                    "\nEstado: " + mostrarTarea.getEstado() + "\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    System.out.println("COMPLETAR TAREA:\n");
                    // Imprimimos nuestra lista si es que hay datos
                    if (listaTareas.isEmpty()) {
                        System.out.println("¡NO HAY TAREAS REGISTRADAS AÚN!\n");
                    } else {
                        System.out.println("Tareas Disponibles: ");
                        System.out.println("--------------------------------------");
                        for (tarea mostrarTarea : listaTareas) {
                            System.out.println("Título: " + mostrarTarea.getNombre() +
                                    "\nDescripción: " + mostrarTarea.getDescripcion() +
                                    "\nEstado: " + mostrarTarea.getEstado() + "\n");
                            System.out.println("--------------------------------------");
                        }

                        System.out.print("Nombre de tarea a completar: ");
                        nombre = sc.nextLine();
                        for (tarea buscarTarea : listaTareas) {
                            if (buscarTarea.getNombre().equals(nombre)) {
                                buscarTarea.setEstado(true);
                                System.out.println("\n¡TAREA COMPLETADA CORRECTAMENTE!\n");
                            } else {
                                System.out.println("¡TAREA NO ENCONTRADA!");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("--------------------------------------");
                    System.out.println("ELIMINAR TAREA:\n");
                    // Imprimimos nuestra lista si es que hay datos
                    if (listaTareas.isEmpty()) {
                        System.out.println("¡NO HAY TAREAS REGISTRADAS AÚN!\n");
                    } else {
                        System.out.println("Tareas Disponibles:\n");
                        for (tarea mostrarTarea : listaTareas) {
                            System.out.println("Título: " + mostrarTarea.getNombre() +
                                    "\nDescripción: " + mostrarTarea.getDescripcion() +
                                    "\nEstado: " + mostrarTarea.getEstado() + "\n");
                            System.out.println("--------------------------------------");
                        }

                        System.out.print("Nombre de tarea a eliminar: ");
                        nombre = sc.nextLine();
                        // Creamos una lista temporal para eliminar contacto
                        List<tarea> eliminarTarea = new ArrayList<>();
                        for (tarea buscarTarea : listaTareas) {
                            if (buscarTarea.getNombre().equals(nombre)) {
                                eliminarTarea.add(buscarTarea);
                            }
                        }
                        if (!eliminarTarea.isEmpty()) {
                            listaTareas.removeAll(eliminarTarea);
                            System.out.println("\n¡TAREA ELIMINADA CORECTAMENTE!");
                        } else {
                            System.out.println("\n¡TAREA NO ENCONTRADA");
                        }
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------------");
                    System.out.println("CONSULTA DISTINGUIDA:\n");
                    // Validamos si la lista está vacía
                    if (listaTareas.isEmpty()) {
                        System.out.println("¡NO HAY TAREAS REGISTRADAS AÚN!\n");
                    } else {
                        System.out.println("CONSULTAR POR:\n");
                        System.out.println("1.Tareas terminadas\n2.Tareas pendientes");
                        System.out.println("\nSelecciona una opción: ");
                        opsec = sc.nextInt();
                        sc.nextLine();
                        switch (opsec) {
                            case 1:
                                System.out.println("--------------------------------------");
                                System.out.println("TAREAS TERMINADAS:\n");
                                for (tarea tareasTerminadas : listaTareas) {
                                    if (tareasTerminadas.getEstado() == true) {
                                        System.out.println("Título: " + tareasTerminadas.getNombre() +
                                                "\nDescripción: " + tareasTerminadas.getDescripcion());
                                    }
                                }
                                break;
                            case 2:

                                System.out.println("--------------------------------------");
                                System.out.println("TAREAS PENDIENTES:\n");
                                for (tarea tareasPendientes : listaTareas) {
                                    if (tareasPendientes.getEstado() == false) {
                                        System.out.println("Título: " + tareasPendientes.getNombre() +
                                                "\nDescripción: " + tareasPendientes.getDescripcion());
                                    }
                                }
                                break;
                            default:
                                System.out.println("\n¡OPCIÓN INVÁLIDA!");
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("--------------------------------------");
                    System.out.println("SALIENDO...\n");
                    sc.close();
                    break;
                default:
                    System.out.println("\n¡OPCIÓN INVÁLIDA!");
                    break;
            }
        } while (opprin != 6);
    }
}
