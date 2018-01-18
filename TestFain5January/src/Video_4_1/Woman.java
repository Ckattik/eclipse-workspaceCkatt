package Video_4_1;

public class Woman implements Sexeble {
	
	private String name;
	
	public Woman(String name) {
		this.name = name;
	}
	

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("I am a Woman");
	}

}
