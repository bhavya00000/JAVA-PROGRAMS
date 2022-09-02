import java.util.*;

public class special2 {
    public static void main(String args[]) {
        // string input
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        // number of lines input
        int n, i, j;

        System.out.println("enter the number of lines: ");
        n = sc.nextInt();
        String r = new String(new char[(n / str.length())]).replace("\0", str);

        if (n % 2 == 0) {

            // for pyramid
            for (i = 1; i <= n; i++)
                if (i % 2 == 0) {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print(r.charAt((j - 1)) + " ");

                    System.out.println();

                } else {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print("* ");

                    System.out.println();

                }
            // for reverse
            for (i = n - 1; i > 0; i--)
                if (i % 2 == 0) {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print(r.charAt((j - 1)) + " ");

                    System.out.println();

                } else {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print("* ");

                    System.out.println();

                    sc.close();
                }
        }

        else {
            for (i = 1; i <= n; i++)
                if (i % 2 == 0) {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print(r.charAt((j - 1)) + " ");

                    System.out.println();

                } else {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print("* ");

                    System.out.println();

                }
            // for reverse
            for (i = n - 1; i > 0; i--)
                if (i % 2 == 0) {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print(r.charAt((j - 1)) + " ");

                    System.out.println();

                } else {

                    for (j = 1; j <= n - i; j++)
                        System.out.print(" ");

                    for (j = 1; j <= i; j++)
                        System.out.print("* ");

                    System.out.println();

                }
        }

    }
}
