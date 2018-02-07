package video_8;

import java.util.Hashtable;
import java.util.Iterator;

public class TestHashTable {
	public static void main() {
		
		Customer cust = new Customer("David", "Lee");
		Order ord = new Order(123, 500, "IBM");
		Portfolio port = new Portfolio(123);
		
		
		
		Hashtable data = new Hashtable();
		
		data.put("Customer",cust);
		data.put("Order", ord);
		data.put("Portfolio", port);
		
		Order myOrder = (Order)data.get("Order");
		
		System.out.println(data);
		System.out.println(myOrder);
		
//		for(String elem : data.keySet()) {
//			
//			System.out.println(elem);
//		}
		
	}

}
