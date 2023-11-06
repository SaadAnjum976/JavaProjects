import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		 System.out.println("Enter a number: ");
		    Scanner sc = new Scanner(System.in);
		    int number =Integer.parseInt(sc.nextLine());
		    int x = number%2;
		    
		    if(x==0){
		      System.out.println("The number is Even");
		    }
		    else{
		      System.out.println("The number is Odd");
		    }
	}
}
