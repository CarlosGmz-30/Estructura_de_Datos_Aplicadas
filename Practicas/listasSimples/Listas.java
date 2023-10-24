import java.util.Scanner;

public class Listas {
    // Declaramos un nodo que nos indicará la cabeza o inicio de la lista
    Nodo primero = new Nodo();
    // Declaramos un nodo que nos indicará el final o el último de la lista
    Nodo ultimo = new Nodo();

    Scanner sc = new Scanner(System.in);

    public Listas() {
        primero = null;
        ultimo = null;
        // Mientras la lista no tenga datos estos los inicializamos como Null
    }

    // Lista Simple: 12, 45, 14, 78
    // 12 -> 45 -> 14 -> 78 -> null

    
    // Método para insertar datos en la lista
    public void insertarNodo() {
        Nodo nuevo = new Nodo();
        System.out.print("Ingrese el dato para el nuevo Nodo: ");
        nuevo.dato = sc.nextInt();
        // Esto para validar si la lista está vacía o no ha sido creada
        if (primero == null) {
            // Asignamos a primero nuestro dato
            primero = nuevo;
            // 12 -> null
            primero.siguiente = null;
            ultimo = nuevo;
            // Primero = 12 Ultimo = 12 Nuevo = 12
        } else {
            // 12 -> 45
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
            // Primero = 12 Ultimo = 45 Nuevo = 45
        }
        System.out.println("\nNoto ingresado\n");
    }


    // Método para desplegar la lista
    public void desplegarLista() {
        Nodo actual = new Nodo();
        // Para que inicie a recorrer la lista desde el primero
        actual = primero;
        // Verificar que la lista esté llena
        if (primero != null) {
            while(actual != null){
                // Referenciamos la posición en la lista y lo imprimimos
                System.out.println(" " + actual.dato);
                // Ahora actual lo convertimos a siguiente
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\nLa lista se encuentra vacía\n");
        }
    }
}