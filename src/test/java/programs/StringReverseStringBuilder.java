package programs;

public class StringReverseStringBuilder {
	public static void main(String[] args) {
		String str = "Today is Friday";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder srb = sb.reverse();
		String rsb = srb.toString().toLowerCase().replace(" ", "");
		System.out.println(rsb);

	}
}
