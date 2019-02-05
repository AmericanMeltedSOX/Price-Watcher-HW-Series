package HW0;

public class PriceFinder {
	
	public static void priceFinder(Item item) {
		String url = "https://www.amazon.com/OnePlus-5T-A5010-Version-Midnight/dp/B077TFS54V";
		double launchPrice = 499.99;
		double price = 349.99;
		double percentage = ((launchPrice - price) / launchPrice * 100); // Calculates percentage
		
		item.setName("OnePlus 5T - 6GB RAM + 64GB - 6.01 inch");
		item.setURL(url);
		item.setPrice(price);
		item.setPercentage(percentage);
		item.setDate("November 29, 2017");
		
		
	}

}
