import java.util.Scanner;

public class Average5Numbers {

	public static void main(String[] args) {
		
		int count = 0;
	    int sum = 0;
	    Scanner sc = new Scanner(System.in);
	    while(count<5) {
	      System.out.println("Enter an integer: ");
	      int number =Integer.parseInt(sc.nextLine());
	      sum = sum+number;
	      count++;
	   
	    }
	    
	    double avg = ((double) sum) / 5.0;
	    System.out.println("Average is: "+avg);
	    
	}

}
