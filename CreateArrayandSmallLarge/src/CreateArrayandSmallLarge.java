import java.util.Random;

public class CreateArrayandSmallLarge {

	public static void main(String[] args) {
		

	    int min = 1, max=100;
	    int largest=0;
	    int smallest=100;
	    int[] numbers = new int[10];
	    
	    for(int i=0;i<numbers.length;i++){
	      Random r = new Random();
	      int randomNumber = min + r.nextInt(max);
	      numbers[i] = randomNumber;
	    }

	    for (int i : numbers){
	        System.out.println(i);
	        if(i>largest)
	          largest = i;
	        if(i<smallest)
	          smallest = i;
	      }

	    System.out.println("The largest number is: "+largest);
	    System.out.println("The smallest number is: "+smallest);
	    


	}

}
