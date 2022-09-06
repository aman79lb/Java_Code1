// a stati mehtod cannot refer to "this or "super" keyword in anyway
// but a simple method a instance method can use this,super word and
//  accesse instace variable
class StaticDemo1 {
	int i = 10;
	void display() {
		System.out.println(this.i);
	}
	/*
	public static void main(String args[])
	{
	   StaticDemo1 t = new StaticDemo1();
	   t.display();
	}
	*/
}