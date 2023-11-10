import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer: ");
	    int number =Integer.parseInt(sc.nextLine());
	    int rev = 0;
	    
	    while(number!=0){
	      int digit = number%10;
	      rev = (rev*10)+digit;
	      number = number/10;
	      }
	    
	    System.out.println(rev);

	}

}
