import java.util.Scanner;

public class newsss {
    public static void main(String args[]) {
        int i = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string containing parenthisis: ");
        String s = sc.nextLine();
        char c[] = new char[s.length()];

        for (i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);

        }

        // for()
        for (i = 0; i < s.length() - 1; i++) {
            if (c[i] == '(') {
                if (c[i + 1] == ')')
                    flag = 1;
                else
                    flag = 0;
            }

            // for[]

            if (c[i] == '[') {
                if (c[i + 1] == ']')
                    flag = 1;
                else
                    flag = 0;
            }

            // for {}

            if (c[i] == '{') {
                if (c[i + 1] == '}')
                    flag = 1;
                else
                    flag = 0;
            }

        }

        if (flag == 1)
            System.out.println("true");
        if (flag == 0)
            System.out.println("flase");

    }
}