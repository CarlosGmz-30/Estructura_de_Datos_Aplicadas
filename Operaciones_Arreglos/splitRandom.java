package Operaciones_Arreglos;

import java.util.Scanner;
import java.util.Random;

/*
Tienen que iterar un arreglo de 20 (cantidad opcional) números llenados
por números aleatorios, posteriormente el usuario debe indicar un número
y el sistema debe buscar hastas que encuentre la coincidencia. Después
debe separar los dos arreglos y que los presente de forma lineal.
 */

public class splitRandom {
    public static void main(String[] args) {

        // Zona de declarar variables
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] num = new int[20];
        int[] num2 = new int[20];

        
        // Zona de asignación de numeros random al arreglo 1
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }

        sc.close();
    }
}
