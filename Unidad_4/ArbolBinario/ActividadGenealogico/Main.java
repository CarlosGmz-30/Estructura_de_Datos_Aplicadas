package ActividadGenealogico;

public class Main {
    public static void main(String[] args) {
        familia abuelo = new familia("Rafael");
        familia abuela = new familia("Guadalupe");
        familia padre = new familia("Carlos");
        familia madre = new familia("Araceli");
        familia tia = new familia("Alejandra");
        familia hijo1 = new familia("Carlos");
        familia hijo2 = new familia("Daniela");
        familia sobrino = new familia("Juan Pablo");

        abuelo.agregarPareja(abuela);
        abuelo.agregarHijo(padre);

        padre.agregarPareja(madre);
        padre.agregarHijo(hijo1);
        padre.agregarHijo(hijo2);

        abuelo.agregarHijo(tia);
        tia.agregarHijo(sobrino);

        System.out.println("Mi familia");
        imprimirArbol(abuelo, 0);
    }

    // Método para imprimir el árbol
    private static void imprimirArbol(familia persona, int nivel) {
        if (persona == null) {
            return;
        }
        for (int i = 0; i < nivel; i++) {
            System.out.print("|---");
        }
        System.out.println("- " + persona.nombre);
        
        imprimirArbol(persona.hijoIzquierdo, nivel + 1);
        imprimirArbol(persona.hijoDerecho, nivel + 1);
    }
}