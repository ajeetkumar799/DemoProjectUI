package stringPage;

public class Strings123 {

	public static void main(String[] args) {
		String s = "Selenium";
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		char d = s.charAt(3);
		char e = s.charAt(4);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		int f = s.length();
		System.out.println(f);
		for (int i = 0; i < f; i++) {
			System.out.print(s.charAt(i) + ",");
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
