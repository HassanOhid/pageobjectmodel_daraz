package model;

public class TimeOut {

	public   void timeout() {
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			 e.printStackTrace();
		}
		
	}
	
}
