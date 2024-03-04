package poly;

public class Main {

	public static void main (String[] args) {
		
		Term t[] = {new Term (2, 4), new Term (-3, 1)};
		
		Polynomial p = new Polynomial (t);
		
		p.display();
		
		System.out.printf("Result: %d", p.evaluate(2));
		
		
	}
	
	
}
