import javax.swing.*;

public class que8 {
    public static void main(String args[]) {

        int i, a = 0, b = 0;
        char x;
        while (true) {
            String str = JOptionPane.showInputDialog("Enter a String:");
            str.toLowerCase();
            if (str.equals("quit")) {
                break;
            } else {
                for (i = 0; i < str.length(); i++) {
                    x = str.charAt(i);
                    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                        a++;
                    else
                        b++;
                }
                JOptionPane.showMessageDialog(null, "number of vowels " + a + "number of consonant" + b);

            }

        }
    }
}
