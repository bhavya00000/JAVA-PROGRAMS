import java.util.Scanner;

public class parenthesis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paranthesis: ");
        String n = sc.nextLine();
        int x = n.length();
        char arr1[] = new char[x];
        char arr2[] = new char[x];
        for (int i = 0; i <= n.length() - 1; i++) {
            arr1[i] = n.charAt(i);
            arr2[i] = n.charAt(n.length() - 1 - i);
        }

    }
}
