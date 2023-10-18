package ListaSimple;

public class Lista<T> {
    public Nodo<T> ultimo;

    public Lista() {
        this.ultimo = null;
    }

    // Mostrar Lista
    public void mostrarLista() {
        Nodo<T> actual = ultimo;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Insertar Datos
    public void insertarDato(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = ultimo;
        ultimo = nuevoNodo;
    }

    // Consultar tamaño de Lista
    public void tamanioLista() {
        Nodo<T> actual = ultimo;
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        System.out.println("El tamaño de la lista es: " + contador);
    }

    // Consultar Indice
    public void consultaIndice(int indice) {
        if (indice < 0) {
            System.out.println("Índice no válido, debe ser mayor o igual a 0");
            return;
        }
        Nodo<T> actual = ultimo;
        int cont = 0;
        while (actual != null) {
            if (cont == indice) {
                System.out.println("Dato del indice " + indice + ": " + actual.dato);
                return;
            }
            cont++;
            actual = actual.siguiente;
        }
        System.out.println("Indice fuera de rango");
    }

    // Modificar Indice
    public void modificarIndice(int indice, T nuevoDato) {
        if (indice < 0) {
            System.out.println("Índice no válido, debe ser mayor o igual a 0");
            return;
        }

        Nodo<T> actual = ultimo;
        int contador = 0;

        while (actual != null) {
            if (contador == indice) {
                actual.dato = nuevoDato;
                System.out.println("Dato en el índice " + indice + " modificado.");
                return;
            }
            contador++;
            actual = actual.siguiente;
        }

        System.out.println("Índice fuera de rango.");
    }

    //Eliminar Indice
    public void eliminarIndice(int indice) {
        if (indice < 0) {
            System.out.println("Índice no válido, debe ser mayor o igual a 0");
            return;
        }

        if (indice == 0) {
            if (ultimo != null) {
                ultimo = ultimo.siguiente;
                System.out.println("Dato en el índice 0 eliminado.");
            } else {
                System.out.println("La lista está vacía.");
            }
            return;
        }

        Nodo<T> actual = ultimo;
        int contador = 0;

        while (actual != null && contador < indice - 1) {
            contador++;
            actual = actual.siguiente;
        }

        if (actual == null || actual.siguiente == null) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        actual.siguiente = actual.siguiente.siguiente;
        System.out.println("Dato en el índice " + indice + " eliminado.");
    }

}
