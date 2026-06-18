package programs;
// Online Java Compiler

// Use this editor to write, compile and run your Java code online

class ReverseTheArray {
	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4 };
		int l = a.length;
		// System.out.println(l);
		for (int i = l-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}