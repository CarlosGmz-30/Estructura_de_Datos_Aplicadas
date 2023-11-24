public class Main {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(5);
        arbol.insertar(4);
        arbol.insertar(3);
        arbol.insertar(1);
        arbol.insertar(15);
        arbol.insertar(12);
        arbol.insertar(13);

        System.out.println("------------------");
        System.out.println("In Orden ");
        arbol.inorden();
        System.out.println("\n\n------------------");
        System.out.println("Pre Orden");
        arbol.preorden();
        System.out.println("\n------------------");
        System.out.println("Post Orden");
        arbol.postorden();
        System.out.println();
    }

}
