public class cola<T> {
    private static final int MAXTAM = 3;
    private int inicio, fin;
    private T[] lista;

    public cola() {
        inicio = 0;
        fin = -1;
        lista = (T[]) new Object[MAXTAM];
    }

    public boolean colaVacia() {
        return inicio > fin;
    }

    public boolean colaLlena() {
        return fin == MAXTAM;
    }

    public void insertar(T dato) throws Exception {
        if (!colaLlena()) {
            lista[++fin] = dato;
        } else {
            throw new Exception("Sin espacio en el arreglo");
        }
    }

    public T quitar() throws Exception {
        if (!colaVacia()) {
            T aux = lista[inicio];
            lista[inicio++] = null;

            if (inicio == MAXTAM) {
                inicio = 0;
                fin = -1;
            }

            return aux;
        } else {
            throw new Exception("¡SIN TAREAS REGISTRADAS!\n");
        }
    }

    public void reiniciarCola() {
        inicio = 0;
        fin = -1;
        lista = (T[]) new Object[MAXTAM];
    }

    public void mostrar() {
        if (!colaVacia()) {
            for (T t : lista) {
                if (t != null) {
                    tarea tarea = (tarea) t;
                    System.out.println("Título: " + tarea.getTittle());
                    System.out.println("Descripción: " + tarea.getDescription());
                    System.out.println("Fecha de Creación: " + tarea.getCreationTime());
                    System.out.println();
                }
            }
        } else {
            System.out.println("¡SIN TAREAS REGISTRADAS!\n");
        }
    }

    public T mirarUltimo() throws Exception {
        if (!colaVacia()) {
            return lista[inicio];
        } else {
            throw new Exception("Sin elementos en el arrelgo");
        }
    }

    public int obtenerTamanio() {
        return fin - inicio + 1;
    }
}
