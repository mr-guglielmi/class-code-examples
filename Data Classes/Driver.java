/*
Author: Mr. Guglielmi
Date: 06/02/2024
Description: This class implements a school object to demonstrate it's functions. This is acomplished
via a static method demonstrator
*/

public class Driver{
	
	//method to demonstrate the use of objects and methods
	private static void displayStudents(School school){
		Student[] roster = school.getStudents();
		
		for (Student s : roster){
			System.out.printf ("Student: %s%nGrade: %d%n", s.getName(), s.getGrade());
			System.out.println ("Courses:");
			for (String c : s.getCourses()){
				System.out.println (c);
			}
			System.out.println();
		}
		return;
	}
		

	public static void main (String[] args){
		Student s1 = new Student ("Bob", 10, new String[] {"ICS3U", "FSF2O", "MPM2D", "ENG2D"});
		Student s2 = new Student ("Jim", 11);
		
		School s = new School (new Student[] {s1, s2});
		
		displayStudents (s);
	}
	
}