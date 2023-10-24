package ArreglosBidimensionales;

import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {

        // Zona de variables
        char Player1 = 'X';
        char Player2 = 'O';
        boolean fin = false;
        Scanner sc = new Scanner(System.in);

        // Zona de arreglos
        char[][] tablero = new char[3][3];

        // Tablero
        System.out.println("JUEGO DE GATO\n");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
                System.out.print("[" + tablero[i][j] + "] ");
            }
            System.out.println();
        }

        // Turnos
        char turnoActual = Player1;

        // Zona de juego
        do {
            boolean repetir;

            do {
                repetir = false;

                System.out.println("\nTurno de " + turnoActual);
                System.out.print("Fila:");
                int fila = sc.nextInt();
                System.out.print("Columna:");
                int columna = sc.nextInt();

                if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {
                    System.out.println("Casilla inválida, prueba con otra");
                    repetir = true;
                } else {
                    tablero[fila][columna] = turnoActual;
                }

            } while (repetir);

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print("[" + tablero[i][j] + "] ");
                }
                System.out.println();
            }

            if (tablero[0][0] == turnoActual && tablero[0][1] == turnoActual && tablero[0][2] == turnoActual ||
                    tablero[1][0] == turnoActual && tablero[1][1] == turnoActual && tablero[1][2] == turnoActual ||
                    tablero[2][0] == turnoActual && tablero[2][1] == turnoActual && tablero[2][2] == turnoActual ||
                    tablero[0][0] == turnoActual && tablero[1][0] == turnoActual && tablero[2][0] == turnoActual ||
                    tablero[0][1] == turnoActual && tablero[1][1] == turnoActual && tablero[2][1] == turnoActual ||
                    tablero[0][2] == turnoActual && tablero[1][2] == turnoActual && tablero[2][2] == turnoActual ||
                    tablero[0][0] == turnoActual && tablero[1][1] == turnoActual && tablero[2][2] == turnoActual ||
                    tablero[2][0] == turnoActual && tablero[1][1] == turnoActual && tablero[0][2] == turnoActual) {
                System.out.println("\nGanador " + turnoActual);
                System.out.println("Fin del juego");
                fin = true;
            } else {
                if (turnoActual == Player1) {
                    turnoActual = Player2;
                } else {
                    turnoActual = Player1;
                }
            }

        } while (!fin);
        sc.close();
    }
}
