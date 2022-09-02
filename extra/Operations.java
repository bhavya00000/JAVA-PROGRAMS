import java.util.*;

public class Operations {
	public static void main(String args[]) {
		int a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter number 1:");
		a = sc.nextInt();
		Scanner yz = new Scanner(System.in);
		System.out.println("enetr number 2:");
		b = yz.nextInt();
		c = a + b;
		System.out.println("Addition is:" + c);
		d = a - b;
		System.out.println("Subtraction is:" + d);
		e = a * b;
		System.out.println("Multiplication is:" + e);
		f = a / b;
		System.out.println("Division is:" + f);
		g = a % b;
		System.out.println("Modula is:" + g);
		sc.close();
		yz.close();
	}
}