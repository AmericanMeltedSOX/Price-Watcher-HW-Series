package HW0;

public class Main {
	
	public void run() {
		Item item = new Item();
		ConsoleUI ui  = new ConsoleUI();
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
			case 1: //...
				break;
			case 2: //   
				break;
			}
			
		}while(request != -1);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
