package reproductorMúsica;

public class reproductor {
    private Nodo cancionActual;
    private Nodo primeraCancion;

    public void agregarCancion(cancion cancion) {
        Nodo nuevoNodo = new Nodo(cancion);
        if (primeraCancion == null) {
            primeraCancion = nuevoNodo;
            cancionActual = nuevoNodo;
        } else {
            cancionActual.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cancionActual);
            cancionActual = nuevoNodo;
        }
    }

    public void reproducirCancionActual() {
        if (cancionActual != null) {
            System.out.println("Reproduciendo: " + cancionActual.getCancion().getNombre());
        } else {
            System.out.println("No hay más canciones para reproducir");
        }
    }

    public void reproducirCancionAnterior() {
        if (cancionActual != null && cancionActual.getAnterior() != null) {
            cancionActual = cancionActual.getAnterior();
            reproducirCancionActual();
        } else {
            System.out.println("No hay canciones anteriores.");
        }
    }

    public void reproducirCancionSiguiente() {
        if (cancionActual != null && cancionActual.getSiguiente() != null) {
            cancionActual = cancionActual.getSiguiente();
            reproducirCancionActual();
        } else {
            System.out.println("No hay canciones siguientes.");
        }
    }
}
