package javaTest;

public class Test123 {
   final static int a=10;
  final  static int b=12;
  final int c=14;
  
	public static void test1() {
		System.out.println("Dog");
	}

	public static void test2() {
		System.out.println("Cat");
	}

	public static void test3() {
		System.out.println("Parrot");
	}
	
	Test123(int a , int b) {
		
	}
	public static void main(String[] args) {
		Test123 s = new Test123(a ,b);
		test1();
		test2();
		test3();

	}
}
