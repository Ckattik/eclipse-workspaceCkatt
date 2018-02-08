package video_8;

import java.util.Hashtable;
import java.util.Iterator;

public class TestHashTable {
	public static void main(String [] args) {
		
		Customer cust = new Customer("David", "Lee");
		Order ord = new Order(123, 500, "IBM");
		Portfolio port = new Portfolio(123);
		
		
		
		Hashtable data = new Hashtable();
		
		data.put("Customer",cust);
		data.put("Order", ord);
		data.put("Portfolio", port);
		
		Order myOrder = (Order)data.get("Order");
		Customer myCast = (Customer)data.get("Customer");
		Portfolio myPort = (Portfolio)data.get("Portfolio");
		
		
		System.out.println(data);
		System.out.println(myOrder);
		System.out.println(myCast);
		System.out.println(myPort);
		
//		for(String elem : data.keySet()) {
//			
//			System.out.println(elem);
//		}
		
	}

}
