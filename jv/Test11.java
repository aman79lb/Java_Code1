import java.lang.*;
//1. implements the runable interface
class Test11 implements Runnable {
	public void run() {
		System.out.println("thread task");
	}
	public static void main(String args[]) {
		//3. create an object of (test) the class
		Test11 t = new Test11();
		Thread th = new Thread(t); //4.1 create of an object of thread class and pass the paramaeter of constructor of thread class
		th.start();  //5. start the thread or invoke the method
	}
}
/* why 4.1 step
because runnable interface ma run mehtod na hoy
to thread call through call thayou aen mate test no refrence aapsu
which is better thread class or runnable
better way is by runnable interface
big projects ma most classes inherits or extends
multiple extensds no possible but extends and implement is allwoed
programming is easy and performance is better