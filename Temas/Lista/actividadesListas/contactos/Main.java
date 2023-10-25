package contactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zona de declaración de lista de tipo Contacto
        List<Contacto> contactos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Zona de declaración de variables
        String nombre;
        String telefono;
        String correo;
        int opprin, opsec;

        // Zona de menú principal
        do {
            System.out.println("--------------------------------------");
            System.out.println("AGENDA PERSONAL\n");
            System.out.println("¿Qué desea hacer?\n");
            System.out.println("1.Agregar contacto\n2.Eliminar contacto\n3.Buscar contacto\n4.Salir");
            System.out.println("\nSelecciona una opción:");
            opprin = sc.nextInt();
            sc.nextLine();
            switch (opprin) {
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("AGREGAR CONTACTO\n");
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    telefono = sc.nextLine();
                    System.out.print("Correo: ");
                    correo = sc.nextLine();

                    // Agregamos el contacto a nuestra lista
                    Contacto contacto = new Contacto(nombre, telefono, correo);
                    contactos.add(contacto);
                    System.out.println("\n¡CONTACTO AGREGADO CORRECTAMENTE!");
                    break;
                case 2:
                    System.out.println("--------------------------------------");
                    System.out.println("ELIMINAR CONTACTO\n");
                    System.out.print("Ingrese el nombre:");
                    nombre = sc.nextLine();
                    // Lista temporal para eliminar contacto
                    List<Contacto> eliminarContacto = new ArrayList<>();
                    for (Contacto buscarContacto : contactos) {
                        if (buscarContacto.getNombre().equals(nombre)) {
                            eliminarContacto.add(buscarContacto);
                        }
                    }
                    if (!eliminarContacto.isEmpty()) {
                        contactos.removeAll(eliminarContacto);
                        System.out.println("\n!CONTACTO ELIMINADO CORRECTAMENTE!");
                    } else {
                        System.out.println("\n¡CONTACTO NO ENCONTRADO!");
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    System.out.println("BUSCAR CONTACTO\n");
                    System.out.println("Buscar por:\n\n1.Nombre\n2.Teléfono");
                    System.out.println("\nSelecciona una opción: ");
                    opsec = sc.nextInt();
                    sc.nextLine();
                    switch (opsec) {
                        case 1:
                            System.out.println("--------------------------------------");
                            System.out.println("BUSCAR POR NOMBRE\n");
                            System.out.print("Ingrese nombre: ");
                            nombre = sc.nextLine();
                            for (Contacto buscarContacto : contactos) {
                                if (buscarContacto.getNombre().equals(nombre)) {
                                    System.out.println("¡CONTACTO ENCONTRADO!\n");
                                    System.out.println("Nombre: " + buscarContacto.getNombre() +
                                            "\nTeléfono: " + buscarContacto.getTelefono() +
                                            "\nCorreo: " + buscarContacto.getCorreo());
                                } else {
                                    System.out.println("\n¡CONTACTO NO ENCONTRADO!");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("--------------------------------------");
                            System.out.println("BUSCAR POR TELÉFONO\n");
                            System.out.print("Ingrese teléfono: ");
                            telefono = sc.nextLine();
                            for (Contacto buscarContacto : contactos) {
                                if (buscarContacto.getTelefono().equals(telefono)) {
                                    System.out.println("¡CONTACTO ENCONTRADO!\n");
                                    System.out.println("Nombre: " + buscarContacto.getNombre() +
                                            "\nTeléfono: " + buscarContacto.getTelefono() +
                                            "\nCorreo: " + buscarContacto.getCorreo());
                                } else {
                                    System.out.println("\n¡CONTACTO NO ENCONTRADO!");
                                }
                            }
                            break;
                        default:
                            System.out.println("\n¡OPCIÓN INVÁLIDA!");
                    }
                    break;
                case 4:
                    System.out.println("--------------------------------------");
                    System.out.println("SALIENDO...\n");
                    sc.close();
                    break;
                default:
                    System.out.println("\n¡OPCIÓN INVÁLIDA!");
            }
        } while (opprin != 4);
    }
}
