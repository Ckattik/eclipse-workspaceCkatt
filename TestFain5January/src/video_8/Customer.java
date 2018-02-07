package video_8;

public class Customer {
	
	private String lastName;
	private String firstName;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public String toString() {
		
		return this.lastName + " " + this.firstName;
	}
	
	
}
