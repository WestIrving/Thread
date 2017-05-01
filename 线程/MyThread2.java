package 线程;

public class MyThread2 implements Runnable{

	
	//重写run（）；
	public void run() {
		
		try {			
			for(int i=0;i<5;i++){
				Thread.sleep(1000);
				System.out.println("Runnable--------"+i);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	

}
