/*
Author: Mr. Guglielmi
Date: 01/16/2024
Description: A simple program which demonstrate java structure
*/

import java.util.Scanner; //import the scanner class, used for user input

public class Beginner{

	Scanner s; //field for the scanner
	
	//constructor
	Beginner(){
		s = new Scanner (System.in); //instantiate scanner and set the input as the keyboard
	}

	//method to display
	public void display(){
	
		System.out.println ("Hello world!");
	}
	
	//method to get input and display it
	public void input(){
		String word;
		
		System.out.println ("Enter your name:");
		word = s.nextLine();	//get text input from the keyboard
		
		System.out.printf ("Hello %s", word); //formatted print out the input
	}
		


}

