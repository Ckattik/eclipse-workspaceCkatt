package video_11_3;

public class MarketNews3 extends Thread {

	public MarketNews3(String nameThread) {
		
		super(nameThread);
		}
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			try {
				sleep(1000); // for 1 seconds
				System.out.println("The market is improving " + i);
				System.out.println();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			System.out.println(Thread.currentThread().getName() + e.toString());
			} 
		}
		
	}
	
	
}
