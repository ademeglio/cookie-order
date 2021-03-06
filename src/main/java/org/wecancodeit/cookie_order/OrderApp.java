package org.wecancodeit.cookie_order;

import java.util.Scanner;

public class OrderApp {
	
	public static void main(String[] args) {
		
		boolean isOrderComplete = false;
		String yesNo = "";
		String variety = "";
		
		Scanner userInput = new Scanner(System.in);
		MasterOrder userOrder = new MasterOrder();
		
// Add order(s) of cookies.
		while (isOrderComplete == false) {
			System.out.println("Please select one variety of cookie to purchase:");
			variety = varietyMenu(userInput); // displays menu of available variety and asks for selection.
			
			System.out.println("How many boxes of " + variety + " would you like to buy?");
			int numBoxes = userInput.nextInt(); // enter quantity desired of selected variety
			
			userOrder.addOrder(new CookieOrder(variety, numBoxes)); // create new Cookie Order
			System.out.println("There are [" + userOrder.getTotalBoxes() + "] box[es] in your cart.\n"); // Total boxes in the cart
			userInput.nextLine();
			
			// continue the loop?
			System.out.println("Would you like to buy more? Type y or n");
			yesNo = userInput.nextLine(); // shops the scanner which doesn't close because .nextInt()
			
			if (yesNo.equals("n") || yesNo.equals("no")) {
				isOrderComplete = true;
				break;
			} 
		}
	
// Show the list
		System.out.println("Your shopping cart currently has:\n ");
		userOrder.showOrder();
		
//	Remove a variety and give feedback on how many boxes were removed
		System.out.println("\nWould you like to remove any selections from your car? Type y or n");
		yesNo = userInput.next();
		if (yesNo.toLowerCase().equals("y") || yesNo.toLowerCase().equals("yes")) {
			System.out.println("Please select the variety to remove...");
			variety = varietyMenu(userInput);
			userOrder.removeVariety(variety);
		}
//		Show the updated list
		System.out.println("Your final cart contents are: ");
		userOrder.showOrder();
	}
	
	public static String varietyMenu(Scanner userInput) {
		while (true) {
			
			System.out.println("1. Tagalongs     3. Thin Mints     5. S'mores    7. EXIT"
						   + "\n2. Samoas        4. Shortbread     6. CANCEL");
			
			int choice = userInput.nextInt();
			switch (choice) {
			case 1:
				return "Tagalongs";
			case 2: 
				return "Samoas";
			case 3:
				return "Thin Mints";
			case 4:
				return "Shortbreak";
			case 5:
				return "S'mores";
			case 6: //cancel
				return null;
			case 7:
				System.exit(0);
			default:
				System.out.println("Please make a valid selection");	
			}
		}
	} // end varietyMenu()
}
