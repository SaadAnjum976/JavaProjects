import java.util.Scanner;

public class RectangleArea {

	public double length, width, area;

	  public void getData(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the length of the rectangle: ");
	    length = sc.nextDouble();
	    System.out.println("Enter the width of the rectangle: ");
	    width = sc.nextDouble();
	  }
	  public void computeField(){
	    area = length * width;
	  }
	  public void fieldDisplay(){
	    System.out.println("The area of the rectangle is: "+area);
	  }

}
