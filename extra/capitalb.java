import java.util.*;

public class capitalb

{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement");
		String s = sc.nextLine();

		int count = 0;
		if (Character.isUpperCase(s.charAt(0))) {
			count++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i - 1)) && Character.isUpperCase(s.charAt(i)))

				count++;

		}
		System.out.println("total  number of words start with capital letters are :" + count);
		sc.close();
	}

}