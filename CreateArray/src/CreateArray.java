
public class CreateArray {

	public static void main(String[] args) {
		
		 int[] numbers = new int[10];
		 int value = 9;
		    
		 for(int i=0;i<numbers.length;i++){
			 numbers[i] = value;
			 value--;
		 }

		 for (int i : numbers){ 
	       System.out.println(i);
		 }

	}

}
