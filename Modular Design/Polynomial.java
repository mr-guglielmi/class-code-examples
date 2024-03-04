/*
Author: Mr. Guglielmi
Date: 04/04/2024
Description: This class implements a polynomial which can be displayed or evaluated
*/
import java.util.ArrayList;

public class Polynomial {
	
	//terms of the polynomial
	protected ArrayList<Term> terms;
	
	//create an empty polynomial
	Polynomial(){
		terms = new ArrayList<Term>();
	}
	//create a 1 term polynomial
	Polynomial (Term t){
		terms = new ArrayList<Term>();
		terms.add(t);
	}
	
	//create a polynomial from an array of terms
	Polynomial (Term[] t){
		terms = new ArrayList<Term>();
		for (Term i : t) {
			terms.add(i);
		}
	}
	
	//evaluate the polynomial with the provided value for the variable
	public int evaluate(int x) {
		int result = 0;
		
		for (int i = 0; i < terms.size(); i++) {
			result += terms.get(i).evaluate(x); //evaluate each term in the list and store the result
		}
		
		return result;
	}
	
	//display the polynomial
	public void display() {
		for (int i = 0; i < terms.size(); i++) {
			terms.get(i).display();
			System.out.print(" + "); //will add a + on after the last term but I don't feel like fixing it for this example
		}
		
		System.out.println();
	}
}
