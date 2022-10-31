package finaltwo;

class Discount extends Product{
		 private double discount = 1.50;
		 
		Discount(double discount, String productName, int price, int amountTotal){
			super(productName, price, amountTotal);
			this.discount = discount;
			
		}
	void discounted(double discount){
			price = price / discount
	}
		
		
		void buy() {
//			newPrice = price / discount;
				amountTotal--;
				
			
			
		}
				
}
