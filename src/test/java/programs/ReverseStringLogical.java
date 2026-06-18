package programs;

public class ReverseStringLogical {
	public static void main(String[] args) {
		String str = "Today is Friday";
		String lstr = str.toLowerCase();
		String sprstr = lstr.replaceAll(" ", "");
		for (int i = sprstr.length() - 1; i >= 0; i--) {
			char c = sprstr.charAt(i);
			System.out.print(c);
		}

	}

}
 