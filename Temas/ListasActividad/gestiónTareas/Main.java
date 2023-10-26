package gestiónTareas;

public class Main {
    public static void main(String[] args) {
        listaTareas listaTareas = new listaTareas();

        // Zona de declaración de tareas
        tarea t1 = new tarea("Actividad Listas", "Desarrollar un ejercicio para cada tipo de lidta visto en clases",
                false);
        tarea t2 = new tarea("Estudiar", "Estudiar para el examen de Iot", false);

        listaTareas.insertarTarea(t1);
        listaTareas.insertarTarea(t2);

        // Mostrar tareas
        listaTareas.mostrarTareas();

        // Marcar tarea como finalizada
        listaTareas.tareaFinalizada("Estudiar");

        // Eliminar tarea
        listaTareas.eliminarTarea("Actividad Listas");

        // Mostrar tareas después de cambios
        listaTareas.mostrarTareas();

    }
}
