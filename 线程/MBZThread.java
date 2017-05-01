package 线程;

public class MBZThread extends Thread{
	
	private BZP bzp;
	
	public MBZThread(BZP bzp,String name) {
		this.bzp = bzp;
		this.setName(name);
		this.start();
	}
	
	@Override
	public void run() {
		while(true){
			bzp.mbz();
		}
		
	}
	
}	
