import java.util.*;
import javax.swing.*;

public class Operations2 {
	public static void main(String args[]) {
		int a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		Scanner yz = new Scanner(System.in);

		b = yz.nextInt();
		c = a + b;
		JOptionPane.showMessageDialog(null, "add" + c);
		d = a - b;
		JOptionPane.showMessageDialog(null, "sub " + d);
		e = a * b;
		JOptionPane.showMessageDialog(null, "sub " + e);
		f = a / b;
		JOptionPane.showMessageDialog(null, "sub " + f);
		g = a % b;
		JOptionPane.showMessageDialog(null, "sub " + g);
		sc.close();
		yz.close();
	}

}