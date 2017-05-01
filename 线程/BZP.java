package 线程;

public class BZP {
	
	private int num;
	
	public synchronized void zbz(){
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+"开始蒸包子了........");
			
			if(num  > 150){
				//this.notify();
				this.notifyAll();
			}
			
			Thread.sleep(2000);
			num +=10;
			
			System.out.println(name+"蒸完包子了,现在还剩"+num+"个包子");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void mbz(){
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+"开始买包子了.......");
			while(num < 50 ){
				System.out.println(name+"包子数不够，进行等待.");
				this.wait();
				//Thread.sleep(10000);
			}
			num -=50;
			System.out.println(name+"买完包子，包子还剩"+num+"个");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}