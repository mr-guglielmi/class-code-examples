/*
Author: Mr. Guglielmi
Date: 12/03/2024
Description: This is a simple test class to illustrate the timer and sorter objects
*/
import java.util.Scanner;
import java.util.Random;
public class Test{

    public static void main (String[] args){
	 
	 	//init a large array and fill it with random numbers
		//an array size of 50 million takes ~3 seconds to sort. Change the size to see different timings
	 	int array[] = new int [50000000]; 
		Random r = new Random();
		
		for (int i = 0; i < array.length; i++){
			array[i] = r.nextInt(1000);
		}
		
		//initialize a sorter object
		Sorter s = new Sorter (array);
		
		//sort the array with the timer
		s.timedSort();
	 }
	
}
