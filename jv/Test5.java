//static block in java
//static block executes automatically when class loaded in the memory
class Test5 {
	static {
		// before 1.6 version without main method i can print this without main method
		System.out.println("Hello");
	}
	// here before main method static block will get executed
	// whether it is writeen bellow o up
	public static void main(String args[]) {
	}
}