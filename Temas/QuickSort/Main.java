package QuickSort;

public class Main {

    public static void main(String[] args) {

        int[] arr = { 4, 6, 12, 32, 45, 6, 7, 2 };
        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ,");
        }
    }

    public static void quickSort(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particion(arr, bajo, alto);
            quickSort(arr, bajo, indicePivote - 1);
            quickSort(arr, indicePivote + 1, alto);
        }
    }

    public static int particion(int[] arr, int bajo, int alto) {
        int pivote = arr[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;
        return i + 1;

    }
}