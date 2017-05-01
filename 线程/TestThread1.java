package 线程;

public class TestThread1 {
	
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread("");
		
		//启动线程
		mt.start();
		
		MyThread2 m2 = new MyThread2();
		
		Thread t = new Thread(m2);
		t.start();
		
		
		for(int i = 0;i<5;i++){
			System.out.println("main------"+i);
		}
		
		
		
		
	}
	
	
	
}
