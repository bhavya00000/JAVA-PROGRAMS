import java.util.*;

public class special1 {
    public static void main(String args[]) {
        // string input
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        // number of lines input
        int i, j;

        // for pyramid
        for (i = 1; i <= str.length(); i++)
            if (i % 2 == 0) {

                for (j = 1; j <= str.length() - i; j++)
                    System.out.print(" ");

                for (j = 1; j <= i; j++)
                    System.out.print(str.charAt(j - 1) + " ");

                System.out.println();

            } else {

                for (j = 1; j <= str.length() - i; j++)
                    System.out.print(" ");

                for (j = 1; j <= i; j++)
                    System.out.print("* ");

                System.out.println();

            }
        for (i = 1; i <= str.length(); i++)
            if (i % 2 == 0) {
                for (j = 1; j <= i; j++)
                    System.out.print(" ");

                for (j = 1; j <= str.length() - i; j++)
                    System.out.print(str.charAt(j - 1) + " ");

                System.out.println();
            } else {
                for (j = 1; j <= i; j++)
                    System.out.print(" ");

                for (j = 1; j <= str.length() - i; j++)
                    System.out.print("* ");

                System.out.println();
            }

        sc.close();

    }

}
