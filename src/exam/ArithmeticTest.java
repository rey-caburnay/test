package exam;

import java.util.Vector;

public class ArithmeticTest extends Parent {

	public ArithmeticTest() {
		// TODO Auto-generated constructor stub
		super();
		init();
		
	}
	
	private void init() {}
	
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector(5,10);
		int i = 120 << 1;
		double d = 40.0;
		float f = 45.0f;
		Boolean flag = true;
		Boolean flag1 = false;
		divide(2,10);
		loop: for(int x = 1; x < 3; x++) {
			
		}
		
		System.out.println(i);	
	}
	
	public static void divide(int a, int b) {
		try {
			int c = a/b;
		}catch(Exception e) {
			System.out.println("exception");
		}finally {
			System.out.println("finally");
		}
		
	}
}
