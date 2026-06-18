package programs;

class StringUpperLowerSeparateAndCount {

	public static void main(String[] args) {
		String str = "SeleNIUm";
		String upperCase = "";
		String lowerCase = "";
		int upperCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCase = upperCase + c;
				upperCount = upperCount + 1;
			} else if (Character.isLowerCase(c)) {
				lowerCase = lowerCase + c;
				lowerCount = lowerCount + 1;
			}
		}
		System.out.println(" upperCase=" + upperCase + "," + "upperCount=" + upperCount);
		System.out.println(" lowerCase=" + lowerCase + "," + "lowerCount=" + lowerCount);
	}
}