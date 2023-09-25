package ArreglosBidimensionales;

public class Bidimensionales {
    public static void main(String[] args) {

        int[][] arregloBi = new int[2][2];
        arregloBi[0][0] = 5;
        arregloBi[1][1] = 5;
        int[][] arregloBi2 = { { 2 }, { 2 } };

        for (int i = 0; i < arregloBi.length; i++) {
            for (int j = 0; j < arregloBi[i].length; j++) {
                System.out.print(" " + arregloBi[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = 0; i < arregloBi2.length; i++) {
            for (int j = 0; j < arregloBi2[i].length; j++) {
                System.out.print(" " + arregloBi2[i][j]);
            }
            System.out.println();
        }
    }
}