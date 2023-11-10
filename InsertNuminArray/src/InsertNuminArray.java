import java.util.Arrays;
import java.util.Scanner;

public class InsertNuminArray {

	public static void main(String[] args) {
		
		int[] numbers = {3,4,1,9,6,2,8};
	    System.out.println(Arrays.toString(numbers));

	    System.out.println("Enter the number to be inserted: ");
	    Scanner sc = new Scanner(System.in);
	    int x = Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the position: ");
	    int y = Integer.parseInt(sc.nextLine());

	    for(int i=numbers.length-1;i>y;i--){
	        numbers[i] = numbers[i-1];
	    }
	    numbers[y] = x;

	   System.out.println(Arrays.toString(numbers));   
	        

	}

}
