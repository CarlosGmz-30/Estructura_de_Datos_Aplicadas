package ListaDoble;

public class Nodo<T> {
    public T dato;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;

    public Nodo(T dato) {
        anterior = null;
        siguiente = null;
        this.dato = dato;
    }
}
