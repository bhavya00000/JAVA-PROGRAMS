import java.util.Scanner;

public class que6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr a string");
        String a, s;
        String str[];
        char c;
        int count = 0, i;
        s = sc.nextLine();
        str = s.split(" ");
        for (i = 0; i < str.length; i++)

        {
            a = str[i];
            c = a.charAt(0);
            if (c >= 65 && c <= 90)
                count++;
        }
        System.out.println("number of caps " + count);
        sc.close();
    }
}
