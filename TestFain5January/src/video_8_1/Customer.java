package video_8_1;

public class Customer extends Data{
	
	private String fName;
	private String lName;
	
	public Customer(String fName, String lName) {
		
		this.fName = fName;
		this.lName = lName;
		
	}
	
	
	

	@Override
	void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Customer " + fName + " " + lName + " I am doSomething");
	}

}
