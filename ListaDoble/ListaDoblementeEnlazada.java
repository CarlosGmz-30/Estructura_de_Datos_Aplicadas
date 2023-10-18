package ListaDoble;

public class ListaDoblementeEnlazada<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        if (estaVacia()) {
            cola = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public void mostrarLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
    }

    public void modificarPorIndice(T nuevoDato, int indice) {
        if (estaVacia() || indice < 0) {
            System.out.println("La lista está vacía o el índice es inválido.");
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (contador < indice && actual != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual != null) {
            actual.dato = nuevoDato;
        } else {
            System.out.println("Índice fuera de rango, no se puede modificar el elemento.");
        }
    }
}