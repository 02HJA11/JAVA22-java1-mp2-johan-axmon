package finaltwo;

class Product {
		int price;
		int amountTotal;
		double totalPrice;
		String productName;
		Product(String productName, int price, int amountTotal) {
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
