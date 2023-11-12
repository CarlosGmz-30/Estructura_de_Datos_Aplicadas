package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> colaNormal = new LinkedList<>();
        // Queue cola2 = new ArrayDeque<>();
        // Queue cola3 = new DelayQueue<>();
        Queue<String> colaPrioridad = new PriorityQueue<>();

        colaNormal.add("Charlie");
        colaNormal.add("Keyla");

        colaPrioridad.add("Charlie");
        colaPrioridad.add("Keyla");

        // System.out.println("Cola normal: " + colaNormal.toString());
        // System.out.println("Cola prioridad: " + colaPrioridad.toString());

        Queue cola = new ArrayDeque<>();

        // Este nos va dar un null
        // Object dato = cola.peek();
        // if (dato == null) {
        // System.out.println("Es nulo");
        // }

        // try {
        // System.out.println(cola.element());
        // } catch (Exception e) {
        // System.out.println("No hubo elemento");
        // }

        Queue<Integer> colaInteger = new ArrayDeque<>();
        colaInteger.add(1);
        colaInteger.add(2);
        colaInteger.add(3);

        System.out.println(colaInteger.toString());

        System.out.println("Remove: " + colaInteger.remove());
        System.out.println("Poll: " + colaInteger.poll());

        System.out.println(colaInteger.toString());

    }
}
