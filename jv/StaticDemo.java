 class StaticDemo {
	//static method can call static method only and get static data only
	//to run jst vreate main method and call them
	static void display(){

		show();
		System.out.println("1");
		  
	}
	static void show()
	{
		System.out.println("2");
		  
	}    // a stati mehtod cannot refer to "this or "super" keyword in anyway
	     // but a simple method a instance method can use this,super word and accesse instace variable 
         /*  // even without method it can be compiled easily 
	     public static void main(String args[])
	     {
	     	display();
	        show();

	
	     }
	  */
	
}