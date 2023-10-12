package ExamenUnidad_2;

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opprin, contMaterias = 0;
        String[] materias = new String[100];

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
                    System.out.println("*****************Gestionar Alumnos (pendiente)***************");
                    break;
                case 3:
                    System.out.println("**************************************************");
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opprin != 3);
    }
}
