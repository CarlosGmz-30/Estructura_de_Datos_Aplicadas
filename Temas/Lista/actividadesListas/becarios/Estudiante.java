package becarios;

public class Estudiante {

    private String nombre;
    private int grado;
    private double promedio;

    public Estudiante(String nombre, int grado, double promedio) {
        this.nombre = nombre;
        this.grado = grado;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

}
