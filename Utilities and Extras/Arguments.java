/*
Author: Mr. Guglielmi
Date: 22/03/2024
Description: A program which demonstrates how command line arguments can be processed. These can be specified in the IDE by selecting the "run arguments"
option in the run menus. Locations of where to enter run arguments vary by IDE
*/
public class Arguments{

	//utility method to test if a value is an integer
	//speeds up conversion
	public static boolean checkInt(String s){
		try{
			Integer.parseInt(s); //if it converts, return true
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	

	public static void main(String[] args){
	
		System.out.printf ("You entererd %d argument%n", args.length); //see how many arguments are there
		
		if (args.length >0){ //check if arguments have been entered
			
			if (args[0].equals("-s")){//if the -s argument was passed, sum up all the other arguments
				int sum = 0;
				for (String i : args){
					if (checkInt(i)){ //only sum the arguments that are integers
						sum += Integer.parseInt(i);
					}
				}
				System.out.printf ("The sum of the arguments is %d", sum);
			}
			else{ 
				//otherwise, just display the arguments
				System.out.print ("The are: ");
				for (String i : args){
					System.out.printf ("%s ", i);
				}
			}
		}
	}

}