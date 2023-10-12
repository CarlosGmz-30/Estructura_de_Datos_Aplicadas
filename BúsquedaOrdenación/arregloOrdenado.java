package BúsquedaOrdenación;

/*
Genera un arreglo de números aleatorios de 100 datos con números de dos cifras. 
Utiliza un método de ordenamiento para ordenar el arreglo. Luego pide al usuario 
un número, utiliza la búsqueda binaria para indicar al usuario que el número se
encuentra o no el valor.
*/

import java.util.Scanner;
import java.util.Random;

public class arregloOrdenado {
    public static void main(String[] args) {

        // Zona de variables
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean comprobacion = false;

        // Zona de arreglos
        int[] arreglo = new int[100];

        // Zona de llenado de arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(90) + 10;
        }

        System.out.println("\nArreglo desordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Zona de ordenamiento de arreglo
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("\n\nArreglo ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Zona de entrada de datos por el usuario
        System.out.println("\n\nIngrese el número que desea buscar: ");
        numero = sc.nextInt();

        // Zona de comprobación de número
        for (int i = 0; i < arreglo.length; i++) {
            if (numero == arreglo[i]) {
                comprobacion = true;
                break;
            }
        }

        if (comprobacion != true) {
            System.out.println("El número no se encuentra en el arreglo");
        } else {
            // Zona de búsqueda binaria
            int centro, primero, ultimo, valorCentro;
            primero = 0;
            ultimo = arreglo.length - 1;
            boolean encontrado = false;
            while (primero <= ultimo && encontrado == false) {
                centro = (primero + ultimo) / 2;
                valorCentro = arreglo[centro];
                if (numero == valorCentro) {
                    encontrado = true;
                    System.out.println("\nEl número [" + numero + "] se encuentra en la posición " + (centro + 1));
                } else if (numero < valorCentro) {
                    ultimo = centro - 1;
                } else {
                    primero = centro + 1;
                }
            }
        }
        sc.close();
    }
}
