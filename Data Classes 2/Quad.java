/*
 * 
 * Author: Mr. Guglielmi
 * Date: 22/02/2024
 * Description: This class implements a quadratic polynomial in the form y = Ax^2 + Bx + C
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
	
	//method to calculate and return the zeros of the quadratic
	public Point[] findZeros(){
		
	}
 }
 
 
