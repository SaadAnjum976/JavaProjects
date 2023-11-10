import java.util.Scanner;

public class IntegerAverage {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the count of numbers: ");
		    int count = Integer.parseInt(sc.nextLine());
		    int i = 0;
		    float sum = 0;
		    for(i=0;i<count;i++){
		      System.out.println("Enter an integer: ");
		      int x = Integer.parseInt(sc.nextLine());
		      sum = sum + x;
		    }
		  
		    float avg = sum/count;
		    System.out.println("The average is: "+avg);

	}

}
