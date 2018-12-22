package top.daoyang.easy;

public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int M = matrix.length, N = matrix[0].length;
        boolean flag =  true;
        for (int i = M - 1; i >=0; i--) {
            int t = matrix[i][0];
            int k = i;
            int j = 0;
            while (++k < M && ++j < N){
                if (t != matrix[k][j])
                    return false;
            }
        }
        
        for (int i = 1; i < N - 1; i++) {
            int k = 0;
            int j = i;
            int t = matrix[k][i];
            while (++k < M && ++j <= N - 1) {
                if (t != matrix[k][j])
                    return false;
            }
        }
        
        return flag;
    }
    
    public static void main(String[] args) {
        new IsToeplitzMatrix().isToeplitzMatrix(new int[][]{
                {41, 45},
                {81, 41},
                {73, 81},
                {47, 73},
                {0, 47},
                {79, 76},
        });
    }
}