import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            // Zona de declaración de variables
            Scanner sc = new Scanner(System.in);
            cola<paquete> colaPaquete = new cola<>();
            int opprin;

            // Zona de menú principal
            do {
                System.out.println("--------------- PAQUETERÍA ---------------\n");
                System.out.println("¿Qué desea hacer?");
                System.out.println(
                        "1.Agregar paquete\n2.Postergar paquete\n3.Cancelar paquete\n4.Entregar paquetes\n5.Salir");
                System.out.print("\nSelecciona una opción: ");
                opprin = sc.nextInt();
                sc.nextLine();
                switch (opprin) {
                    case 1:
                        System.out.println("\n------------ AGREGAR PAQUETE -----------\n");
                        break;
                    case 2:
                        System.out.println("\n----------- POSTERGAR PAQUETE ----------\n");
                        break;
                    case 3:
                        System.out.println("\n------------ CANCELAR PAQUETE ----------\n");
                        break;
                    case 4:
                        System.out.println("\n----------- ENTREGAR PAQUETES ----------\n");
                        break;
                    case 5:
                        System.out.println("\nSALIENDO...\n");
                        break;
                    default:
                        System.out.println("¡ERROR!, selecciona una opción válida");
                        break;
                }
            } while (opprin != 5);
        } catch (Exception e) {

        }
    }

    // Método para agregar un paquete
    private static void agregarPaquete(Scanner sc, cola<paquete> colaPaquete) {
        try {
            if (!colaPaquete.colaLlena()) {
                System.out.print("Nombre del paquete: ");
                String nombre = sc.nextLine();
                System.out.print("Dirección: ");
                String direccion = sc.nextLine();

                // Creamos una instancia de paquete
                paquete paquete = new paquete(nombre, direccion);

                // Agregamos el paquete a nuestra cola
                colaPaquete.insertar(paquete);
                System.out.println("¡PAQUETE AGREGADO CORRECTAMENTE!");
            }
        } catch (Exception e) {
            System.out.println("¡LISTA DE PAQUETES LLENA!");
        }
    }

    // Método para eliminar la tarea
    public static void eliminarTarea(cola<paquete> colaPaquete) {
        try {
            paquete paquete = colaPaquete.quitar();
        } catch (Exception e) {
            
        }
    }
}
