package finaltwo;



class Discount extends Product{
		 ;
		 
		Discount(String productName, double price, int amountTotal){
			super(productName, price, amountTotal);
			
			
		}
			
			
		
			 void applyDiscount(double discount) {
				
			
				price = price - (price * discount);
			}
		
		
		void buy() {
//			newPrice = price / discount;
				amountTotal--;
				
			
			
		}
				
}
