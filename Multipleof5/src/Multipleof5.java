import java.util.Scanner;

public class Multipleof5 {

	public static void main(String[] args) {
		
		 System.out.println("Enter an integer: ");
		 Scanner sc = new Scanner(System.in);
		 int number =Integer.parseInt(sc.nextLine());
		    
		 if(number%5==0){
		    System.out.println(number+" is a multiple of 5");
		 }
		 else {
		    System.out.println(number+" is not a multiple of 5");
		 }

	}

}
