package 线程;

public class MyThread extends Thread{
	
	
	public MyThread(String name){
		this.setName(name);  //Mythread无SetName();调Thread的
	}

	@Override  //重载run（）；
	public void run() {
		while(!this.isInterrupted()){
			for (int i = 0; i < 5; i++) {
				
				try {
					Thread.sleep(1000);
					System.out.println(this.getName()+"--------"+i);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
		}
		
	}
	
	
	
	
	
}
