package video_11;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarketNews mn = new MarketNews("Market News");
		mn.start();
		
		
		
		Portfolio pt = new Portfolio("Porfolio");
		pt.start();
		
		System.out.println("TestThread is finish");
	}

}
