package video_8_4;

public abstract class Person {
	
	private String name;
	
	int INCREASE_CAP = 20;
	
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "Person's name is  " + this.name;
	}
	
	
	
	public void changeAddress(String address) {
		
		System.out.println("New address is " + address);
	}
	
	private void giveDayOff() {
		
		System.out.println("Giving a day of to " + this.name);
	}
	
	
	public void promote(int percent) {
		
		System.out.println("Promouting a worker ..." + percent);
		giveDayOff();
		
		increasePay(percent);
		
	}
	
	public abstract boolean increasePay(int percent);

	
	
	
	
	

}
