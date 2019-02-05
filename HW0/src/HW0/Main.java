package HW0;

import java.awt.Desktop;
import java.net.URI;

public class Main {
	
	public void run() {
		Item item = new Item();
		PriceFinder.priceFinder(item);
		ConsoleUI ui  = new ConsoleUI(item);
		ui.showWelcome();
		
		/*
		 * Repeat
		 * Print item
		 * Prompt the user
		 * process
		 */
		
		int request = -1;
		do {
			// ui.showItem();
			request = ui.promptUser();
			switch (request) {
			case 1: //Displays item information
				ui.showItem();
				break;
			case 2: //Opens URL link
				try {
					Desktop desktop = java.awt.Desktop.getDesktop();
					URI url = new URI(item.getURL());
					desktop.browse(url);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			}
			
		}while(request != -1);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
