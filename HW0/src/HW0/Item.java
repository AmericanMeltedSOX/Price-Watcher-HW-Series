package HW0;

public class Item {
	private String name;
	private double price;
	private double percentage;
	private String date;
	
	// CONSTRUCTORS
	public Item() {
		this.name = "";
		this.price = 0;
		this.percentage = 0;
		this.date = "";
	}
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price  = price;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public double getPercentage() {
		return this.percentage;
	}
	public String getDate() {
		return this.date;
	}
	

}
