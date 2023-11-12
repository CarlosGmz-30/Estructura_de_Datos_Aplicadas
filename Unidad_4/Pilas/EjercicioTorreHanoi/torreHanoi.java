package EjercicioTorreHanoi;

public class torreHanoi {
    // Inicializamos la cantidad de torres y discos
    private static final int numTorres = 3;
    private static final int numDiscos = 5;

    private pila<Integer>[] torres;

    // Método para inicializar las torres con discos en la torre 0
    public torreHanoi() throws Exception {
        torres = new pila[numTorres];
        // Con esto creamos una pila para cada torre
        for (int i = 0; i < numTorres; i++) {
            torres[i] = new pila<>();
        }

        // Inicializamos la primer torre con discos
        for (int i = numDiscos; i >= 1; i--) {
            try {
                torres[0].insertar(i);
            } catch (Exception e) {
                System.out.println("¡ERROR!");
            }
        }
    }

    // Método para mostrar las torres y sus discos
    public void mostrarTorres() {
        for (int i = 0; i < numTorres; i++) {
            System.out.println("TORRE " + (i + 1) + ":");
            torres[i].muestra();
            System.out.println();
        }
    }

    // Método para mover un disco de una torre a otra
    public void moverDisco(int origen, int destino) throws Exception {
        if (!torres[origen].estaVacia()) {
            // Obtenemos de la torre el disco que está hasta arriba
            int discoOrigen = torres[origen].cimaPila();
            // Validamos que se pueda mover el disco a la torre
            if (torres[destino].estaVacia() || discoOrigen < torres[destino].cimaPila()) {
                int disco = torres[origen].quitar();
                torres[destino].insertar(disco);
            } else {
                System.out.println("¡ERROR AL MOVER DISCO!");
            }
        } else {
            System.out.println("¡TORRE DE ORIGEN VACÍA!");
        }
    }

    // Método para verificar si todos los discos fueron movidos a la torre 3
    public boolean gameOver() {
        return torres[numTorres - 1].tamanio() == numDiscos;
    }
}
