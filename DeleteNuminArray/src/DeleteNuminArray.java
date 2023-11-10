import java.util.ArrayList;
import java.util.Scanner;

public class DeleteNuminArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(5); 
	    numbers.add(3);
	    numbers.add(7);
	    numbers.add(1);
	    numbers.add(4);
	    
	    System.out.println(numbers);

	    System.out.println("Enter the position of the element to be deleted: ");
	    Scanner sc = new Scanner(System.in);
	    int x = Integer.parseInt(sc.nextLine());

	    numbers.remove(x);

	    System.out.println(numbers);   

	}

}
