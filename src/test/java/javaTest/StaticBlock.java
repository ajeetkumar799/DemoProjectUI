package javaTest;

public class StaticBlock {
	/*
	 * static block is used to initialize the data member
	 */
	/*
	 * Without using the main method we can run the java class for JDK version <=7
	 * but in modern Java class we can not run the java class without main method.
	 * in modern java class by using static block we can run the java class before
	 * the main method at the time of class loading
	 */

	static {
		System.out.println("Static method invoked");
	}

	public static void main(String[] args) {
		System.out.println("Hi");
	}
}
