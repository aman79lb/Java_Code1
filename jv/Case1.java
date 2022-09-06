//learning multithrding
//1. performing single task from single thread
//main mehtod pan ek ma and run pan anndar

public class Case1 extends Thread {
		@Override
		public void run()
		{
			System.out.println("Task1");
			  
		}

		     public static void main(String args[])
		     {
		         Case1 thread1=new Case1();
		         thread1.start();
		  
		     }
		  
		
}