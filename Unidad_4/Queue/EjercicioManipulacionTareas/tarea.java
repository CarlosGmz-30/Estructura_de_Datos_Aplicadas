package EjercicioManipulacionTareas;

public class tarea {
    private String titulo;
    private String instrucciones;
    private String fechaEntrega;

    public tarea(String titulo, String instrucciones, String fechaEntrega) {
        this.titulo = titulo;
        this.instrucciones = instrucciones;
        this.fechaEntrega = fechaEntrega;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
