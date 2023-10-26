package gestiónTareas;

public class listaTareas {
    private Nodo<tarea> primero;

    public listaTareas() {
        this.primero = null;
    }

    public void mostrarTareas() {
        Nodo<tarea> actual = primero;
        if (actual == null) {
            System.out.println("No hay tareas disponibles");
        } else {
            System.out.println("\nTAREAS DISPONIBLES:");
            System.out.println("---------------------------------");
            while (actual != null) {
                System.out.println("Título: " + actual.dato.getTitulo());
                System.out.println("Descripción: " + actual.dato.getDescripcion());
                System.out.println("Finalizada: " + actual.dato.isFinalizada());
                System.out.println("---------------------------------");
                actual = actual.siguiente;
            }
        }
    }

    public void insertarTarea(tarea tarea) {
        Nodo<tarea> nuevoNodo = new Nodo<tarea>(tarea);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
        System.out.println("¡SE AGREGÓ LA TAREA CORRECTAMENTE!");
    }

    public void eliminarTarea(String titulo) {
        if (primero == null) {
            System.out.println("No hay tareas disponibles");
            return;
        }

        if (primero.dato.getTitulo().equals(titulo)) {
            System.out.println("¡TAREA ELIMINADA CORRECTAMENTE!");
            primero = primero.siguiente;
            return;
        }

        Nodo<tarea> actual = primero;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.getTitulo().equals(titulo)) {
                System.out.println("¡TAREA ELIMINADA CORRECTAMENTE!");
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Tarea no encontrada");
    }

    public void tareaFinalizada(String titulo) {
        Nodo<tarea> actual = primero;
        while (actual != null) {
            if (actual.dato.getTitulo().equals(titulo)) {
                actual.dato.setFinalizada(true);
                System.out.println("\n¡TAREA MARCADA COMO COMPLETADA!");
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("Tarea no encontrada.");
    }
}
