interface I1 {
	public static final int a = 10;//automatic variable is public static final
	void show();  // this one is public static type
	//public abstract void show();  is also validate
	//// protect abstract void show(); or default abstract void show(); not allowed
	static void display() // default mehtod is also allowed and static method too otherwise dont create body of method
	 {

	}
}

interface I2
{
	void display();
}
class Test implements I1 , I2
    {
	public void show() {
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
		  
	}
	public static void main(String args[]) {
		//I1 i=new I1(); cannot create object of inteface same as abstract class
		Test t = new Test();
		t.show();
		t.display();
	}
    }


