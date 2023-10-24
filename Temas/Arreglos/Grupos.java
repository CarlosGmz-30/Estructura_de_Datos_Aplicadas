import java.util.Scanner;

public class Grupos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zona de variables
        int cant_grupos;
        int opprin;
        int opsec;

        // Zona de arreglos
        String[][] gruposNombres;
        int[] cantAlumnos;

        System.out.println("Ingrese cantidad de grupos que desea registrar: ");
        cant_grupos = sc.nextInt();

        gruposNombres = new String[cant_grupos][100];
        cantAlumnos = new int[cant_grupos];

        do {
            System.out.println("\n¿QUÉ DESEA HACER?\n1.Registrar alumnos\n2.Consultar alumnos\n3.Salir");
            System.out.println("\nSeleccione una opción:");
            opprin = sc.nextInt();
            switch (opprin) {
                case 1:
                    System.out.println("\n¿De qué grupo desea registrar alumnos?");
                    for (int i = 0; i < cant_grupos; i++) {
                        System.out.println((i + 1) + ". Grupo " + (i + 1));
                    }
                    System.out.println("\nSeleccione el grupo: ");
                    opsec = sc.nextInt();

                    if (opsec > 0 && opsec <= cant_grupos) {
                        sc.nextLine();
                        System.out.println("\nIngrese nombre del alumno: ");
                        String nombreAlumno = sc.nextLine();

                        if (cantAlumnos[opsec - 1] < 100) { 
                            gruposNombres[opsec - 1][cantAlumnos[opsec - 1]] = nombreAlumno;
                            cantAlumnos[opsec - 1]++;
                            System.out.println("Alumno registrado en el grupo " + opsec);
                        } else {
                            System.out.println("¡Grupo lleno! No se pueden registrar más alumnos.");
                        }
                    } else {
                        System.out.println("¡Grupo no registrado!");
                    }
                    break;

                case 2:
                    System.out.println("¿De qué grupo desea consultar alumnos?");
                    for (int i = 0; i < cant_grupos; i++) {
                        System.out.println((i + 1) + ". Grupo " + (i + 1));
                    }
                    System.out.println("Seleccione el grupo: ");
                    opsec = sc.nextInt();

                    if (opsec > 0 && opsec <= cant_grupos) {
                        System.out.println("Alumnos del Grupo " + opsec + ":");
                        for (int i = 0; i < cantAlumnos[opsec - 1]; i++) {
                            System.out.println("- " + gruposNombres[opsec - 1][i]);
                        }
                    } else {
                        System.out.println("¡Grupo no registrado!");
                    }
                    break;

                case 3:
                    sc.close();
                    System.out.println("¡Adiós capo!");
                    break;

                default:
                    System.out.println("¡OPCIÓN NO VÁLIDA!");
                    break;
            }
        } while (opprin != 3);
    }
}
