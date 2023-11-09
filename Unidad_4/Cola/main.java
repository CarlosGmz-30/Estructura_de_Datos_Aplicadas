package Cola;

public class main {
    public static void main(String[] args) {
        cola<String> cola = new cola<>();
        try {
            cola.insertar("Charlie");
            cola.insertar("Keyla");
            cola.insertar("Daniela");

            cola.mostrar();
            cola.quitar();
            cola.mostrar();

            System.out.println(cola.mirarUltimo());
        } catch (Exception e) {
            System.out.println("Excepcion: " + e);
        }

    }
}
