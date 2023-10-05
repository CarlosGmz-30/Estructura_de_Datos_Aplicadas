package Operaciones_Arreglos;

import java.util.Scanner;
import java.util.Random;

/*
Tienen que iterar un arreglo de 8 (cantidad opcional) números llenados
por números aleatorios, posteriormente el usuario debe indicar un número
y el sistema debe buscar hastas que encuentre la coincidencia. Después
debe separar los dos arreglos y que los presente de forma lineal.
 */

public class splitRandom {
    public static void main(String[] args) {

        // Zona de declarar variables
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int cont = 0;
        int posicion = 0;

        // Zona de entrada de datos
        System.out.println("Ingresa cantidad de números para el arreglo: ");
        int cantidad = sc.nextInt();

        System.out.println("\nArreglo de números aleatorios: ");
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
            System.out.print(numeros[i] + ", ");
        }

        System.out.println("\n\nIngresa el número a partir del que desea separará el arreglo: ");
        int buscar = sc.nextInt();

        // Zona de operaciones
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar && cont == 0) {
                posicion = i + 1;
                cont++;
            }
        }

        int[] arr1 = new int[posicion - 1];
        int[] arr2 = new int[numeros.length - posicion];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = numeros[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = numeros[i + posicion];
        }

        // Zona de salida de datos
        System.out.println("\nAreglo 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nArreglo 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        sc.close();
    }
}
