public class Alumnos {
    private String nombre;
    private String apellido;
    private String[] materias;
    private int[] calificaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Alumnos(String nombre, String apellido, String[] materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        this.calificaciones = new int[materias.length];

    }
}