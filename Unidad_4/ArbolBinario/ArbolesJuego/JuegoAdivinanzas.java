package ArbolesJuego;

import java.util.Scanner;

public class JuegoAdivinanzas {

    public static void main(String[] args) {
        // Zona de declaración de variables
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        // Zona de juego
        System.out.println("***********************************");
        System.out.println("JUEGO DE ADIVINAR\n");
        arbol.raiz = new Nodo("¿Tiene tentáculos?",
                new Nodo("pulpo"),
                new Nodo("¿Tiene rayas?", new Nodo("cebra"), new Nodo("jirafa")));

        System.out.println("Piensa en un objeto:");
        jugar(arbol.raiz, scanner);
        System.out.println("Gracias por jugar. Hasta luego.");
    }

    private static void jugar(Nodo nodo, Scanner scanner) {
        while (true) {
            if (nodo.izquierdo != null && nodo.derecho != null) {
                System.out.println(nodo.valor + " (Responde si/no)");
                String respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("si")) {
                    nodo = nodo.izquierdo;
                } else if (respuesta.equals("no")) {
                    nodo = nodo.derecho;
                } else {
                    System.out.println("¡RESPUESTA NO VÁLIDA!, GAME OVER\n");
                    break;
                }
            } else {
                System.out.println("¿Es " + nodo.valor + "? (Responde si/no)");
                String respuesta = scanner.nextLine().toLowerCase();

                if (respuesta.equals("si")) {
                    System.out.println("¡ADIVINÉ, FIN DEL JUEGO!\n");
                } else {
                    System.out.println("No he adivinado. Fin del juego.");
                }
                break;
            }
        }
    }
}
