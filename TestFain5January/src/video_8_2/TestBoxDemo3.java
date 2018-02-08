package video_8_2;

public class TestBoxDemo3 {

	public static void main(String [] args) {
		
		
		Box <Integer> integerBox = new Box<>();
		
		integerBox.add(new Integer(10));
		Integer someInteger = integerBox.get(); // no cast
		
		System.out.println(someInteger);
	}
	
	
}
