/*
Author: Mr. Guglielmi
Date: 06/02/2024
Description: This class implements a school object to demonstrate it's functions. This is acomplished
via a static method demonstrator
*/
import java.util.Scanner;
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
		Scanner in = new Scanner (System.in); //scanner only needed in main. For demonstration purposes, generally scanner should be in an instance level.
		
		Student s1 = new Student ("Bob", 10, new String[] {"ICS3U", "FSF2O", "MPM2D", "ENG2D"});
		Student s2 = new Student ("Jim", 11);
		
		School s = new School (new Student[] {s1, s2});
		
		
		
		int choice = 0;
		 //implement a menu to demonstrate features
		while (choice != -1){
			System.out.println ("Menu Options");
			System.out.println ("1 -- Display School Roster");
			System.out.println ("2 -- Add student with classes");
			System.out.println ("3 -- Add student without classes");
			System.out.println ("-1 --Exit");
			
			choice = in.nextInt();
			in.nextLine(); //clear the return
			
			if (choice == 1){
				displayStudents (s);
			}
			
			else if (choice == 2){
				System.out.println ("Enter the student name, grade, and 4 classes");
				String n = in.nextLine();
				
				int g = in.nextInt();
				in.nextLine();	//clear the return
				
				String c[] = new String[4];
				
				 c[0] = in.nextLine();
				 c[1] = in.nextLine();
				 c[2] = in.nextLine();
				 c[3] = in.nextLine();
				
				s.enrollStudent (new Student (n, g, c));
			}
			
			else if (choice == 3){
				System.out.println ("Enter the student name, grade");
				String n = in.nextLine();
				
				int g = in.nextInt();
				in.nextLine();	//clear the return
				
				s.enrollStudent (new Student (n, g));
			}

			
		}
		
	}
	
}