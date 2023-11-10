import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] numbers = {4,2,7,1,8,3,6};
	    int flag = 0;
	    
	    System.out.println("Enter the number to be found out: ");
	    Scanner sc = new Scanner(System.in);
	    int x = Integer.parseInt(sc.nextLine());
	    
	    for(int i=0;i<numbers.length;i++){
	      if (x==numbers[i]){
	        System.out.println("Successful search, the element is found at position "+ i);
	        flag = 1;
	        break;
	      }
	    }

	    if(flag==0){
	      System.out.println("Oops! Search unsuccessful");
	    }

	}

}
