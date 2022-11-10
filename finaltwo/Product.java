package finaltwo;

class Product {
		double price;
		int amountTotal;
		double totalPrice;
		String productName;
		Product(String productName, double price, int amountTotal) {
			this.productName = productName;
			this.price = price;
			this.amountTotal = amountTotal;
		}
		
		void buy(){
//			if(amountTotal > 0) {
				amountTotal--;
				
//			}else {
//				System.out.println("Sorry we don't have any more of that in stock");
//			}
			
			
		}
}
