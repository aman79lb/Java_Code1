
public class Test4 {
	
	void display()
	{
		System.out.println("1");
		  
	}

	static void display1()
	{
		System.out.println("from the static method class no object no need to creat directly call");
		  
	}

	public static void main(String[] args){
		
		Test4 t = new Test4();

		t.display();
		//display(); will not work , refrence static cannot display
		
		display1();
	}	
}

class Xyz
{
	static void show()
	{
		System.out.println("2");
		  
	}
}