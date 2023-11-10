
public class Main {

	public static void main(String[] args) {
		
		 Car c1 = new Car("Model S","Tesla",2021,94990,"White",5);
	    String result = c1.toString();
	    System.out.println(result);

		c1.sell();
	    System.out.println("\n1 car is sold.\n");

	    System.out.println(c1.getModel());
	    System.out.println(c1.getBrand());
	    System.out.println(c1.getYear());
	    System.out.println(c1.getPrice());
	    System.out.println(c1.getColor());
	    System.out.println(c1.getQuantity());

	    c1.setYear(2022);
	    c1.setPrice(110000);
	    c1.setColor("Black");
	    c1.setQuantity(10);

	    System.out.println("\nUpdated some values for the car.\n");

	    result = c1.toString();
	    System.out.println(result);

	}

}
