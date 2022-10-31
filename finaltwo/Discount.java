package finaltwo;

class Discount extends Product{
		 
		 
		Discount(String productName, double price, int amountTotal){
			super(productName, price, amountTotal);
			
			
		}
	void discounted(double discount){
			price = price / discount
	}
		
		
		void buy() {
//			newPrice = price / discount;
				amountTotal--;
				
			
			
		}
				
}
