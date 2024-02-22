/*
 * Author: Mr. Guglielmi
 * Date: 22/02/2024
 * Description: This class implementes a cartesian point in the form (x, y)
 * 
 * */

public class Point{
	
	
	//fields for the point's two values
	private int x;
	private int y;
	
	
	//constructor to instantiate a point with x and y values
	Point (int x_val, int y_val){
		this.x = x_val;
		this.y = y_val;
	}
	
	//constructor to instantiate a point without provided values -- will create the origin
	
	Point (){
		this.x = 0;
		this.y = 0;
	}
	
	
	//getter methods to access fields from outside the instance
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	//method do retern a string in the ordered pair format (x,y)
	public String toString(){
		return "(" + this.x +"," + this.y + ")";
	}
}
