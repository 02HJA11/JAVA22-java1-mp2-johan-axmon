package finaltwo;

class Customer {
		String name;
		int amountBought;
		Customer(String name, int amountBought){
			this.name = name;
			this.amountBought = amountBought;
		}
		
		void buy() {
			amountBought++;
		}
}
