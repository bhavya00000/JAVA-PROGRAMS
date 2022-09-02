import javax.swing.*;

public class que7 {
	public static void main(String args[]) {
		String str = JOptionPane.showInputDialog("enter a sentence:");
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a sentence:");
		// String str = sc.nextLine();

		int a = 0, i, b = 0, c;
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				a++;
			else if (c >= 'a' && c <= 'z')
				b++;
		}

		JOptionPane.showMessageDialog(null, "number of vowels are: " + a + " number of consonants are: " + b);

	}

}
