package CLASS3_ARRAY;

public class TwoD_Array {
    public static void main(String[] args) {
        System.out.println(display()[0]); //[I@2f92e0f4
        System.out.println(display()[0][0]); //1
        int[][] m1 = {{1,2}, {3,4}};
        int[][] m2 = {{1,2}, {3,4}};
        System.out.println(sumOfTwoM(m1, m2)[0][0]); //2
        // 注意：不要妄想用"sumOfTwoM(m1, m2)[0]"打印第一行，只会打印出地址！
    }

    static int[][] display() {
        int[][] matrix = { {1,2}, {3,4} };
        return matrix;
    }

    static int[][] sumOfTwoM(int[][] m1, int[][] m2) {
        int row = m1.length;
        int col = m1[0].length;
        int[][] newArray = new int[row][col];

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                newArray[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return newArray;

    }




}
