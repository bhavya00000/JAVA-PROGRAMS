import java.util.Scanner;

public class que15 {
    public static void main(String args[]) {
        int r1, c1, c2, r2, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix 1: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter dimensions of matrix 2: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if (c1 == r2) {
            // for mat1
            int mat1[][] = new int[r1][c1];
            System.out.println("eneter elements of matrix 1: ");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            // for mat2
            System.out.println("eneter elements of matrix 2: ");
            int mat2[][] = new int[r2][c2];
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            // resultant matrix
            System.out.println("reusltant matrix: ");
            int mat3[][] = new int[r1][c2];
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    for (k = 0; k < c1; k++) {
                        mat3[i][j] = mat3[i][j] + (mat1[i][k] * mat2[k][j]);
                    }
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("💩");
        sc.close();
    }

}
