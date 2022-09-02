import java.util.*;

public class addd {
    public static void main(String args[]) {
        int num1 = 0, num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr number 1: ");
        int n1 = sc.nextInt();
        String s = String.valueOf(n1);
        int arr1[] = new int[s.length()];
        for (int i = 0; i < s.length() - 1; i++) {
            arr1[i] = s.charAt(i);
        }
        System.out.println("enetr number 2: ");
        int n2 = sc.nextInt();
        String r = String.valueOf(n1);
        int arr2[] = new int[r.length()];
        for (int i = 0; i < r.length() - 1; i++) {
            arr2[i] = r.charAt(i);
        }

        for (int k = 0; k < arr1.length - 1; k++) {
            String str1 = "" + arr1[k];
            num1 = Integer.parseInt(str1);
        }

        for (int l = 0; l < arr1.length - 1; l++) {
            String str2 = "" + arr1[l];
            num2 = Integer.parseInt(str2);
        }

        int sum = num2 + num1;

        String str = String.valueOf(sum);
        char arr[] = new char[s.length()];

        for (int i = 0; i < s.length() - 1; i++) {
            arr[i] = str.charAt(i);
            System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();
    }

}