

import java.util.ArrayList;
/**
A program which implementes a stack Data Structure
@author Mr. Guglielmi
@version 1.0
*/
public class Stack{
	/** The data contained in the stack */
	private ArrayList<String> contents;
	
	/** 
	Basic constructor to initialize an empty stack
	*/
	Stack(){
		contents = new ArrayList<String>();
	}
	
	/**
	A method to add data to the stack
	@param a  the data string to be added
	*/
	public void push(String a){
		contents.add(a);
	}
	
	/** 
	A method to remove the top value of the stack
	@return the string on the top of the stack. this string is deleted from the contents list. an empty stack will return null
	*/
	public String pop(){
		if (contents.size() > 0){
			String temp = contents.get(contents.size() -1);
			contents.remove (contents.size() - 1);
			return temp;
		}
		else{
			return null;
		}
	}
	/**
	A method to get the value of the top value of the stack, but not remove it
	@return the value on top of the stack. this value remains on the stack. an empty stack returns null
	*/
	public String peek(){
		if (contents.size() > 0){
		
			return contents.get(contents.size() - 1);
		}
		else{
			return null;
		}
	}
	
}
	
	
