//this can be used in the future

public class Testt extends Xyz implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("thead task 2");
		  
	}

	public void run2()
	{
		super.run();

	}

	

	public static void main(String[] args){
		Testt t= new Testt();
		Thread th= new Thread(t);
		th.start();
		t.run2();


		


	}	
}

class Xyz{
	 void run()
	{
		System.out.println("task 3");
		  
	}
}