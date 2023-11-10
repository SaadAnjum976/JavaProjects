import java.util.Scanner;

public class QuadraticEqRoots {

	public static void main(String[] args) {
		
		System.out.println("Enter the first coefficient: ");
	    Scanner sc = new Scanner(System.in);
	    double a = Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the second coefficient: ");
	    double b = Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the third coefficient: ");
	    double c = Integer.parseInt(sc.nextLine());

	    if(a!=0.0){
	      double d = (b*b)-(4*a*c);
	      if (d==0.0){
	        System.out.println("The roots are real and equal.");
	        double r = -b/(2*a);
	        System.out.println("The roots are "+ r+"and"+ r);
	      }else if(d>0.0){
	        System.out.println("The roots are real and distinct.");
	        double r1 = (-b+(Math.sqrt(d)))/(2*a);
	        double r2 = (-b-(Math.sqrt(d)))/(2*a);
	        System.out.println("The root1 is: "+ r1);
	        System.out.println("The root2 is: "+ r2);
	      }else{
	        System.out.println("The roots are imaginary.");
	        double rp = -b/(2*a);
	        double ip = Math.sqrt(-d)/(2*a);
	        System.out.println("The root1 is: "+ rp+ "+ i"+ip);
	        System.out.println("The root2 is: "+ rp+ "- i"+ip);
	      }   
	    }else{
	      System.out.println("Not a quadratic equation.");
	    }

	}

}
