package ExamenUnidad_2;

/*
Con el uso de la clase Examen1.java realiza las siguientes operaciones con el uso de búsqueda binaria y secuencial (Ambos casos):
- Buscar y presentar el postre de costo 9.99
- Buscar y presentar el postre de peso 0.15
 */

public class Examen1 {

    public static Postre[] datos() {
        Postre[] postres = new Postre[20];

        // Datos constantes para los objetos Postre
        String[] nombres = {
                "Pastel de Chocolate", "Tarta de Manzana", "Helado de Vainilla",
                "Cupcake de Fresa", "Brownie de Nuez", "Flan de Caramelo",
                "Gelatina de Frambuesa", "Mousse de Chocolate", "Churros",
                "Tiramisú", "Crepe de Nutella", "Palmera de Chocolate",
                "Dónut Glaseado", "Profiteroles", "Galletas con Chispas de Chocolate",
                "Cheesecake de Fresa", "Panna Cotta", "Crepes de Limón",
                "Helado de Chocolate", "Tarta de Chocolate"
        };

        double[] pesos = {
                0.12, 0.3, 0.16, 0.1, 0.25, 0.35, 0.25, 0.2, 0.05, 0.3,
                0.1, 0.18, 0.12, 0.28, 0.15, 0.2, 0.02, 0.14, 0.11, 0.22
        };

        double[] costos = {
                5.99, 6.94, 4.19, 3.47, 7.97, 5.49, 4.29, 6.49, 3.99, 8.49,
                5.95, 4.49, 3.49, 9.99, 4.99, 11.99, 7.99, 6.99, 4.49, 6.97
        };

        // Llenar el arreglo de objetos Postre
        for (int i = 0; i < 20; i++) {
            postres[i] = new Postre(nombres[i], pesos[i], costos[i]);
        }
        return postres;
    }

    public static class Postre {
        String nombre;
        double peso, costo;

        public Postre(String nombre, double peso, double costo) {
            this.nombre = nombre;
            this.peso = peso;
            this.costo = costo;
        }

    }

    public static void main(String[] args) {
        // Zona de arreglo de objetos Postre
        Postre[] postres = datos();

        // Zona de buscar postre de costo 9.99
        System.out.println("Buscando el postre de costo 9.99...");
        int i = 0;
        while (i < postres.length && postres[i].costo != 9.99) {
            i++;
        }
        if (i < postres.length) {
            System.out.println("Postre encontrado: " + postres[i].nombre);
        } else {
            System.out.println("Postre no encontrado.");
        }

        // Zona de  buscar postre de peso 0.15
        System.out.println("Buscando el postre de peso 0.15...");
        i = 0;
        while (i < postres.length && postres[i].peso != 0.15) {
            i++;
        }
        if (i < postres.length) {
            System.out.println("Postre encontrado: " + postres[i].nombre);
        } else {
            System.out.println("Postre no encontrado.");
        }
    }
}
