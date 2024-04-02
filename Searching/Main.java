public class Main{
	//class for testing
	//the key value to be searched for must be passed as a runtime argument
	public static void main (String[] args){
		int key;
		if (args.length >= 1){
			key = Integer.parseInt(args[0]);
		}
		else{
			System.out.println ("Error, no key specified. Searching for 0 by default");
			key = 0;
		}
			
		
		int nums[] = {8, 4, 7 , 12, 16, 9, 1, 2};
		Searcher s = new Searcher(nums);
		
		//comment or uncomment accordingly to test
		
		//linear search
		//does not sort the list
		int val = s.search(key);
		System.out.printf ("The value %d was located at index: %d", key, val);
		
		//binary search
		//will sort before searching
		/*
		int val = s.binarySearch (key);
		System.out.printf ("The value %d was located at index %d", key, val);
		*/
		
		
		
		
	}
	
} 