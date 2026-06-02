package programs;

public class LargestInFour {
	public static void main(String[] args) {
		int a = 101;
		int b = 12;
		int c = 14;
		int d = 161;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println("A is largest" + a);
				} else {
					System.out.println("d is largest" + d);

				}

			} else {
				if (c > d) {
					System.out.println("c is largest" + c);
				} else {
					System.out.println("d is largest" + d);
				}
			}

		} else {
			if (b > c) {
				if (b > d) {
					System.out.println("B largest" + b);
				} else {
					System.out.println("D largest" + d);

				}
			} else {
				if (c > d) {
					System.out.println("C largest" + c);
				} else {
					System.out.println("d largest" + d);

				}
			}
		}

	}
	

}
