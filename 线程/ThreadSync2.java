package 线程;

public class ThreadSync2 extends Thread{
	
	private MySync ms;	
	
	public ThreadSync2(MySync ms,String name){
		this.ms = ms;
		this.setName(name);
	}
	
	@Override
	public void run() {
		ms.m2();
	}
	
}