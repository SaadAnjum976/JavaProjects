import java.util.Scanner;

public class LegoContainers {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("How many Lego bricks do we have? Choose an odd number between 50 and 100: ");
		 int amountOfBricks = Integer.parseInt(sc.nextLine());

		 System.out.println("How many Lego blocks fit in one container? Choose an even number between 5 and 10: ");
		 int containerCapacity = Integer.parseInt(sc.nextLine());

		 int noOfFullContainers = amountOfBricks/containerCapacity;
		 int noOfTotalContainers;

		 int noOfBlocksInNotFullContainers = amountOfBricks%containerCapacity;

		 if(noOfBlocksInNotFullContainers!=0){
			 noOfTotalContainers = noOfFullContainers + 1;
		 }else{
			 noOfTotalContainers = noOfFullContainers;
		 }
		    
		 System.out.println("No of full containers we have: "+noOfFullContainers);
		 System.out.println("No of total containers we have: "+noOfTotalContainers);
		 System.out.println("No of blocks in the container that is not completely full: "+noOfBlocksInNotFullContainers);
		        

	}

}
