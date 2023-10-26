package reproductorMúsica;

public class Main {
    public static void main(String[] args) {
        reproductor reproductor = new reproductor();

        reproductor.agregarCancion(new cancion("Cancion 1"));
        reproductor.agregarCancion(new cancion("Cancion 2"));
        reproductor.agregarCancion(new cancion("Cancion 3"));

        reproductor.reproducirCancionActual();
        reproductor.reproducirCancionSiguiente();
        reproductor.reproducirCancionAnterior();
    }
}
