package 线程;

public  class TestThread {
	
	public static  void main(String[] args) {
		
		MyThread mt=new MyThread("a");
		
		//启动线程


		StopThread st=new StopThread();
		st.start();

		
		/*MyThread2 mt2=new MyThread2();      //Thread 类里有 .start();
		                                    //               | 有
		                                    //               ▼
		Thread t=new Thread(mt2);           //            .run();
		t.start();*/
		
		
		
		
	}
		
		
		


} 
