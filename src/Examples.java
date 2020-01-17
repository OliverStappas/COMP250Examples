import java.util.Arrays;

public class Examples {

    public static int returnLargest(int[] x) {
        int max = x[0];
        for (int i:  x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    //public static int[] nPrimes(int n) {
    //return;
    //}


    public static int[] shiftOneNewArray(int[] x){
        int[] shiftedArray = new int[x.length];
        shiftedArray[0] = x[x.length -1];
        for (int i = 1; i < (x.length); i++) {
            shiftedArray[i] = x[i-1];
        }
        return shiftedArray;
    }

    public static int[] shiftOneSameArray(int[] x){
        int firstValue  = x[x.length-1];
        for (int i = (x.length-1); i >= 1; i--) {
            x[i] = x[i-1];
        }
        x[0] = firstValue;

        return x;
    }

    public static boolean isMatrix(int[][] x) {
        int rowSize = x[0].length;
        for (int[] row: x){
            if (row.length != rowSize) {
                return false;
            }

        }
        return true;
    }

    public static int[] getColumn(int[][] x, int i) {
        int[] columnArray = new int[x.length];
        for (int n = 0; n < x.length; n++) {
            columnArray[n] = x[n][i];
        }
        return columnArray;
    }

    public static void main(String[] args) {
//        int[] x1 = {1,2,3,4,5};
//        int[] x2 = {1,1,1,0,-2};
//        int[] x3 = {0,0,0,0,0};
//        int[] x4 = {1231231,12,4,0,-24};
//        System.out.println(returnLargest(x1));
//        System.out.println(returnLargest(x2));
//        System.out.println(returnLargest(x3));
//        System.out.println(returnLargest(x4));
//
//        int[] input = {2,4,6,8,1,2,3,4,5,6,7,8,9,11,12,13,14,15,66666};
//        System.out.println(Arrays.toString(shiftOneNewArray(input)));
//        System.out.println(Arrays.toString(shiftOneSameArray(input)));
//
//        int[][] num1 = {{1,2,3}, {5,6}, {8}};
//        int[][] num2 = {{2,2}, {0,6}, {8,9}};
//        System.out.println(isMatrix(num1));
//        System.out.println(isMatrix(num2));
//
//        int[][] matrix = {{2,3}, {5,6}, {8,9}};
//        System.out.println(Arrays.toString(getColumn(matrix, 1)));

    }
}
