import java.util.*;
import javax.swing.*;

public class que3 {
	public static void main(String args[]) {
		int a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter number 1:");
		a = sc.nextInt();
		Scanner yz = new Scanner(System.in);
		System.out.println("enetr number 2:");
		b = yz.nextInt();
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		JOptionPane.showMessageDialog(null, "add: " + c + " sub: " + d + " mul: " + e + " div: " + f + " mod: " + g);

		yz.close();

	}

}