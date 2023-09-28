package ArreglosMetodos;

public class Main {
    public static void main(String[] args) {

        /*
         * // Forma 1
         * String[] letras = "Soy Carlos, Soy alumno, Pertenezco a la utez".split(", ");
         * for (String string : letras) {
         * System.out.println(string);
         * }
         * 
         * // Forma 2
         * char[] otrasLetras = "Soy Carlos".toCharArray();
         * for (char c : otrasLetras) {
         * System.out.println(c);
         * }
         * 
         * // Forma 3
         * char one = "Soy Carlos".toCharArray()[0];
         * System.out.println(one);
         * System.out.println(otrasLetras[0] + "" + otrasLetras[7]);
         * System.out.println(otrasLetras[1]);
         * System.out.println(otrasLetras[8]);
         */

        // Dividir un arreglo en dos
        int[] arr1 = { 0, 4, 1, 5, 9, 6 };
        int tamanioArreglo = arr1.length;
        int pos = 2;
        int[] arrDividido1 = new int[pos];
        int[] arrDividido2 = new int[tamanioArreglo - pos];

        for (int i = 0; i < pos ; i++) {
            arrDividido1[i] = arr1[i];
        }

        for (int i = 0; i < tamanioArreglo - pos; i++) {
            arrDividido2[i] = arr1[i + pos];
        }

     
        System.out.println("Primer arreglo");
        for (int i : arrDividido1) {
            System.out.print(i + ",");
        }

        System.out.println("\nSegundo arreglo");
        for (int i : arrDividido2) {
            System.out.print(i + ",");
        }
    }
}