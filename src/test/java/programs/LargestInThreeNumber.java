package programs;

public class LargestInThreeNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 14;

		if (a > b) {
			if (a > c) {
				System.out.println("A largest" + a);
			} else {
				System.out.println("C largest" + c);

			}
		} else {
			if (b > c) {
				System.out.println("B largest" + b);
			} else {
				System.out.println("C largest" + c);

			}
		}

	}

}