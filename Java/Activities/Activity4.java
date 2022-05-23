package activities;

public class Activity4 {

	
	static void insertionSort(int[] arr) {
		
		int size = arr.length;
		//iterate
		for(int i=1; i<size;i++) {
		//second element compare to first element	
		//if less than then replace 1 with 2 	
			int n = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>n) {
				arr[j+1] = arr[j];
						j--;
			}
			arr[j+1] = n;
			
		}
		
		for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + ",");
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {4,3,2,10,12,1,5,6};
		insertionSort(arr);
		
	}
	
}
