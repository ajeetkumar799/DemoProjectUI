package thisandsuper;

class This1 {
// this is keyword in java that is current object  of class
	int age = 25;
	static int a = 10;
	int b = 20;
	int c = 30;

//	// Constructor
//	This1(int age) {
//		this.age = age; // this.age = instance variable
//	}

	void display() {
		System.out.println("Age: " + age);
	}

	public void testing() {
		int a = 100;
		int b = 200;
		int c = 300;
		System.out.println(this.a);// to call the global variable
		System.out.println(this.b);// to call the global variable
		System.out.println(this.c);
		System.out.println("==============");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	public static void main(String[] args) {
		This1 s = new This1();
		s.b = 1000;// asined new value
		s.testing();
		System.out.println("-------"+s.b);

	}
}
