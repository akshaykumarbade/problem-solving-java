package problemsolving;

// Q. Write a java program to reverse a string.

public class ReverseStringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "akshaykumar";
		char[] strarr = str.toCharArray();
		char[] result = new char[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			result[j] = strarr[i];
			j++;
		}
		// 1 st approach
		for (char c : result) {
			System.out.print(c);
		}

		System.out.println();
		// 2nd approach
		StringBuffer s = new StringBuffer();
		for (char c : result) {
			s.append(c);
		}
		System.out.println(s);
	}

}
