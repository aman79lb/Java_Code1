//learning mulittrheading
//case2
//performing single tsk from multiple theads
public class Multtiple extends Thread {
	
		@Override
		public void run()
		{
			System.out.println("Thread task here !");
			  
		}

	public static void main(String[] args){
		
		Multtiple t=new Multtiple();
		t.start();
		Multtiple t2=new Multtiple();
		t2.start();
	}	
}

//which thread first will happen dont know
//depends upon the jvm and thread shedular