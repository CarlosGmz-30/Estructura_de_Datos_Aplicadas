package Fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();
        sc.close();
        System.out.println("El número de Fibonacci es: " + fibonacci(numero));
    }

    public static int fibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}

