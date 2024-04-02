import java.util.Scanner;
import java.io.*;
public class Course{

	Student[] roster;
	
	Course (Student[] r){
		this.roster = r;
	}
	
	public Student getStudent(int index){
		return roster[index];
	}
	
	// //linear search by name
// 	public int findStudent (String key){
// 		
// 		//to be implemented
// 	
// 	}
// 	
// 	//binary search by grade
// 	public int findStudent (int key){
// 	
// 	
// 	}
	
//======================================================
//utility methods here
	
	public static Student[] loadFile (String filename){
	
		//file format has class size as first value in file
		int n;
		Student[] temp;
		
		try{
			Scanner s = new Scanner (new File (filename));
			n = s.nextInt();
			s.nextLine();
			
			temp = new Student [n];
			
			for (int i = 0; i < temp.length; i++){
				String line = s.nextLine();
				String[] t = line.split(",");
				temp[i] = new Student (t[0], Double.parseDouble (t[1]));
			}
			return temp;
		}
		catch (Exception e){
			System.out.println (e.getMessage());
			return null;
		}
		 
	}
	
	
	private void sort(){
		int n = this.roster.length; //get the length
		
		int gap = n; //start the gap being the size of the array
		
		boolean swapped = true; //flag for if elements have swapped
		
		//while we're not at a gap of 1 and swaps have been made
		while (gap != 1 || swapped){
			
			gap = nextGap(gap); //get the next gap value
			
			swapped = false; //set the swapped flag
			
			for (int i = 0; i < n-gap; i++){ //iterate through the array by the gap size
				if (roster[i].getAverage() > roster[i + gap].getAverage()){ //if the current element is larger than the element 1 gap ahead 
					swap (roster, i, i+gap); //swap them
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
	private void swap(Student[] a, int i, int j){
		Student temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	
	
}