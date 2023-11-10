import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		
		 System.out.println("Enter an integer greater than 1: ");
		    Scanner sc = new Scanner(System.in);
		    int number =Integer.parseInt(sc.nextLine());

		    int isprime = 1;

		    for(int i=2;i<(number/2);i++){
		      if(number%i==0){
		        isprime = 0;
		        break;
		      }
		    }
		    
		    if(isprime==1){
		      System.out.println(number+" is a prime number");
		    }
		    else{
		      System.out.println(number+" is not a prime number");
		    }

	}

}
