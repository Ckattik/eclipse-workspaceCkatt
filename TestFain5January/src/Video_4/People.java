package Video_4;

abstract public class People {
	
	private String name;
	
	public People(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "People name is " + name;
	}
	
	
	

	abstract public void go();

	
	
}