package methodoverridding;

public class Execution {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.drow();
		Shape t = new Rectangle();
		t.drow();
		Shape u = new Circle();
		u.drow();
	}

}
