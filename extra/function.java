public class function {
    static void add(int x, int y) {
        System.out.println("addititon of two integer: " + (x + y));
    }

    static void add(Float a, Float b) {
        System.out.println("addititon of two decimal: " + (a + b));
    }

    static void add(String p, String q) {
        System.out.println("concatenation of two strings: " + (p + q));
    }

    public static void main(String args[]) {
        add(10, 20);
        add(1.3f, 1.2f);
        add("ram", "abc");

    }

}
