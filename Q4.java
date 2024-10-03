package ClassRoom;

public class Q4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 1},
                {0, 1, 1, 1, 0, 1, 0}
        };
        int startRow = 1, startCol = 2, endRow = 2, endCol = 5;
        int countOnes = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
        }
        System.out.println(countOnes);
    }
}
