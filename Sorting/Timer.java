/*
Author: Mr. Guglielmi
Date: 12/04/2024
Description: This class implements a timer thread that can be used to time events in milliseconds. 
*/
public class Timer extends Thread{

    private int time;//the time
    private boolean running;//control for the thread

    Timer (){
	time = 0;//start the timer at 0
	running = true;

    }


    public int getTime(){
	return this.time; //get the current timer value
       
    }

    public void endTimer(){
	this.running = false; //end the loop in run, killing the thread
    }

    public boolean isRunning(){
	return this.running; //check if the timer is running
    }

    //override of the run method. Will execute when the thread is started
    public void run(){

	while (running){ //so long as the timer is running

	    try{
		sleep(1); //wait 1 millisecond
	    }
	    catch (Exception e){
	    
	    }

	    this.time++; //increment the time elapsed

	}
    }
}
