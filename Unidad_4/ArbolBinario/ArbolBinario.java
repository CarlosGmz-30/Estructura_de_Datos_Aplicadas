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


//Metodo pra realizar un rrecorrido prorden 


public void preOrden (){
    preOrdenREc();
    System.out.println();
}



// MEtodo auxiliar recusivo 

public void preOrdenREc(){
    if(raiz != null){
        System.out.println(raiz.valor);
        preOrden();
    }
}
}
