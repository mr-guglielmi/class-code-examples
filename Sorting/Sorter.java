/*
Author: Mr. Guglielmi
Date: 19/03/2024
Description: This class implements a sorting algorithm that can sort integer data in an array which is either provided when the class is instantiated
or using the setter. The sort() method can then be called on the instance to sort the data. 
Generally I prefer to use static methods for sorting, but figured I should provide an example of using an object for this as well.
*/
public class Sorter{

	private int[] data;
	
	//empty constructor -- good practice and also if we need a sorter but don't yet have the array to be sorted
	Sorter(){
	
	}
	
	//constructor
	Sorter (int[] a){
		this.data = a;
	}
	
	//sort the data currently in the instance by using comb sort
	public void sort(){
		int n = this.data.length; //get the length
		
		int gap = n; //start the gap being the size of the array
		
		boolean swapped = true; //flag for if elements have swapped
		
		//while we're not at a gap of 1 and swaps have been made
		while (gap != 1 || swapped){
			
			gap = nextGap(gap); //get the next gap value
			
			swapped = false; //set the swapped flag
			
			for (int i = 0; i < n-gap; i++){ //iterate through the array by the gap size
				if (data[i] > data[i + gap]){ //if the current element is larger than the element 1 gap ahead 
					swap (data, i, i+gap); //swap them
					swapped = true;
				}
			}
		}
		
		
	}
	 //utility method for calculating the gap size
	private int nextGap (int g){
		g = (g*10)/13; //calculate the gap shrink factor (1.3)
		if (g < 1){ //if we're below 1, the gap is 1
			return 1;
		}
		else{
			return g;
		}
	}
	
	//utility method for swapping elements
	private void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	//sorts the array with comb sort and times how long (in ms) it takes
	public void timedSort(){
		Timer t = new Timer();
		t.start(); //start the timer
		sort(); //sort
		int time = t.getTime(); //get the elapsed time
		t.endTimer(); //end the timer
		
		System.out.printf ("The sort time was: %d%n", time);
	}
	
	//setter method to allow for new data to be sorted
	public void setData(int[] a){
		this.data = a;
	}
	
	//display the contents of the array in a formatted way
	public void display(){
		String temp = "";
		for (int i : data){
			temp = temp +  i + " | ";
		}
		
				System.out.println (temp.substring (0, temp.length() - 2)); //trim the trailing |
	}
			
}
	