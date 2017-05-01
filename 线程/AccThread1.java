package 线程;

public class AccThread1 extends Thread{
private Account acc ;
	
	public AccThread1(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		acc.GetMoney(this.getName());
	}	
}
	
	

