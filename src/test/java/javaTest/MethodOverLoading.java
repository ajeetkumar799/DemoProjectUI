package javaTest;

public class MethodOverLoading {
	public void demo() {
		System.out.println("Demo");
	}

	public int demo(int a, int b) {
		int c = a + b;
		return c;
	}

	public void demo(int a, String s) {
		System.out.println("Demo123");
	}

	public String demo(String s1, String s2) {
		String s = "qwe" + "qwew";
		return s;
	}

	public void demo(boolean b, int a) {
		System.out.println("Demo");
	}

	public void demo(double d, Byte b) {
		System.out.println("Demo");
	}

	public void demo(float f) {
		System.out.println("Demo");
	}

	public static void main(String[] args) {
		MethodOverLoading ref = new MethodOverLoading();
		ref.demo();
		ref.demo(false, 1);
		ref.demo(0, 0);
		ref.demo(0.0, null);
		int  t = ref.demo(23, 23);
		ref.demo(false, 0);
		System.out.println(t);
	}

}
