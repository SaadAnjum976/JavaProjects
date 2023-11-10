import java.util.Scanner;

public class Multipleof5and7 {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer: ");
	    Scanner sc = new Scanner(System.in);
	    int number =Integer.parseInt(sc.nextLine());
	    
	    if((number%5==0)&&(number%7==0)){
	      System.out.println(number+" is a multiple of both 5 and 7");
	    }
	    else{
	      System.out.println(number+" is not a multiple of both 5 and 7");
	    }

	}

}
