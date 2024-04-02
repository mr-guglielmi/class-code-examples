public class Main{


	public static void main (String[] args){
	
		int nums[] = {1, 2, 3, 4, 5, 6,7, 8};
		Searcher s = new Searcher(nums);
		
		int val = s.search (12);
		
		System.out.printf ("%d was found at: %d", 5, val);
		
	}
	
} 