import java.util.*;

public class capital

{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement");
        String s = sc.nextLine();

        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')

                a++;

        }
        System.out.println("total  number of words start with capital letters are :" + a);
        sc.close();
    }

}