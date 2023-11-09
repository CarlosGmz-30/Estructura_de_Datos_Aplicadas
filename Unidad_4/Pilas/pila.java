public class pila<T> {
    private static final int TAMPILA = 10;
    private int cima;
    private T[] listaPila;

    public pila() {
        cima = -1;
        listaPila = (T[]) new Object[TAMPILA];
    }

    public boolean estaLlena() {
        return cima == TAMPILA - 1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public void insertar(T dato) throws Exception {
        if (estaLlena()) {
            throw new Exception("Desbordamiento de pila");
        }
        cima++;
        listaPila[cima] = dato;
    }

    public T quitar() throws Exception {
        if (estaVacia()) {
            throw new Exception("Sin elementos en la pila");
        }
        T aux = listaPila[cima];
        cima--;
        return aux;
    }

    public T cimaPila() throws Exception {
        if (estaVacia()) {
            throw new Exception("Sin elementos en la pila");
        }
        return listaPila[cima];
    }

    public void muestra() {
        for (T t : listaPila) {
            System.out.println(t);
        }
    }
}
