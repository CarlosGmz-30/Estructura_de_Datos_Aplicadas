package EjercicioTorreHanoi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            // Zona de declaración de variables
            torreHanoi juego = new torreHanoi();
            Scanner sc = new Scanner(System.in);
            int origen, destino;


            // Zona de juego
            System.out.println("---------- TORRE DE HANOI ----------\n");
            System.out.println("INSTRUCCIONES: Ingresa la torre de origen y\nseguido de esto la torre de destino a dónde\nquerrás mover tu disco.\n");

            do {
                juego.mostrarTorres();
                System.out.print("Ingresa torre de origen: ");
                origen = sc.nextInt();
                origen = origen - 1;
                System.out.print("Ingresa torre de destino: ");
                destino = sc.nextInt();
                destino = destino - 1;
                juego.moverDisco(origen, destino);
                juego.mostrarTorres();
            } while (!juego.gameOver());
            System.out.println("¡FIN DEL JUEGO!, Todos los discos están en la torre 3");
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
