package 线程;

public class TestBZPThread {
	
	
	public static void main(String[] args) {
		
		BZP bp=new BZP();
		
		ZBZThread z1=new ZBZThread(bp,"老板");
		
		MBZThread z2=new MBZThread(bp,"顾客1");
		
		MBZThread z3=new MBZThread(bp, "顾客2");

	}

}
