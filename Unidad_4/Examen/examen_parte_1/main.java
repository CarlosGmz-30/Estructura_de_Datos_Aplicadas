import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            // Zona de declaración de variables
            manejoPilas manejo = new manejoPilas();
            Scanner sc = new Scanner(System.in);
            int opprin = 0, origen, destino;

            do {
                System.out.println("---------- MANEJO DE PILAS ----------\n");
                System.out.println("¿Qué desea hacer?\n");
                System.out.println("1.Mover colores\n2.Salir");
                System.out.print("\nSelecciona una opción: ");
                opprin = sc.nextInt();
                switch (opprin) {
                    case 1:
                        System.out.println("\n---------- MOVER COLORES ----------");
                        manejo.mostrarPilas();
                        System.out.print("Ingresa la pila de origen: ");
                        origen = sc.nextInt();
                        origen = origen - 1;
                        System.out.print("Ingresa la pila de destino: ");
                        destino = sc.nextInt();
                        destino = destino - 1;
                        System.out.println("-------------------------------------\n");
                        manejo.moverPila(origen, destino);
                        break;
                    case 2:
                        System.out.println("\n-------------------------------------");
                        System.out.println("SALIENDO...\n");
                        sc.close();
                        break;
                    default:
                        break;
                }

            } while (opprin != 2);

        } catch (Exception e) {
            System.out.println("¡ERROR!");
        }
    }
}
