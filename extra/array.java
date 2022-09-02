import java.util.Scanner;

class array {
    public static void main(String args[]) {
        int n, i;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        sc.close();

        System.out.println("enter " + n + " elements of array");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(n + " elements of array: ");

        for (i = 0; i < n; i++)
            System.out.println(arr[i]);

    }

}
