public class main {
    public static void main(String[] args) {
        pila<Integer> nuevaPila = new pila<>();
        try {
            nuevaPila.insertar(1);
            nuevaPila.insertar(2);
            nuevaPila.insertar(3);

            System.out.println("Elemento quitado: " + nuevaPila.quitar());
            System.out.println("Último elemento: " + nuevaPila.cimaPila());
            // nuevaPila.muestra();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
