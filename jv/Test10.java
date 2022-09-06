//learning about multithreading
import java.lang.*;
//1. extends the thread class
public class Test10 extends Thread 
 {
      //2. override the run method
	public void run(){

      // thread task
       System.out.println("thread task");
         
	}
	
	

	public static void main(String[] args){
		//3. create object of the class
		Test10 t= new Test10();
		t.start();// 4. start() will invoke the run mehtod and perform task6 
	}	
}