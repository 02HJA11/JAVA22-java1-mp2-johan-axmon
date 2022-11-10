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
		
}
