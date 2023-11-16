package EjercicioServicioMedico;

public class paciente {
    private String nombre;
    private String prioridad;
    private String problema;

    public paciente(String nombre, String prioridad, String problema) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.problema = problema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

}
