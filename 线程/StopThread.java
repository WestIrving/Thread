package 线程;

public class StopThread extends Thread{
	
	public static boolean b=true;

	@Override
	public void run() {
		
		while(!this.isInterrupted()){ //线程若进行 ，进入while
			
			try {
				Thread.sleep(1000);
				System.out.println("-------------------");

			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
	}
}
