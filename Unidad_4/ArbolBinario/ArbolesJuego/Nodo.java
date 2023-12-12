package ArbolesJuego;

public class Nodo {
    String valor;
    Nodo izquierdo, derecho;

    public Nodo(String valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }

    public Nodo(String pregunta, Nodo izquierdo, Nodo derecho) {
        this.valor = pregunta;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
}
