package HW0;

import java.util.Scanner;

public class ConsoleUI {
	private Item item = new Item();
	
	private String name = "";

	public void showWelcome() {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Price Watcher!");
		// System.out.println("Whats is your name?");
		// this.name = scnr.next();
		
	}

	public void showItem() {
		// TODO Auto-generated method stub
		System.out.print("Here are the product details: ");
		System.out.print("Name: "+item.getName()
					+"\nPrice: "+item.getPrice()
					+"\nChange: "+item.getPercentage()+"%"
					+"\nAdded: "+item.getDate());
		
	}

	public int promptUser() {
		// TODO Auto-generated method stub
		return -1;
	}

}
