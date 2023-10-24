package Operaciones_Arreglos;

import java.util.Scanner;
/*
Buscador y conteo de palabras (conteo como Word) El usuario debe ingresar un escrito,
extenso de preferencia y el sistema debe de pedir una palabra a buscar en el texto
(esta puede ser repetitiva) por lo que podrá buscar.
*/

public class splitArray {
    public static void main(String[] args) {

        // Zona de variables
        String texto = "";
        String palabra = "";
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        // Zona de entrada de datos
        System.out.println("\n = BIENVENIDO AL BUSCADOR DE PALABRAS =\n");
        System.out.println("Ingrese el texto del que desea  buscar una palabra: ");
        texto = sc.nextLine();
        System.out.println("Ingrese la palabra que desea buscar: ");
        palabra = sc.nextLine();
        System.out.println("");

        // Zona de operaciones
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                contador++;
            }
        }

        // Zona de salida de datos
        System.out.println("La palabra [" + palabra + "] se repite " + contador + " veces.");
        sc.close();
    }
}
