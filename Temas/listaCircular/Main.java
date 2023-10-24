package listaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> nuevaLista = new ListaCircular<>();
        nuevaLista.insertar(1);
        nuevaLista.insertar(2);
        nuevaLista.insertar(3);

        nuevaLista.recorrer();
    }
}
