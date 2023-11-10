import java.util.Scanner;

public class RealNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of real numbers: ");
	    int count = Integer.parseInt(sc.nextLine());
	    int i = 0;
	    float product = 1.0f;
	    for(i=0;i<count;i++){
	      System.out.println("Enter a real number: ");
	      float x = Float.parseFloat(sc.nextLine());
	      product = product * x;
	    }
	  
	    System.out.println("The product of the numbers is: "+product);

	}

}
