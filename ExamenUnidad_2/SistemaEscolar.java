package ExamenUnidad_2;

/*
Desarrolla un sistema donde se pueda hacer gestión de materias y alumnos. 
- Gestionar materias
   - Crear materias
   - Eliminar materias
   - modificar materias
- Gestionar alumnos
   - Asignar materias
   - Asignar calificaciones de materias
   - Mostrar de manera ordenada por mejores promedios
   -  Mostrar de manera ordenada por calificación de X materia
*/

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opprin, contMaterias = 0, contAlumnos = 0;
        String[] materias = new String[100];
        String[] alumnos = new String[100];
        int[] calificaciones = new int[10];

        do {
            System.out.println("\n**********Bienvenido al sistema escolar**********");
            System.out.println("\n¿QUÉ DESEA HACER?\n");
            System.out.println("1. Gestionar materias");
            System.out.println("2. Gestionar Alumnos");
            System.out.println("3. Salir");
            opprin = sc.nextInt();

            switch (opprin) {
                case 1:
                    System.out.println("*****************Gestionar Materias***************");
                    int opsec;

                    do {
                        System.out.println("¿QUÉ DESEA HACER?\n");
                        System.out.println("1. Crear materias");
                        System.out.println("2. Eliminar materias");
                        System.out.println("3. Modificar materias");
                        System.out.println("4. Listar materias");
                        System.out.println("5. Regresar");
                        System.out.println("\nSelecciona una opción: ");
                        opsec = sc.nextInt();

                        switch (opsec) {
                            case 1:
                                System.out.println("Ingresa el nombre de la materia: ");
                                sc.nextLine();
                                String nuevaMateria = sc.nextLine();
                                materias[contMaterias] = nuevaMateria;
                                contMaterias++;
                                break;
                            case 2:
                                if (contMaterias > 0) {
                                    System.out.println("Materias registradas:");
                                    for (int i = 0; i < contMaterias; i++) {
                                        System.out.println((i + 1) + ". " + materias[i]);
                                    }
                                    System.out.println("Ingresa el número de la materia a eliminar: ");
                                    int eliminar = sc.nextInt();

                                    if (eliminar >= 1 && eliminar <= contMaterias) {
                                        for (int i = eliminar - 1; i < contMaterias - 1; i++) {
                                            materias[i] = materias[i + 1];
                                        }
                                        contMaterias--;
                                        System.out.println("Materia eliminada con éxito.");
                                    } else {
                                        System.out.println("Número de materia no válido.");
                                    }
                                } else {
                                    System.out.println("No hay materias registradas.");
                                }
                                break;
                            case 3:
                                if (contMaterias > 0) {
                                    System.out.println("Materias registradas:");
                                    for (int i = 0; i < contMaterias; i++) {
                                        System.out.println((i + 1) + ". " + materias[i]);
                                    }
                                    System.out.println("Ingresa el número de la materia a modificar: ");
                                    int modificar = sc.nextInt();

                                    if (modificar >= 1 && modificar <= contMaterias) {
                                        System.out.println("Ingresa el nuevo nombre de la materia: ");
                                        sc.nextLine();
                                        String nuevoNombre = sc.nextLine();
                                        materias[modificar - 1] = nuevoNombre;
                                        System.out.println("Materia modificada con éxito.");
                                    } else {
                                        System.out.println("Número de materia no válido.");
                                    }
                                } else {
                                    System.out.println("No hay materias registradas.");
                                }
                                break;
                            case 4:
                                System.out.println("Materias registradas:");
                                for (int i = 0; i < contMaterias; i++) {
                                    System.out.println((i + 1) + ". " + materias[i]);
                                }
                                break;
                            case 5:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    } while (opsec != 5);
                    break;
                case 2:
                    System.out.println("*****************Gestionar Alumnos*****************");
                    int opsec2;
                    do {
                        System.out.println("\n¿QUÉ DESEA HACER?\n");
                        System.out.println("1. Asignar materias");
                        System.out.println("2. Asignar calificaciones de materias");
                        System.out.println("3. Mostrar de manera ordenada por mejores promedios");
                        System.out.println("4. Mostrar de manera ordenada por calificación de X materia");
                        System.out.println("5. Regresar");
                        System.out.println("\nSelecciona una opción: ");
                        opsec2 = sc.nextInt();
                        switch (opsec2) {
                            case 1:
                                System.out.println("Asignación de Materias: ");
                                System.out.println("Ingresa el nombre del alumno: ");
                                sc.nextLine();
                                String nombreAlumno = sc.nextLine();
                                alumnos[contAlumnos] = nombreAlumno;
                                System.out.println("Materias registradas:");
                                for (int i = 0; i < contMaterias; i++) {
                                    System.out.println((i + 1) + ". " + materias[i]);
                                }
                                System.out.println("Ingresa el número de materias a asignar: ");
                                int numMaterias = sc.nextInt();
                                for (int i = 0; i < numMaterias; i++) {
                                    System.out.println("Ingresa el número de la materia a asignar: ");
                                    int numMateria = sc.nextInt();
                                    if (numMateria >= 1 && numMateria <= contMaterias) {
                                    } else {
                                        System.out.println("Número de materia no válido.");
                                    }
                                }
                                contAlumnos++;
                                break;
                            case 2:
                                System.out.println("Asignación de Calificaciones:");
                                for (int i = 0; i < calificaciones.length; i++) {
                                    calificaciones[i] = (int) (Math.random() * 10) + 1;
                                }
                                System.out.println("\nCALIFICACIONES ASIGNADAS CORRECTAMENTE\n");
                                break;
                            case 3:
                                System.out.println("\nMostrando mejores promedios: ");
                                // Zona de ordenamiento de calificaciones
                                for (int i = 0; i < calificaciones.length - 1; i++) {
                                    for (int j = 0; j < calificaciones.length - 1; j++) {
                                        if (calificaciones[j] < calificaciones[j + 1]) {
                                            int aux = calificaciones[j];
                                            calificaciones[j] = calificaciones[j + 1];
                                            calificaciones[j + 1] = aux;
                                        }
                                    }
                                }
                                // Zona de impresión de calificaciones
                                for (int i = 0; i < calificaciones.length; i++) {
                                    System.out.println("Calificación " + (i + 1) + ": "+ calificaciones[i]);
                                }
                                break;
                            case 4:
                                System.out.println("Mostrando calificaciones de materia en específico: ");

                                break;
                            case 5:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    } while (opsec2 != 5);
                    break;
                case 3:
                    System.out.println("**************************************************");
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opprin != 3);
        sc.close();
    }
}
