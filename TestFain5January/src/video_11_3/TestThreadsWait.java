package video_11_3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import video_11_3.MarketNews3;
import video_11_3.Portfolio3;

public class TestThreadsWait {
	
public static void main(String [] args) {
		
		MarketNews3 mn3 = new MarketNews3("MarketNews3");
		mn3.start();
		
		Portfolio3 p3 = new Portfolio3("Porfolio3");
		p3.start();
		
		System.out.println("The main method of TestThreads3 ");
		
//  Новая синхронизация
		ReentrantLock theLock = new ReentrantLock();
		final Condition notDone = theLock.newCondition();
		
		theLock.lock();
		
		try {
			System.out.println("Starting to wait ...");
			notDone.await(3, TimeUnit.SECONDS);
			
		}catch(InterruptedException e) {
			System.out.println("The main thread is interrupted");
		}
		
		
		theLock.unlock();
		
		
		
		
		
		
		
		
//      Синхронизация №1		
//		Object theLockKeeper = new Object();
//		
//		synchronized(theLockKeeper) {
//		
//		try {
//			System.out.println("Starting to wait ...");
//			
//			theLockKeeper.wait(20000);
//			
//			
//			
//		}catch(InterruptedException e) {
//			System.out.println("The main thread is interrupted!!!");
//		}
//		}
//		
	}
	

	
}
