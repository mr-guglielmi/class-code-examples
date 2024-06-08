/**
A program which implements a stack data structure and associated operations
@Author Mr. Guglielmi
@version 1.0
*/

import java.util.ArrayList;
public class Stack{
	
	/** array list for stack storage space. Allows arbitrary stack size*/
	private ArrayList<String> contents;
	
	/**
		Creates a new instance of the empty stack
		
	*/
	Stack(){
		contents = new ArrayList<String>();
	}
	
	/**
	A method which pushes data to the stack
	@param a  the string data to be pushed to the stack
	*/
	public void push(String a){
		contents.add(a);
	}
	
	/**
	A method which will return the top value of the stack, and removes it from the stack.
	
	@return  the top value of the stack. If the stack is empty, null will be returned
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
	Peeks at the top of the stack. Does not remove any data from the stack
	@return  the top value of the stack. Returns null if the stack is empty.
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
	
	
