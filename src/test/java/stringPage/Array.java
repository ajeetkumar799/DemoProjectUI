package stringPage;

public class Array {
	public static void main(String[] args) {
//		//int a[] = { 1, 2, 3, 4 };
//		int b = a.length;
//		System.out.println(b);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);

		int[] c = new int[3];
		c[0] = 100;
		c[1] = 20;
		c[2] = 30;
		//c[3] = 40;
		int d = c.length;
		// System.out.println(d);
		// System.out.println(c[2]);

//		for (int i = c.length - 1; i >= 0; i--) {
//			System.out.print(c[i] + ",");
//		}
		if(c[0]>c[1]) {
			if(c[0]>c[2]) {
				System.out.println("gretest:"+c[0]);
			}
			else {
				System.out.println("gretest:"+c[2]);

			}
		}
		else {
			if(c[1]>c[2]) {
				System.out.println("gretest:"+c[1]);
			}
			else {
				System.out.println("gretest:"+c[2]);
			}
		}
		
	}

}
