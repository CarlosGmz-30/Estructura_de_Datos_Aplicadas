package ActividadGenealogico;

public class familia {
    String nombre;
    familia pareja;
    familia hijoIzquierdo;
    familia hijoDerecho;

    familia(String nombre) {
        this.nombre = nombre;
        this.pareja = null;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    // Método para agregar una pareja
    public void agregarPareja(familia pareja) {
        if (pareja != null) {
            this.pareja = pareja;
            pareja.pareja = this;
        }
    }

    // Método para agregar un hijo
    public void agregarHijo(familia hijo) {
        if (this.hijoIzquierdo == null) {
            this.hijoIzquierdo = hijo;
        } else {
            this.hijoDerecho = hijo;
        }
    }
}
