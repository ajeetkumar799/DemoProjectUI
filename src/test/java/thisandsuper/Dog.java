package thisandsuper;

public class Dog extends Animal {
	String color = "Black";

	void display() {
		System.out.println(color); // current class variable
		System.out.println(super.color); // parent class variable so this is used to call
		// global variable
	}

	public static void main(String[] args) {

		Dog s = new Dog();
		s.display();
	}
}
