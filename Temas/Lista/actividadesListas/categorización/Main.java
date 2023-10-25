package categorización;

import java.util.ArrayList;
import java.util.List;

/*
Desarrolla un programa de categorizacion de alimentos. De una lista de productos 
alimentarios (objeto con atributos: Nombre, costo y categoria) Desarrolla un
programa donde puedas categorizar y presentar las listas de alimentos categorizados 
por "Frescos", "Enlatados",  "En conserva" y "Cereales". Los datos pueden ser 
estáticos.
*/

public class Main {
    public static void main(String[] args) {
        // Zona de incialización de alimentos
        Alimentos a1 = new Alimentos("Platanos", 25, "Frescos");
        Alimentos a2 = new Alimentos("Atún", 22, "Enlatados");
        Alimentos a3 = new Alimentos("Aceitunas", 45, "Conserva");
        Alimentos a4 = new Alimentos("Avena", 32, "Cereales");

        // Zona de inicialización de listas
        List<Alimentos> alimentos = new ArrayList<>();
        List<Alimentos> frescos = new ArrayList<>();
        List<Alimentos> enlatados = new ArrayList<>();
        List<Alimentos> conserva = new ArrayList<>();
        List<Alimentos> cereales = new ArrayList<>();

        // Zona de llenado de lista de alimentos
        alimentos.add(a1);
        alimentos.add(a2);
        alimentos.add(a3);
        alimentos.add(a4);

        // Zona de filtrado de lista de alimentos
        for (Alimentos alimento : alimentos) {
            if (alimento.getCategoria().equals("Frescos")) {
                frescos.add(alimento);
            } else if (alimento.getCategoria().equals("Enlatados")) {
                enlatados.add(alimento);
            } else if (alimento.getCategoria().equals("Conserva")) {
                conserva.add(alimento);
            } else if (alimento.getCategoria().equals("Cereales")) {
                cereales.add(alimento);
            }
        }

        // Zona de mostrado de listas
        System.out.println("Alimentos Frescos: ");
        for (Alimentos alimento : frescos) {
            System.out.println("- " + alimento.getNombre() + " = $" + alimento.getCosto());
        }
        System.out.println("\nAlimentos Enlatados: ");
        for (Alimentos alimento : enlatados) {
            System.out.println("- " + alimento.getNombre() + " = $" + alimento.getCosto());
        }
        System.out.println("\nAlimentos en Conserva: ");
        for (Alimentos alimento : conserva) {
            System.out.println("- " + alimento.getNombre() + " = $" + alimento.getCosto());
        }
        System.out.println("\nCereales: ");
        for (Alimentos alimento : cereales) {
            System.out.println("- " + alimento.getNombre() + " = $" + alimento.getCosto());
        }
    }
}
