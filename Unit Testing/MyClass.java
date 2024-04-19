
public class MyClass{
	int num;
	
	MyClass(){
		num = 0;
	
	}
	
	public int sum (int a, int b){
		return a + b;
	}
	
	public boolean divis (int a, int b){
		return a % b == 0;
	}
	
	public void updateField (int n){
		this.num = n;
	}
	
	public int getField(){
		return num;
	}


}