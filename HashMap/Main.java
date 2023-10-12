package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapaEdades = new HashMap<>();

        mapaEdades.put("Nori", 22);
        mapaEdades.put("Charlie", 19);
        mapaEdades.put("Keyla", 22);
        mapaEdades.put("Moyito", 18);

        for (Map.Entry<String, Integer> entry : mapaEdades.entrySet()) {
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println(nombre + " tiene " + edad + " años.");
        }

        Set<String> valores = new HashSet<>();
        valores.add("Valor 1");
        valores.add("Valor 2");
        valores.add("Valor 3");
        for (String string : valores) {
            System.out.println(string);
        }

    }
}
