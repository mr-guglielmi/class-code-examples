/*
Author: Mr. Guglielmi
Date: 12/03/2024
Description: This is a simple test class to illustrate the timer
*/
import java.util.Scanner;
public class Test{

    public static void main (String[] args){
	Scanner s = new Scanner (System.in); //get a scanner
	int i = 0;
	Timer t = new Timer(); //instantiate a timer
	t.start(); //start the timer
	while (t.isRunning()){ //loop while the timer is running
	    i = s.nextInt(); //get the option

	    if (i == 1){//check time elapsed
		System.out.printf("The time is: %d%n", t.getTime());
	    }

	    else if (i == 2){
		t.endTimer(); //kill the timer thread and end the loop
	    }

	}

	System.out.println ("Program ended");
    }

}
