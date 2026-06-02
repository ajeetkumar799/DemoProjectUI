package programs;

public class Fabonaccii_Series {
	public static void main(String[] args) {

		int n = 10;
		int first = 0;
		int second = 1;
		for (int i = 0; i <= n; i++) {
			int next = first + second;
			first = second;
			second = next;
			System.out.print(first + ",");

		}

	}

}
