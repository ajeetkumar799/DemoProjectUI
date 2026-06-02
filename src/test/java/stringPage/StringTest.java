package stringPage;

public class StringTest {
	public static void main(String[] args) {
		String s = "   Selenium   test by  ";
		int a = s.length();
		System.out.println(a);
		boolean b = s.contains("um");
		System.out.println(b);
		boolean c = s.equalsIgnoreCase("seleNiUM");
		System.out.println("C value:" + c);
		String d = s.concat("ByAjeet");
		System.out.println(d);
		boolean e =s.isBlank();
		System.out.println(e);
		boolean f=s.isEmpty();// does not count white space
		System.out.println(f);
		String []g=s.split("ele");
		for(String h:g) {
			//System.out.print(h);
		}
		String i =s.trim();// leading and trailing spaces removed
		System.out.println(i);
		String j=s.toUpperCase();
		System.out.println(j);
		String k=s.replace("Selenium","AjeetSingh");
		System.out.println(k);
		String l=s.replaceAll("By", "haha");
		System.out.println(l);

	}

}
