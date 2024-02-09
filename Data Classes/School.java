/*
Author: Mr. Guglielmi
Date: 06/02/2024
Description: This class implements a student object for a high school student
*/
public class School{
	
	//fields
	private Student[] roster;
	private int numStudents;
	
	//constructors
	School(){
		this.roster = new Student[10];
		this.numStudents = 0;
	}
	
	School (Student[] r){
		this.roster = r;
		this.numStudents = r.length;
	}
	
	
	//methods
	public void enrollStudent(Student s){
		this.numStudents++;
		this.roster[numStudents] = s;
		return;
	}
	
	public Student[] getStudents(){
		return this.roster;
	}
	


}