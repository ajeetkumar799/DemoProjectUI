package programs;

public class SwapNumber {
	public static void main(String[] args) {
		// swapping of two number mathematical way
		/*
		 int a = 10; int b = 20;
		 
		 a = a + b;// 30 
		 b = a - b;// 10 
		 a = a - b;//20 
		 System.out.println("b=" + b);
		 System.out.println("a=" + a);
		 
		 */
		// swaping of three number mathematical way
		/*
		int a = 10;
		int b = 20;
		int c = 30;
		a = a + b + c;// 60
		b = a - (b + c);// 10
		c = a - (b + c);// 20
		a = a - (b + c);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
        */
		// swaping of two number by storing into a temp variable;
		/*
		int a=10;
		int b=20;
		int  tmp=a;
		a=b;
		b=tmp;
		System.out.println("a="+a);
		System.out.println("b="+tmp);
		
		*/
		//swapping three number by storing into a variable;
		int a= 10;
		int b=20;
		int c=30;
		
		int tmp=a;
		a=b;
		b=c;
		c=tmp;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
	}

}
