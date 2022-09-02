import java.util.*;
import javax.swing.*;

public class que4 {
	public static void main(String args[]) {

		int a, b, c, d, e, f, g, h, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("phys marks:");
		a = sc.nextInt();
		Scanner yz = new Scanner(System.in);
		System.out.println("chem marks:");
		b = yz.nextInt();
		Scanner ab = new Scanner(System.in);
		System.out.println("english marks:");
		c = ab.nextInt();
		Scanner bc = new Scanner(System.in);
		System.out.println("maths marks:");
		d = bc.nextInt();
		Scanner ca = new Scanner(System.in);
		System.out.println("comp marks:");
		e = ca.nextInt();
		Scanner dc = new Scanner(System.in);
		System.out.println("bio marks:");
		f = dc.nextInt();
		g = a + b + c + d + e + f;
		h = g / 6;
		i = h;
		JOptionPane.showMessageDialog(null, "percentage of String is: " + i);
		sc.close();
		yz.close();
		ab.close();
		bc.close();
		ca.close();
		dc.close();

	}
}