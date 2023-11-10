import java.util.Scanner;

public class FibonacciIterationPrint {

	public static void main(String[] args) {
		
		int n1=0,n2=1;
	    Scanner cs=new Scanner(System.in);
			System.out.print("Enter the number of terms in the sequence: ");
			int count = cs.nextInt(); 
	    int n3,i;
	    
	    System.out.print(n1+" "+n2);//printing 0 and 1
	    //printing from 2 because 0 and 1 are already printed  
	    for(i=2;i<count;++i){
	      n3=n1+n2;    
	      System.out.print(" "+n3);    
	      n1=n2;    
	      n2=n3;
	      }    

	}

}
