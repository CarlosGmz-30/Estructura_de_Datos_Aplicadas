public class MainMerge {
    public static void main(String[] args) {

        int[] arr1 = { 4, 5, 2, 4 };
        int[] arr2 = { 4, 5, 9, 8, 8 };

        int[] arraySuma = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arraySuma, 0, arr1.length);
        System.arraycopy(arr2, 0, arraySuma, arr1.length, arr2.length);

        for (int i : arraySuma) {
            System.out.print(i + ",");
        }
    }
}
