package listaCircular;

public class ListaCircular<T> {
    private Nodo<T> lc;

    public ListaCircular() {
        lc = null;
    }

    public void insertar(T dato) {
        Nodo<T> nuevoNodo = new Nodo(dato);
        if (lc != null) {
            nuevoNodo.enlace = lc.enlace;
            lc.enlace = nuevoNodo;
        }
        lc = nuevoNodo;
    }

    public void recorrer() {
        Nodo p;
        if (lc != null) {
            p = lc.enlace;
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;
            } while (p != lc.enlace);
        } else {
            System.out.println("\t La lista está vacía");
        }
    }

    public void eliminar(T entrada) {
        Nodo actual;
        boolean encontrado = false;
        actual = lc;
        while ((actual.enlace != lc) && (!encontrado)) {
            encontrado = (actual.enlace.dato == entrada);
            if (!encontrado) {
                actual = actual.enlace;
            }
        }
        encontrado = (actual.enlace.dato == entrada);
        if (encontrado) {
            Nodo p;
            p = actual.enlace;
            if (lc == lc.enlace) {
                lc = null;
            } else {
                if (p == lc) {
                    lc = actual;
                }
                actual.enlace = p.enlace;
            }
        }
    }
}
