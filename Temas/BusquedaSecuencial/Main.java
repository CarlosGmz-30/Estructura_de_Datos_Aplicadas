package BusquedaSecuencial;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 9, 1, 2, 8 };
        int busqueda = 4;
        int indice = busqueda(arr, busqueda);
        if(indice>=0){
            System.out.println("El avlor " + busqueda + " se encuentra en el indice " + indice);
        } else {
            System.out.println("El valor " + busqueda + " no se encuentra en el arreglo");
        }
    }

    public static int busqueda(int[] arr, int busqueda) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == busqueda){
                return i;
            }
        }
        return -1;
    }

}
