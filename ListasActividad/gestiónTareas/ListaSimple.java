package ListasActividad.gestiónTareas;

public class ListaSimple<T> {

    public Nodo<T> ultimo;

    public ListaSimple() {
        this.ultimo = null;
    }

    // Zona de mostrar lista
    public void mostrarLista() {
        Nodo<T> actual = ultimo;
        while (actual != null) {
            System.out.println(actual.dato + " -> ");
        }
        System.out.println("null");
    }

    // Zona de Insertar Datos
    public void insertarDato(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = ultimo;
        ultimo = nuevoNodo;
    }

    
}
