import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked palindrome :");
        int n = sc.nextInt();
        // To convert int to string
        String s = String.valueOf(n);
        int len = s.length();
        int flag = 0;
        char arr[] = new char[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = len - 1; j > 0; j--) {
                if (arr[i] == arr[j])
                    flag = 1;
                else
                    flag = 0;
            }
        }
        // for (int i = 0; i < len; i++) {
        // if (arr[i] == arr[len - 1 - i]) {
        // flag = 1;
        // } else {
        // flag = 0;
        // }
        // }
        if (flag == 1) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

        sc.close();
    }
}
