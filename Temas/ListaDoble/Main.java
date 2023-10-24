package ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<String> listaDoble = new ListaDoblementeEnlazada<>();
        listaDoble.insertar("Charlie");
        listaDoble.insertar("Nori");
        listaDoble.insertar("Moyito");

        listaDoble.mostrarLista();

        listaDoble.modificarPorIndice("Carlos", 1);
        listaDoble.modificarPorIndice("Benji", 2);
        listaDoble.modificarPorIndice("Leo", 3);
    }

}
