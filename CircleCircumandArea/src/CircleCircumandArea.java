import java.util.Scanner;

public class CircleCircumandArea {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input the radius of the circle: ");
		 double radius = Float.parseFloat(sc.nextLine());

		 double c = 2 * Math.PI * radius;
		 double area = Math.PI * radius * radius;
		    
		 System.out.println("The circumference of the circle is: "+c);
		 System.out.println("The area of the circle is: "+area);   

	}

}
