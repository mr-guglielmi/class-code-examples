/*
 * Author: Mr. Guglielmi
 * Date: 24/01/2024
 * Description: This program demonstrates basic file read and write operations
 */
import java.io.*;
import java.util.Scanner;

public class FileOps{
	
	Scanner s;
	
	FileOps(){
		s = new Scanner (System.in);
	}
	
	public void writeFile(){
		System.out.println ("Enter the name of the file:");
		String name = s.nextLine();
		
		System.out.println ("Enter the data to be written");
		String data = s.nextLine();
		
		try{
			PrintWriter p = new PrintWriter (new FileWriter (name, true)); //open the file for writing with append
			//data will be added to the end of the file
			
			p.println (data);
			p.close();	//must close to save the data to disk
		}
		
		catch (Exception e){
			//exception if for some reason the file cannot be opened/created
			System.out.println (e.getMessage());
		}
		
		return;
	}
	
	public void readFile(){
		String data[];
		System.out.println ("Enter the name of the file:");
		String name = s.nextLine();
		
		try{
			File f = new File (name);
			int size = fileSize(f); //get the size of the file
			
			if (size > 0){
				data = new String [size]; //if there is data in the file, initialize the array to the correct size
			}
			else{
				return; // otherwise, return from the method
			}
			
			Scanner a = new Scanner (f); //open the file
			for (int i = 0; i < size; i++){
				data[i] = a.nextLine(); //read all the data into the array
			}
			a.close(); //close the scanner when done with it
			//display the read data
			System.out.println ("Read successful. Data read:");
			for (String i : data){
				System.out.println (i);
			}
		}
		catch (Exception e){
			//handle any errors. usually, this is file not found
			System.out.println (e.getMessage());
		}
			
			
	
	return;
		
	}
	
	
	//utility method to calculate file size
	private int fileSize (File f){
		int count = 0;
		try{
			Scanner a = new Scanner (f); //open the file
	
			//loop through and count the lines
			while (a.hasNextLine()){
				count++;
				a.nextLine();
			}

		}

    catch (Exception e){
		//if the file doesn't exist
		System.out.println (e.getMessage());
    }

    return count; //return the number of lines
}
	
	
	
	
}
