package video_3_1;

public class TestStringImmutble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gfriend = "Masha";
		
		if(gfriend == "Masha") {
			System.out.println("true");
		}
		
		System.out.println("false");
	
		System.out.println();
	
		String gfriend1 = new String("Natasha");
		String gfriend2 = new String("Natasha");
		
		if(gfriend1 == gfriend2) {
			System.out.println("true");
		}
		System.out.println("false");
	}
	
	
	

}
