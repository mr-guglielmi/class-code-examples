public class Term{

	protected double  coeff;
	protected double exp;
	
	Term (double c, double e){
		this.coeff = c;
		this.exp = e;
	}
	
	
	public double evaluate (double x){
		return (Math.pow (x, this.exp)) * this.coeff;
	}
	
	public String toString(){
		return this.coeff + "x^" + this.exp;
	}
	
	public double getCoeff (){
		return this.coeff;
	}
	
	public double getExp (){
		return this.exp;
	}
	
	public void setCoeff (double a){
		this.coeff = a;
	}
	
	public void setExp (double a){
		this.exp = a;
	}
}