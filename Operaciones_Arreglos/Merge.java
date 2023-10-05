package Operaciones_Arreglos;

import java.util.Scanner;
/*
Hacer la unión de dos listas de alumnos para un seminario, dicho seminario debe tener
un límite de x cupos donde sea la suma de la mitad de las dos listas de alumnos.
Pueden ser datos estáticos los de las listas de alumnos, pero que el tamaño del arreglo 
que se combina, debe ser dinámico.
 */

public class Merge {
    public static void main(String[] args) {

        // Zona de variables
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        // Zona de entrada de datos
        System.out.println("\n========== TAMAÑO DE GRUPOS =========");
        System.out.println("Ingresa el tamaño del grupo 1: ");
        int firstGroup = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el tamaño del grupo 2: ");
        int secondGroup = sc.nextInt();
        sc.nextLine();

        // Zona de arreglos
        String[] group1 = new String[firstGroup];
        String[] group2 = new String[secondGroup];

        // Zona de llenado de arreglos
        System.out.println("\n============== GRUPO 1 ==============");
        for (int i = 0; i < group1.length; i++) {
            System.out.println("Ingresa el nombre del alumno " + (i + 1) + " del grupo 1: ");
            group1[i] = sc.nextLine();
        }
        System.out.println("\n============== GRUPO 2 ==============");
        for (int i = 0; i < group2.length; i++) {
            System.out.println("Ingresa el nombre del alumno " + (i + 1) + " del grupo 2: ");
            group2[i] = sc.nextLine();
        }

        // Zona de operaciones
        String[] group3 = new String[(firstGroup / 2 + secondGroup / 2)];

        for (int i = 0; i < firstGroup/2; i++) {
            group3[i] = group1[i];
            cont++;
        }
        for (int i = 0; i < secondGroup/2; i++) {
            group3[cont] = group2[i];
            cont ++;
        }

        // Zona de salida de datos
        System.out.println("\n============== GRUPO 3 ==============");
        for (int i = 0; i < group3.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + group3[i]);
        }
        sc.close();
    }
}
