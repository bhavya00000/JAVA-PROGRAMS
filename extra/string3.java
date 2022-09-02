
// Class
public class string3 {

    // Main driver method
    public static void main(String args[]) {
        // Custom input string
        String str = "GeeksForGeeks";
        char c;

        // Creating array and storing the array
        // returned by toCharArray() method
        char[] ch = str.toCharArray();
        char[] x = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                ch[i] = str.charAt(i);

            else if (c >= 'a' && c <= 'z')
                x[i] = str.charAt(i);

            System.out.println(x[i]);
            System.out.println(ch[i]);
        }

    }
}
