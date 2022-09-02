import java.util.*;

public class Ifelse {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = in.nextInt();
		if (age > 18) {
			System.out.println("Adult");

		} else {
			System.out.println("Not an adult");
		}
		in.close();
	}
}