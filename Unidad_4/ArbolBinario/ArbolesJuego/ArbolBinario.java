package ArbolesJuego;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(String valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, String valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor.compareTo(raiz.valor) < 0) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor.compareTo(raiz.valor) > 0) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    public void inorden() {
        inordenRec(raiz);
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }

    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRec(raiz.izquierdo);
            preordenRec(raiz.derecho);
        }
    }

    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierdo);
            postordenRec(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }
}