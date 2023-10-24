package ListaSimple;

public class Main {
    public static void main(String[] args) {
        Lista<String> listaNueva = new Lista<>();
        listaNueva.insertarDato("Charlie");
        listaNueva.insertarDato("Moyito");
        listaNueva.mostrarLista();
        listaNueva.tamanioLista();
        listaNueva.consultaIndice(1);
        listaNueva.modificarIndice(1, "Carlos");
        listaNueva.eliminarIndice(1);
    }
}