import java.util.*;

public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value of n:");
        n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Elements of array: ");

        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the item: ");
        int item = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (arr[i] == item)
                break;
        }
        if (i == item)
            System.out.print("Element not found");
        else
            System.out.print("Element present at " + i + "index");

    }

}