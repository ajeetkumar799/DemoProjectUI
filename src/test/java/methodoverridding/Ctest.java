package methodoverridding;

public class Ctest extends Atest {

	public void demo() {
		System.out.println("Demo Hi c class");
	}

	public static void main(String[] args) {
		Atest a = new Atest();
		a.demo();
		Atest b = new Btest();
		b.demo();
		Atest c = new Ctest();
		c.demo();

	}

}
