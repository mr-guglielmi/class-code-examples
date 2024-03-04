/*
Author: Mr. Guglielmi
Date: 04/04/2024
Description: This class implements a monomial term which has a coefficient, single variable, and exponent. 
*/

public class Term {
	//fields
	protected int coeff;
	protected int exp;
	
	//cereate a term
	Term (int c, int e){
		this.coeff = c;
		this.exp = e;
	}
	
	
	//method to evaluate the term at a provided value
	public int evaluate (int x) {
		int temp = this.coeff * x;
		
		return (int) Math.pow(temp, this.exp);
		
	}
	
	//display
	public void display() {
		System.out.printf("%dx^%d", this.coeff, this.exp);
	}

}
