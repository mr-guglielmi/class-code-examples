import java.util.Random;

public class SortTest{
	
	//fill the array with random numbers
	private static void initArray(int[] arr){
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(10000);
		}
	}
	
	//display the contents of the array
	private static void printArray(int[] arr){
		for (int i : arr){
			System.out.printf ("%d | ", i);
		}
	}
	
	public static void main(String[] args){
	
	int[] a = new int [10];
	
	initArray (a);
	printArray(a);
	
	}
	
	//call your sorting functions here to test and compare

}