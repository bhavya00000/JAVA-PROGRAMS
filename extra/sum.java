import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        int n, target;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter size of array: ");
        n = sc.nextInt();
        System.out.println("eneter " + n + " elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("eneter the number you want the sum of: ");
        target = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 2; j++) {
                if ((arr[i] + arr[j + 1]) == target) {
                    System.out.println("indices = " + "[" + i + "," + (j + 1) + "]");
                }
                sc.close();
            }
        }
    }
}