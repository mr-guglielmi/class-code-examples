
public class SortLibrary{
	
	
	private static void swap(int arr[], int i, int j){
	
	}
	
	public static void bubbleSort(int arr[]){
	
	}
	
	
	public static void selectionSort(int arr[]){
	
	}
	
	public static void insertionSort (int arr[]){
	
	}
	
	public static void mergeSort (int arr[], int n){
	
	}
	
	//utility function for implementing merge sort
	private static void merge (int a[], int r[], int l[], int left, int right){
		int i = 0, j = 0, k = 0;
		
		while (i < left && j < right){
			if (l[i] <= r[j]){
				a[k++] = l[i++];
			}
			else {
				a[k++] = r[j++];
			}
		}
		
		while (i < left){
			a[k++] = l[i++];
		}
		
		while (j < right){
			a[k++] = r[j++];
		}
	
	}


}