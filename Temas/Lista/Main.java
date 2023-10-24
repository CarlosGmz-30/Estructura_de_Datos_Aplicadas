package Lista;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        System.out.println(lista.isEmpty());

        // Añadir a una lista
        lista.add("David");
        lista.add("Sebastian");
        lista.add("Yoali");

        System.out.println(lista.toString());
        // Borrar de una lista pude ser por valor o por index
        // lista.remove("Sebastian");
        // lista.remove(1);
        System.out.println(lista.toString());

        // Obtener boooleano si existe ese dato en la lista
        System.out.println(lista.contains("David"));
        System.out.println(lista.contains("Pepon"));

        // Obtener el valor de una lista por su index
        System.out.println(lista.get(1));

        // Limpiar toda la lista (todos sus valores)
        // lista.clear();
        // System.out.println(lista.toString());

        // Reconocer si nuestra lista tiene o no datos
        System.out.println(lista.isEmpty());

        // Uso de add all
        List<String> lista2 = new ArrayList<>();
        lista2.add("Edgar");
        lista2.add("Marco");
        // addAll se puede sin index (se agregan al final) o con index (se agregan en la
        // posicion deseada)
        lista.addAll(1, lista2);
        System.out.println(lista.toString());

        // Borra todos los datos de la lista introducida
        lista.removeAll(lista2);
        System.out.println(lista.toString());

        // Compara dos listas no importa su orden
        System.out.println(lista.containsAll(lista2));

        // Conserva todos los datos de la lista introudcida
        lista.addAll(0, lista2);
        lista.addAll(lista2);
        System.out.println(lista.toString());
        lista.retainAll(lista2);
        System.out.println(lista.toString());
    }
}
