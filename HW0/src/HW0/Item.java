package HW0;

public class Item {
	private String name;
	private String url;
	private double price;
	private double percentage;
	private String date;
	
	// CONSTRUCTORS
	public Item() {
		this.name = "";
		this.url = "";
		this.price = 0;
		this.percentage = 0;
		this.date = "";
	}
	
	public Item(String name, String url, double price, double percentage, String date) {
		this.name = name;
		this.url = url;
		this.price = price;
		this.percentage = percentage;
		this.date = date;
	}
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setURL(String url) {
		this.url = url;
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
	public String getURL() {
		return this.url;
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
