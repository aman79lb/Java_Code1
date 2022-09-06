// 2. performing single task from multiple thead


public class Case59 extends Thread {
	
		@Override
		public void run()
		{
			System.out.println("Thread task here !");
			  
		}

	public static void main(String[] args){
		
		Case59 thread1 = new Case59();
		thread1.start();

		Case59 thread2 = new Case59();
		thread2.start();
	}	
}