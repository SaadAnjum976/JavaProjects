import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		 int[] numbers = {1,4,6,7,12,17,25}; //binary search requires sorted numbers
		 System.out.println("Enter the number to be found out: ");
		 Scanner sc = new Scanner(System.in);
		 int x = Integer.parseInt(sc.nextLine());

		 int result = binarySearch(numbers, 0, numbers.length-1, x);
		    	if (result != -1)
		    		System.out.println("Search successful, element found at position "+result);
		    	else
		    		System.out.println("The given element is not present in the array");
		    
		  		}

		  public static int binarySearch(int[] numbers,int low,int high,int x){
		    if (high >= low){
		      int mid = low + (high - low)/2;
		      if (numbers[mid] == x)
		        return mid;
		      else if (numbers[mid] > x)
		        return binarySearch(numbers, low, mid-1, x);
		      else
		        return binarySearch(numbers, mid+1, high, x);
		    }else{
		      return -1;
		    }

	}

}
