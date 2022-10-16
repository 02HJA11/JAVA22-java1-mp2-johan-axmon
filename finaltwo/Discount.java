package finaltwo;

class Discount extends Product{
		 private double discount = 1.50;
		 
		Discount(double discount, String productName, int price, int amountTotal){
			super(productName, price, amountTotal);
			this.discount = discount;
			
		}
			double newPrice = price / discount;
			int newPriceFinal = (int) Math.round(newPrice);
		
		
		void buy() {
//			newPrice = price / discount;
				amountTotal--;
				totalPrice = totalPrice + newPriceFinal;
			
			
		}
				
}
