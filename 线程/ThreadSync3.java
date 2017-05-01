package 线程;

public class ThreadSync3 extends Thread{
		
		private MySync ms;	
		
		public ThreadSync3(MySync ms,String name){
			this.ms = ms;
			this.setName(name);
		}
		
		@Override
		public void run() {
			ms.m3();
		}
		
	}
