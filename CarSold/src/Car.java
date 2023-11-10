
public class Car {

	private String model, brand, color;
	  private int year, price, quantity;
	  //constructor
	  Car(String model, String brand, int year, int price, String color, int quantity){
	    this.model = model;
	    this.brand = brand;
	    this.year = year;
	    this.price = price;
	    this.color = color;
	    this.quantity = quantity;
	  }
	  //getters
	  public String getModel(){
	    return model;
	  }
	  public String getBrand(){
	    return brand;
	  }
	  public String getColor(){
	    return color;
	  }
	  public int getYear(){
	    return year;
	  }
	  public int getPrice(){
	    return price;
	  }
	  public int getQuantity(){
	    return quantity;
	  }
	  //setters
	  public void setModel(String model){
	    this.model = model;
	  }
	  public void setBrand(String brand){
	    this.brand = brand;
	  }
	  public void setColor(String color){
	    this.color = color;
	  }
	  public void setYear(int year){
	    this.year = year;
	  }
	  public void setPrice(int price){
	    this.price = price;
	  }
	  public void setQuantity(int quantity){
	    this.quantity = quantity;
	  }

	  //sell method

	  public void sell(){
	    this.quantity = this.quantity - 1;
	  }

	  // toString method
	  public String toString(){
	    String output = "Model: "+this.model+"\nBrand: "+this.brand+"\nYear: "+this.year+"\nPrice: "+this.price+"\nColor: "+this.color+"\nQuantity: "+this.quantity;
	    return output;
	  }

	  
}
