import java.util.Scanner;

public class arrayp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter string");
        String s;
        s = sc.nextLine();
        char d;

        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            d = s.charAt(i);
            arr[i] = s.charAt(s.length() - 1 - i);
        }
        for (int i = 0; i < s.length(); i++)

            System.out.println(arr[i]);
        sc.close();
    }
}
