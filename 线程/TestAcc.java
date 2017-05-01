package 线程;

public class TestAcc {
	
	public static void main(String[] args) {
		
		Account acc1=new Account(); //  公有资源Account
		
		AccThread1 at1=new AccThread1(acc1);
		                                    //at1 at2 线程共同利用Account
	    AccThread1 at2=new  AccThread1(acc1);
		
		at1.start();
		
		at2.start();
		
	}

}
