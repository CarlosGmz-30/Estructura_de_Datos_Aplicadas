public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;

    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        // ? Si el árbol está vacío, crea un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // ? De lo contrario, recorre el árbol
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        // * Devuelve el nodo raíz modificado
        return raiz;
    }

    // Método para realizar un recorrido inorden del árbol
    public void inorden() {
        inordenRec(raiz);
    }

    // Método auxiliar recursivo para realizar un recorrido inorden
    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }

    // Método para realizar un recorrido preorden del árbol
    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    // Método auxiliar recursivo para realizar un recorrido preorden
    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRec(raiz.izquierdo);
            preordenRec(raiz.derecho);
        }
    }

    // Método para realizar un recorrido postorden del árbol
    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    // Método auxiliar recursivo para realizar un recorrido postorden
    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierdo);
            postordenRec(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }
}
