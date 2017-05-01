package 线程;


public class TestThread2 {
	
	public static void main(String[] args) {
		
		MyThread m1 = new MyThread("MY1");
		MyThread m2 = new MyThread("MY2");  
		
		
		m1.start();       //2个线程  各自运行
		m2.start();
		
		
		
		
	}
	
	
	
}

