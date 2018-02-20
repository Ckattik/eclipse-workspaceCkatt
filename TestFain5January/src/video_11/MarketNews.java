package video_11;

public class MarketNews extends Thread {

	 public  MarketNews(String threadName) {
                  super(threadName); // name your thread
		 
		
		       }
		
	 public void run() {
		 System.out.println("The stok market is improving");
	 }
	

}
