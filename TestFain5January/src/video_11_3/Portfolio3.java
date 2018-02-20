package video_11_3;

public class Portfolio3 extends Thread {

	public Portfolio3(String nameThread) {
		super(nameThread);
		
	}
	
	public void run() {
		
		try {
		
		for(int i = 0; i < 10; i++) {
			
			sleep(700);
		
			System.out.println("You have " + (500 + i) + " shares of IBM");
		
		}
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(Thread.currentThread().getName() + e.toString());
			}
		}
	}
	

	
	

