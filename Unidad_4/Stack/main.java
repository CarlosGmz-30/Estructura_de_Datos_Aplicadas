package Stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // Validar si está vacía
        System.out.println("¿Está vacía? " + (pila.isEmpty() ? "Si" : "No"));

        // Agregamos datps a nuestro Stack
        pila.push("Charlie");
        pila.push("Keyla");
        pila.push("Daniela");

        System.out.println(pila.toString());

        // Con esto va a mostrar el último que se haya insertado
        System.out.println("Mirar al último: " + pila.peek());

        // Con esto quitamos el último elemento
        System.out.println("El dato que quitamos: " + pila.pop());
        System.out.println("Mirar al último: " + pila.peek());

        // Validar si está vacía de nuevo
        System.out.println("¿Está vacía? " + (pila.isEmpty() ? "Si" : "No"));

        // Para limpiar la pila
        pila.clear();

        // Validar si está vacía de nuevo
        System.out.println("¿Está vacía? " + (pila.isEmpty() ? "Si" : "No"));

    }
}
