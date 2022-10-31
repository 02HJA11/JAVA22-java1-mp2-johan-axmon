package finaltwo;

class Customer {
		String name;
		int amountBought;
		double totalSpent;
		Customer(String name, int amountBought, double totalSpent){
			this.name = name;
			this.amountBought = amountBought;
			this.totalSpent = totalSpent;
		}
		
		void buy(double price) {
			amountBought++;
			totalSpent += price;
			}
		
//		void finished(double x, double y, double z) {
//			double p = x + y + z;
//			System.out.println("You bought " + amountBought + " items and your total is: " + p + "kr");
//		}
}
