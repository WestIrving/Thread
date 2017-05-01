package 线程;

public class ZBZThread extends Thread{
	
	private BZP bzp;
	
	public ZBZThread(BZP bzp,String name) {
		this.bzp = bzp;
		this.setName(name);
		this.start();
	}
	
	@Override
	public void run() {
		while(true){
			
			bzp.zbz();
		}
	}
	
}
