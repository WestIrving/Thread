package 线程;

public class  MySync {
	
	public synchronized void m1(){
		
		
		try {
			String name=Thread.currentThread().getName();//当前线程名字
			System.out.println("现在执行m1方法的线程是:"+name);
			Thread.sleep(5000);
			System.out.println("m1方法调用结束，线程是:"+name);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
		public void m2(){
			
			
			try {
				String name=Thread.currentThread().getName();//当前线程名字
				System.out.println("现在执行m2方法的线程是:"+name);
				Thread.sleep(5000);
				System.out.println("m2方法调用结束，线程是:"+name);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			
			public void m3(){
				
				
				try {
					String name=Thread.currentThread().getName();//当前线程名字
					System.out.println("现在执行m3方法的线程是:"+name);
					Thread.sleep(5000);
					System.out.println("m3方法调用结束，线程是:"+name);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	}
			
}
