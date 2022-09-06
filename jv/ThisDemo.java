// this keyword can be used to invoke current class method (implicityly)
// 
 class ThisDemo {
	
	int i;
	/*
	void setValue(int i)
	{
		this.i=i;

	} */
	void display()
	{
		System.out.println("hello");
		  
	}
	void show()
	{
		//System.out.println(i);
		  display();
	}

	public static void main(String[] args){
		
		ThisDemo td = new ThisDemo();
	//	td.setValue(100);
	    td.show();
		
     

	}	
}