import java.util.Scanner;

public class AddTwoNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter second number :");
        int n2 = sc.nextInt();
        int sumOfn = n1 + n2;
        String s = String.valueOf(sumOfn);
        int len = s.length();
        char arr[] = new char[len];
        System.out.println("Final Output array :");
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(len - 1 - i);
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
