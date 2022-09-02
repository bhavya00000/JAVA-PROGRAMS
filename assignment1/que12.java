public class que12 {
    static void areaa(int x) {
        System.out.println("area of square: " + x * x);
    }

    static void areaa(int a, int b) {
        System.out.println("area of rectangle: " + a * b);
    }

    static void areaa(int p, int q, int r) {
        int s = (p + q + r) / 2;
        System.out.println("area of traingle: " + (int) Math.sqrt((s * (s - p) * (s - q) * (s - r))));
    }

    public static void main(String args[]) {
        areaa(10);
        areaa(2, 4);
        areaa(3, 4, 5);

    }

}
