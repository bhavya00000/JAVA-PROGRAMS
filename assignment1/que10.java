import java.util.Scanner;

public class que10 {
    public static void main(String args[]) {
        int i, j, n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();

        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");

            for (j = 1; j <= n - i; j++)
                System.out.print("* ");

            System.out.println();

        }

    }
}
