//Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։
//Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի անկյունագծերի վրայի թվերի գումարը։

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];


        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int[] diagonalSums = calculateDiagonalSums(matrix, n);
        System.out.println("Sum of the primary diagonal: " + diagonalSums[0]);
        System.out.println("Sum of the secondary diagonal: " + diagonalSums[1]);
    }


    public static int[] calculateDiagonalSums(int[][] matrix, int n) {
        int primaryDiagonalSum = 0;  // Sum of the primary diagonal
        int secondaryDiagonalSum = 0; // Sum of the secondary diagonal

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        return new int[]{primaryDiagonalSum, secondaryDiagonalSum};
    }
}
