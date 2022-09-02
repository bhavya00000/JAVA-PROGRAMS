import java.util.*;

public class que9 {
    public static void main(String args[]) {
        int i, j;
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        n = sc.nextLine();
        for (i = 1; i <= n.length(); i++) {
            for (j = 1; j <= n.length() - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++)
                System.out.print(n.charAt(j - 1) + " ");

            System.out.println();

        }

    }
}
