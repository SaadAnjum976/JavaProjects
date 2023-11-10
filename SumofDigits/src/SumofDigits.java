import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		int sum = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer: ");
	    int number =Integer.parseInt(sc.nextLine());
	    
	    while(number!=0){
	      int digit = number%10;
	      sum = sum+digit;
	      number = number/10;
	    }
	    
	    System.out.println(("Sum of digits is: "+ sum));

	}

}
