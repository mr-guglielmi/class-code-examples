import java.util.ArrayList;
public class Stack{
	
	private ArrayList<String> contents;
	
	Stack(){
		contents = new ArrayList<String>();
	}
	
	
	public void push(String a){
		contents.add(a);
	}
	
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
	
	public String peek(){
		if (contents.size() > 0){
		
			return contents.get(contents.size() - 1);
		}
		else{
			return null;
		}
	}
	
}
	
	
