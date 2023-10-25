package categorización;

public class Alimentos {
    private String nombre;
    private double costo;
    private String categoria;

    public Alimentos(String nombre, double costo, String categoria) {
        this.nombre = nombre;
        this.costo = costo;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
