import java.util.*;
import javax.swing.*;

public class que5 {
    public static void main(String args[]) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        a = sc.nextInt();
        Scanner th = new Scanner(System.in);
        System.out.println("Enter a number 2:");
        b = sc.nextInt();
        Scanner gh = new Scanner(System.in);
        System.out.println("Enter a number 3:");
        c = sc.nextInt();
        int d = (a > b && a > c) ? (a) : (b > c) ? (b) : (c);
        JOptionPane.showMessageDialog(null, "the greatest number is: " + d);
        sc.close();
        th.close();
        gh.close();

    }
}