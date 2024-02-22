/*
 * 
 * Author: Mr. Guglielmi
 * Date: 22/02/2024
 * Description: This class implements a quadratic polynomial in the form f(x) = Ax^2 + Bx + C
 * 
 * */
 
 public class Quad{
	 
	 //fields for the coefficients
	 private int A;
	 private int B;
	 private int C;
	 
	 //constructors
	 
	 Quad (int a, int b, int c){
		 this.A = a;
		 this.B = b;
		 this.C = c;
	 }
	 
		 
	 //method to solve for y for a given x
	 public int solveY(int x){
		return A*x*x + B*x + C;
	}
	
	//method to calculate and return the zeros of the quadratic, rounded off to an integer
	//the size of the returned array will indicate the number of zeros the quadratic has
	public Point[] findZeros(){
		int disc = (B * B) - (4 * A * C);
		
		//if the roots are imaginary, return null
		if (disc < 0){
			return null;
		}
		
		// if the function only has one zero (vertex) 
		else if (disc == 0) {
			int x = -1*B / 2*A;
			Point p = new Point (x, 0);
			return new Point[] {p}; //create a literal point array and return. 
		}
		
		else{
		//cast to int to ensure type correctness
			int x1 = (int)(-1*B + Math.sqrt (disc)) / (2 * A);
			int x2 = (int) (-1*B - Math.sqrt (disc)) / (2 * A);
			
			//instantiate the points
			Point p1 = new Point (x1, 0);
			Point p2 = new Point (x2, 0);
			
			return new Point [] {p1, p2}; //return the points as an array
		}		
			
	}
	//method to check if a given point is on the curve
	//compares the y value of the point to f(x)
	//returns true or false
	public boolean onCurve (Point p){
		return p.getY() == A * p.getX() * p.getX() + B * p.getX() + C;
	}
	
	//returns the quadratic formatted as a string
	public String toString(){
		return this.A + "x^2 + " + this.B+"x + "+ this.C;
	}
	
	
}
 
 
