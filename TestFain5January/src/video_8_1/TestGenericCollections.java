package video_8_1;

import java.util.ArrayList;

public class TestGenericCollections {

	public static void main(String [] args) {
		
		
		ArrayList  customers = new ArrayList<>();
		Customer cust1 = new Customer("David", "Lee");
		Customer cust2 = new Customer("Vitya", "Manevich");
		Customer cust3 = new Customer("Anna", "Yumi");
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		
		
		Order ord1= new Order();
		customers.add(ord1);
		
		
		processData1(customers);

        System.out.println();
		
//		processData(customers);
		
	}
	
	
	
	private static void processData1(ArrayList<? extends Data> data) {
		for (Data d: data){
			 d.doSomething();
		}
	}
	
	
	
	private static void processData(ArrayList <Customer> customers) {
		
		for(Customer c : customers) {
			c.doSomething();
			
		}
		
	}
	
	
}
