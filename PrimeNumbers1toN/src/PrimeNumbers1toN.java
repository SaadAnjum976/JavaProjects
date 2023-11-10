import java.util.Scanner;

public class PrimeNumbers1toN {

	public static void main(String[] args) {
		
		System.out.println("Enter the range: ");
	    Scanner sc = new Scanner(System.in);
	    int number =Integer.parseInt(sc.nextLine());

	    for (int num = 2; num <= number; num++)
	        {
	            boolean isPrime = true;
	            for (int i=2; i <= num/2; i++)
	            {
	                if ( num % i == 0)
	                {
	                    isPrime = false;
	                    break;
	                }
	            }
	 
	            if ( isPrime == true )
	                System.out.println(num);
	        }

	}

}
