
public class RoadStats{
	
	protected int[] carsPerHour;
	protected int currentTime;
	
	RoadStats (int[] c){
		this.carsPerHour = c;
		currentTime = 0;
	}
	
	RoadStats (){
		this.carsPerHour = new int [24];
		currentTime = 0;
	}
	
	public int getCars (int hour){
		return this.carsPerHour [hour];
	}
	
	
	public void nextHour(){
		if (currentTime < 24){
		
			this.currentTime++;
		}
		else {
			System.out.println ("End of day reached");
		}
	}
	
	public void countCar(){
		this.carsPerHour[currentTime]++;
	}
	
	public int[] getDayData(){
		return this.carsPerHour;
	}
		

	
}