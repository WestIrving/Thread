package 线程;

public class Account {
	
	
	private int money=1000;
	
	public synchronized int GetMoney(String name){
		
		System.out.println("来取钱了");
		
		try {
			if(money<1000){
				return -1;
			}
			Thread.sleep(10000);
			money-=1000;
			System.out.println(name+"现在还剩"+money);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return 1000;
	}

}
