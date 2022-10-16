package finaltwo;

class Product {
		int price;
		int amountTotal;
		int totalPrice;
		String productName;
		Product(String productName, int price, int amountTotal) {
			this.productName = productName;
			this.price = price;
			this.amountTotal = amountTotal;
		}
		
		void buy(){
//			if(amountTotal > 0) {
				amountTotal--;
				totalPrice = totalPrice + price;
//			}else {
//				System.out.println("Sorry we don't have any more of that in stock");
//			}
			
			
		}
}
