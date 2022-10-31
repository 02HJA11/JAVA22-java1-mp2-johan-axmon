package finaltwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The customer variable gets a name cause why not and bought items is set to 0 by default.
		Customer a = new Customer("Steve", 0, 0);
		//Product names come first then price and then total amount left, the total amount is subtracted in the buy.
		Product Chips = new Product("Tortilla chips, lightly salted", 15, 10);
		Product Soda = new Product("Monster energy, khaotic", 17, 7);
		//Discount is what I call the discounted product, the first is the discount option and all the math to round out the actual price is done in the java file for it to report back the correct price.
		Discount Dip = new Discount(1.10, "Cheese dip", 25, 5);
		boolean done = false;
		Scanner sc = new Scanner(System.in);
//		int option = sc.nextInt();
		
		while(done == false) {
		
			
			System.out.println("1. " + Chips.productName + " " + Chips.price + "kr " + Chips.amountTotal + " left");
			System.out.println("2. " + Soda.productName + " " + Soda.price + "kr " + Soda.amountTotal + " left");
			System.out.println("3. " + Dip.productName + " " + "was 25kr, is now " + Dip.newPrice + "kr " + Dip.amountTotal + " left");
			System.out.println("4. Checkout");
			System.out.println("Select:");
			int option = sc.nextInt();
			//I was planning to make the if cases in the buy variable so this would look less janky but I have no way of calling the class to check in the customer one so the if statements happen out here. 
			switch(option) {
			case 1:
				if(Chips.amountTotal > 0) {
				Chips.buy();
				a.buy(Chips.price);
				}else {
					System.out.println("Sorry we are out of stock on the current item.");
				}
				break;
			case 2:
				if(Soda.amountTotal > 0) {
				Soda.buy();
				a.buy(Soda.price);
				}else {
					System.out.println("Sorry we are out of stock on the current item.");
				}
				break;
			case 3:
				if(Dip.amountTotal > 0) {
				Dip.buy();
				a.buy(Dip.newPrice);
				}else {
					System.out.println("Sorry we are out of stock on the current item.");
				}
				break;
			case 4:
				done = true;
//				a.finished(Chips.totalPrice, Dip.totalPrice, Soda.totalPrice);
				System.out.println("You bought " + a.amountBought + " " + "for a total of " + a.totalSpent + "kr");
				sc.close();
			}
		}
	}

}
