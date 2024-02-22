public class Driver{


	public static void main (String[] args){
	
		//instantiate the quadratic f(x) = 2x^2 - 4x - 6
		Quad q = new Quad (2,-4,-6);
		
		//display
		System.out.println ("Working with the function f(x) = " + q.toString());
		
		//find zeros
		Point zeros[] = q.findZeros();
		
		System.out.println ("The zeros of f(x) = " + q.toString() + " are:");
		for (Point i : zeros){
			System.out.println (i.toString());
		}
		
		//solve for y
		
		System.out.printf ("f(4) = %d%n", q.solveY (4)); 
		
		//check if points are on the curve
		
		Point p1 = new Point (4, 10);
		Point p2 = new Point (7, -12);
		
		System.out.println ("Point " + p1.toString() + " is on the curve: " + q.onCurve (p1));
		System.out.println ("Point " + p2.toString() + " is on the curve: " + q.onCurve (p2));
 		
				
	}
	
}