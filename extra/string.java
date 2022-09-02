
//Scan a string. From the string identify vowels store them in one array & consonants in the second array.
import java.util.*;

public class string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string: ");
        String s = sc.nextLine();
        sc.close();
        char[] c = new char[s.length()];
        char[] x = new char[s.length()];
        char d;
        int i = 0, countc = 0, countx = 0, j = 0, k = 0;
        for (i = 0; i < s.length(); i++) {

            d = s.charAt(i);

            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {

                c[j] = s.charAt(i);
                countc++;
                j++;
            }

            else if (d >= 'a' && d <= 'z') {
                x[k] = s.charAt(i);
                countx++;
                k++;
            }
        }
        System.out.println("THE VOWELS:");
        for (i = 0; i < countc; i++)

            System.out.println(c[i] + " ");

        System.out.println("THE CONSONANTS");
        for (i = 0; i < countx; i++)

            System.out.println(x[i] + " ");
    }

}
