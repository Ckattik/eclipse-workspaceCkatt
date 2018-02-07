package video_8;

public class Order {
	
	private int id;
	private double price;
	private String company;
	
	
	public Order(int id, double price, String company) {
		
		this.id = id;
		this.price = price;
		this.company = company;
		
	}
	
	
	public int getId() {
		
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	

	public double getPrice() {
		
		return this.price;
	}
	
	public void setPrice(double price) {
		
		this.price = price;
		
	}
	
	public String getCompany() {
		
		return this.company; 
	}
	
	
	public void setCompany(String company) {
		
		this.company = company;
	}
	
	public String toString() {
		
		return this.id + " " + this.price + " " + this.company;
		
	}
	
}
