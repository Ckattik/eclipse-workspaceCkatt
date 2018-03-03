package video_13_1;

public class Order {

	public int orderID;
	public String stockSymbol;
	public int quantity;
	public float price;
	
	
	public Order(int orderID, String stockSymbol, int quantity, float price) {
		this.orderID = orderID;
		this.stockSymbol = stockSymbol;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	
}
