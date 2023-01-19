package CLASS1_BASICS;

public class SumMatrixDiag {
    public static void main(String[] args) {
        int[][] matrix = {{3,2,1}, {3,4,4}, {1,2,3}};
        //System.out.println(sumDiagonal(matrix));
        sumDiagonal(matrix);
    }

    static int sumDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
