package reproductorMúsica;

public class Nodo {
    private cancion cancion;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(cancion cancion) {
        this.cancion = cancion;
        this.anterior = null;
        this.siguiente = null;
    }

    public cancion getCancion() {
        return cancion;
    }

    public void setCancion(cancion cancion) {
        this.cancion = cancion;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
