import java.util.Scanner;

public class J {
    public static void main(String[] arrgs) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter you first name:");
        String fn = i.next();
        System.out.println("Enter you first name:");
        String ln = i.next();
        System.out.println("Your name is " + fn + " " + ln);
        i.close();
    }
}
