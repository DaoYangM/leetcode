package top.daoyang.middle;

public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int c = 1;
        int j = 0;
        while (c <= n * n) {
        
            for (int i = j; i < n - j; i++)
                arr[j][i] = c++;
            for (int i = j + 1; i < n - j; i++)
                arr[i][n - j - 1] = c++;
            for (int i = n - j - 2; i >= j; i--)
                arr[n - j - 1][i] = c++;
            for (int i = n -j - 2; i > j; i--)
                arr[i][j] = c++;

            j++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = new GenerateMatrix().generateMatrix(4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");   
            }
            System.out.println();
        }
    }
}