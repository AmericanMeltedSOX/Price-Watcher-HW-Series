package HW0;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConsoleUI {
	Scanner scnr = new Scanner(System.in);
	DecimalFormat decim = new DecimalFormat("0.00");
	private Item item;
	
	public ConsoleUI(Item item) {
		this.item = item;
	}

	public void showWelcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Price Watcher!");
		
	}

	public void showItem() {
		// TODO Auto-generated method stub
		System.out.println("Here are the product details: ");
		System.out.println("\nName: "+item.getName()
					+"\nURL: "+item.getURL()
					+"\nPrice: $"+item.getPrice()
					+"\nChange: "+ decim.format(item.getPercentage()) + "%"
					+"\nAdded: "+item.getDate());
		
	}

	public int promptUser() {
		// TODO Auto-generated method stub
		int prompt;
		System.out.println("\nEnter 1 TO CHECK PRICE. "
				+ "(NOT WORING)Press 2 TO VIEW PAGE. "
				+ "Type -1 to EXIT.");
		prompt = scnr.nextInt();
		if(prompt > 0) {
			return prompt;
		}
		System.out.println("Exited.");
		return -1;
	}

}
