/*
Author: Mr. Guglielmi
Date: 06/02/2024
Description: This class implements a student object for a high school student
*/
import java.util.ArrayList;
public class School{
	
	//fields
	private ArrayList<Student> roster;
		
	//constructors
	School(){
		this.roster = new ArrayList<Student>();
	}
	
	School (Student[] r){
		this.roster = new ArrayList<Student>();
		for (Student s : r){ //add the students from the passed array to the list
			roster.add(s);
		}
	}
	
	
	//methods
	public void enrollStudent(Student s){
		this.roster.add(s);
		return;
	}
	
	public Student[] getStudents(){
		Student[] a = new Student [this.roster.size()]; //set the array type
		a = this.roster.toArray(a); //convert the list to an array
		return a;
	}
	


}