package video_8_3;

public class TimeToShip {
	
	public static void main(String [] args) {
	
	Box<Nokia> boxOfPhones = new Box<>();
	
	Box<Blackberry> boxOfPhones2 = new Box<>();
	
	
	ShippingOrder <String, Box <Nokia>> so1  = new ShippingOrder<>("ph1234", boxOfPhones);
	
	ShippingOrder <String, Box <Blackberry>> so2 = new ShippingOrder<>("ph4321", boxOfPhones2);
	
	System.out.println(so1.getK());
	System.out.println(so2.getK());
	
	}
}
