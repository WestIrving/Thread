package 线程;

public  class TestSync {

	public static void main(String[] args) {
		
		MySync ms=new MySync();
		
		ThreadSync1 ts1_1=new ThreadSync1(ms, "线程1-1");
		ThreadSync1 ts1_2=new ThreadSync1(ms, "线程1-2");
		
	    
		ThreadSync2 ts2_1=new ThreadSync2(ms,"线程2-1");
		
		ThreadSync3 ts3_1=new ThreadSync3(ms, "线程3_1");
		ts1_1.start();

		

		ts2_1.start();
		
		ts3_1.start();
		
	}
	
	
	
}
