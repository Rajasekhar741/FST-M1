package activities;

public class Activity2 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,77,10,54,-11,10};
		int temp =0;

		for(int numbers: arr)	{
			if(numbers==10) {
				temp += 10;
			}
		}
		
		if(temp==30) {
			System.out.println("True");
		}
		else 
			System.out.println("False");
		}
	

}
