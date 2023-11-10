import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		
		 Scanner cs=new Scanner(System.in);
		    int n;
				System.out.print("Enter the position(N): ");
				n=cs.nextInt();
				System.out.print("Nth Fibonacci Number is: "+NthFibonacciNumber(n));
		  }

		  static int NthFibonacciNumber(int n){
			    if(n==1)
			        return 0;
			    else if(n==2)
			        return 1;
			    else
			        return NthFibonacciNumber(n-1)+NthFibonacciNumber(n-2);
			}


}

