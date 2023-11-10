import java.util.Random;

public class LargestandSmallest {

	public static void main(String[] args) {
		
		int min = 1, max=100;
	    int largest=0;
	    int smallest=100;
	    int i = 1;
	    
	    while(i<=10){
	      //Generating a random number
	      Random r = new Random();
	      int randomNumber = min + r.nextInt(max);
	      System.out.println("Generated random number is: "+randomNumber);
	      if(randomNumber>largest){
	        largest = randomNumber;
	      }
	      if(randomNumber<smallest){
	        smallest = randomNumber;
	      }
	      i++;
	    }
	    
	    System.out.println("\n");
	    System.out.println("The smallest number is: "+smallest);
	    System.out.println("The largest number is: "+largest);
	    

	}

}
