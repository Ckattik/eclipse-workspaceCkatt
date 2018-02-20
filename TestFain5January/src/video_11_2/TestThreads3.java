package video_11_2;

public class TestThreads3 {
	
	public static void main(String [] args) {
		
		MarketNews3 mn3 = new MarketNews3("MarketNews3");
		mn3.start();
		
		Portfolio3 p3 = new Portfolio3("Porfolio3");
		p3.start();
		
		System.out.println("The main method of TestThreads3 ");
		
	}
	
	

}
