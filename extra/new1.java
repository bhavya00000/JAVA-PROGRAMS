import java.util.Scanner;

public class new1 {
    public static void main(String args[]) {
        int i, j, n, target;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.println("enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 1; i < n; i++) {
            for (j = 0; j <= (n - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int arr2[] = new int[] { -1, -1 };
        int flag = 0;
        int firstIndex = 0, lastIndex = 0;

        System.out.print("target= ");
        target = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (target == arr[i]) {
                flag = 1;
                firstIndex = i;
                break;
            }
        }
        for (int k = firstIndex; k < n; k++) {
            if (target == arr[k]) {
                lastIndex = k;
            }
        }
        if (flag == 1) {
            System.out.println(firstIndex + "," + lastIndex);
        }
        for (i = 0; i < n; i++) {
            if (flag == 0) {
                System.out.println(arr2[i]);
            }
        }
    }
}
