//learning multithreading
//lecture diffrent casesx
//multiple task using multiple thread  
  class MyThread1 extends Thread
  {
  	public void run()
  	{
  		System.out.println("task1");
  		  
  	}
  }

  class MyThread2 extends Thread
  {
	
	public void run()
	{
		System.out.println("task2");
		  
	}

  }

public class Multiple2 {
	
	

	public static void main(String[] args){
		MyThread1 t1= new MyThread1();
		t1.start();
		MyThread2 t2= new MyThread2();
		t2.start();
	}	
}
