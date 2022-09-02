import java.util.*;

public class Conditional {
	public static void main(String args[]) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1:");
		a = sc.nextInt();
		Scanner th = new Scanner(System.in);
		System.out.println("Enter a number 2:");
		b = th.nextInt();
		Scanner gh = new Scanner(System.in);
		System.out.println("Enter a number 3:");
		c = gh.nextInt();
		if (a > b && a > c) {
			System.out.println("the max no. is " + a);

		} else if (b > c) {
			System.out.println("b is greater " + b);
		} else {
			System.out.println("c is greater " + c);
		}
		th.close();
		gh.close();
		sc.close();
	}
}