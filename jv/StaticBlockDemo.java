// static block is executed automatically when class is loaded in the memory
// multiple static block is allowed but the execution will be top to bottome
class StaticBlockDemo {
	static {
		System.out.println("hello univers first static block");
	//	System.exit(0); // for jvm shutdown
		// this will not print I am in mainn method only static block
	}
	static{
		System.out.println("bhai second static block");
		 // System.exit(0);
	}
	public static void main(String args[]) {
		System.out.println("I am in main method");
	}
	static{
		System.out.println("bhai third static block");
		 // System.exit(0);
	}
}

/*Interview question : can i execute static block withoug main mehtod
ans is , only we can do this in 1.6 before versions
after thta version we needed main method cmplausory*/ 

/*static block is executed at class loading, hence at the time of 
class loading if wwe want ot perform any activity, we have
to define that inside static block

--> used for native method
native methods are method which codes are imp
implemented in any differnt language

--> static block is used to intilize the stativ members
  stativ variable no code stativ block ni aandar lakhavano