/*
Author: Mr. Guglielmi
Date: 06/02/2024
Description: This class implements a student object for a high school student
*/
public class Student{

	//fields
	private String name;
	private int grade;
	private String[] courses;
	
	
	//constructors
	Student (String n, int g, String[] c){
		this.name = n;
		this.grade = g;
		this.courses = c;
	}
	
	Student (String n, int g){
		this.name = n;
		this.grade = g;
		this.courses = new String[4];
	}
	
	//getter and setter methods
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String n){
		this.name = n;
		return;
	}
	
	public int getGrade(){
		return this.grade;
	}
	
	public String getCourse (int i){
		return this.courses[i];
	}
	
	public String[] getCourses(){
		return this.courses;
	}
	
	public void setCourse (String s, int period){
		this.courses[period] = s;
		return;
	}
	//other methods
	
	public void nextGrade(){
		this.grade++;
		return;
	}
	
	public String toString(){
		String s = this.name + "," + this.grade + ",";
		for (String c : this.courses){
			s = s + c + ",";
		}
		
		return s.substring(0, s.length()-1); //trim the extra ,
	}
	
	
}
	
	