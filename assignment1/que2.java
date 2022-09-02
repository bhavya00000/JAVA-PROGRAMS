class que2 {
    public static void main(String args[]) {
        int i = 1, j, n = 5, x = 2, count;
        while (i <= n) {
            for (j = 1, count = 0; j <= x; j++) {
                if (x % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(x);
                i++;
                x++;
            } else
                x++;
        }
    }
}
