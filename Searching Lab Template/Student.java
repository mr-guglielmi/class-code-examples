
public class Student{

	String name;
	double average;
	
	Student (String n, double a){
		this.name = n;
		this.average = a;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public double getAverage(){
		return this.average;
	}
	
}