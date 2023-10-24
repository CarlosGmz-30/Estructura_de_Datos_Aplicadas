package listaCircular;

public class Nodo<T> {
    T dato;
    Nodo<T> enlace;

    public Nodo(T dato) {
        this.dato = dato;
        enlace = this;
    }

    /*
     * Nodo esteNodo = new Nodo(2);
     * esteNodo.enlace.dato = esteNodo.datp
     */
}
