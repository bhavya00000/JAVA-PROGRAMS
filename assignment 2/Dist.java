import java.util.Scanner;

class Dist {
    public int feet, inch;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the distance in feet and inch: ");
        feet = sc.nextInt();
        inch = sc.nextInt();

    }

    public void disp() {
        System.out.println("distance :" + feet + " feet " + inch + " inch ");
    }

    public void sum(Dist d3) {
        Dist temp = new Dist();
        temp.feet = feet + d3.feet;
        temp.inch = inch + d3.inch;
        if (temp.inch >= 12) {
            temp.feet++;
            temp.inch -= 12;
        }
        temp.disp();
    }

    public static void main(String[] args) {

        Dist d1 = new Dist();
        d1.getData();
        d1.disp();
        Dist d2 = new Dist();
        d2.getData();
        d2.disp();

        d1.sum(d2);

    }
}