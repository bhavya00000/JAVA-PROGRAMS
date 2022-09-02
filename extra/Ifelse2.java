import java.util.*;

public class Ifelse2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = in.nextInt();
		if (age > 18) {
			System.out.println("Adult");
			System.out.println("Enter roll no.:");
			int roll = in.nextInt();
			if (roll < 100) {
				System.out.println("DIV 1");
			} else {
				System.out.println("DIV 2");
			}
		} else {
			System.out.println("Not an adult");
		}
		in.close();
	}

}