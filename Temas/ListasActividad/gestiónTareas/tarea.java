package gestiónTareas;

public class tarea {
    private String titulo;
    private String descripcion;
    private boolean finalizada;

    public tarea(String titulo, String descripcion, boolean finalizada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.finalizada = finalizada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

}