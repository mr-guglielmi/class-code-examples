
public class Validator{

	protected int num;
	
	Validator (int n){
		this.num = n;
	}
	
	public boolean isEven (){
		return this.num % 2 == 0;
	}
	
	public boolean isDivisible (int x){
		return this.num % x == 0;
	}
	
	public boolean guessNumber(int x){
		return this.num == x;
	}
	
	public int getPower(int x){
		return (int) Math.pow (this.num, x);
	}
	
	

}