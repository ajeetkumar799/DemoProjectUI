package programs;

public class SeparateCharectersDigitsAlphabets {
	public static void main(String[] args) {
		String s = "Hello@World#2026!";
		int a = s.length();
		System.out.println(a);
		String digits = " ";
		String alphabets = " ";
		String specialChar = " ";
		for (int i = 0; i < a; i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				digits = digits + c;
			} else if (Character.isAlphabetic(c)) {
				alphabets = alphabets + c;
			}else {
				specialChar=specialChar+c;
			}
		}
		
		System.out.println("Digits="+digits);
		System.out.println("Alphabets="+alphabets);
		System.out.println("SpecialChar="+specialChar);

	}

}
