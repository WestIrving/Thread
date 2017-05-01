package 线程;

public class ThreadSync1 extends Thread{

	private MySync ms;

	public ThreadSync1(MySync ms,String name){
		this.ms=ms;
		this.setName(name);
	}

	@Override
	public void run() {
		ms.m1();
	}
	
	
	
	
	
}
