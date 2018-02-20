package video_11_1;

public class TestThreads2 {

	public static void main(String []args) {

		MarketNews2 mn2 = new MarketNews2();
	    Thread t = new Thread(mn2, "Market News");
	
	    t.start();
	
	
	
	Runnable p2 = new Portfolio2();
	Thread t1 = new Thread(p2, "Portfolio");
	
	t1.start();
	
	System.out.println("TestThreads2 is finished");
	
}
}