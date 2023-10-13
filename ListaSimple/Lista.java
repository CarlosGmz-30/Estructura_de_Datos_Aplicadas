package ListaSimple;

public class Lista<T> {
    public Nodo<T> ultimo;

    public Lista() {
        this.ultimo = null;
    }

    public void mostrarLista() {
        Nodo<T> actual = ultimo;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void insertarDato(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = ultimo;
        ultimo = nuevoNodo;
    }

    public void tamanioLista() {
        Nodo<T> actual = ultimo;
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        System.out.println("El tamaño de la lista es: " + contador);
    }

    public void consultaIndice(){

    }

    public void modificarIndice(){

    }

    public void eliminarIndice(){

    }

}
