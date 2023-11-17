public class manejoPilas {
    // Inicializamos la cantidad de torres y discos
    private static final int numPilas = 3;

    private pila<String>[] pila;

    // Método para inicializar las pilas con colores
    public manejoPilas() throws Exception {
        pila = new pila[numPilas];
        for (int i = 0; i < numPilas; i++) {
            pila[i] = new pila<>();
        }
        // Insertamos colores en pila 1
        pila[0].insertar("Rojo");
        pila[0].insertar("Verde");
        pila[0].insertar("Rojo");

        // // Insertamos colores en pila 2
        pila[1].insertar("Verde");
        pila[1].insertar("Azul");
        pila[1].insertar("Azul");

        // Insertamos colores en pila 3
        pila[2].insertar("Rojo");
        pila[2].insertar("Azul");
        pila[2].insertar("Verde");

    }

    // Método para mover un color de una pila a otra
    public void moverPila(int pilaOrigen, int pilaDestino) throws Exception {
        if (pilaOrigen < 0 || pilaOrigen >= numPilas || pilaDestino < 0 || pilaDestino >= numPilas) {
            throw new Exception("¡MOVIMIENTO INVÁLIDO!");
        } else {
            if (!pila[pilaDestino].estaLlena()) {
                String color1 = pila[pilaOrigen].cimaPila();
                pila[pilaOrigen].quitar();
                String color2 = pila[pilaOrigen].cimaPila();
                if (color1 == color2 && pila[pilaDestino].tamanio() < 3) {
                    pila[pilaOrigen].quitar();
                    pila[pilaDestino].insertar(color1);
                    pila[pilaDestino].insertar(color2);
                } else {
                    pila[pilaDestino].insertar(color1);
                }
                mostrarPilas();
                System.out.println("¡EL MOVIMIENTO SE REALIZÓ CON ÉXITO!\n");
            } else {
                System.out.println("¡PILA SELECCIONADA LLENA!\n");
            }
        }
    }

    // Método para mostrar las pilas y sus colores
    public void mostrarPilas() {
        for (int i = 0; i < numPilas; i++) {
            System.out.println("PILA " + (i + 1) + ":");
            pila[i].muestra();
            System.out.println();
        }
    }
}
