//single task thorught single 
// usinng runable interface from diffrent class outside so create object of that and call method other wise we have to static and create object of main class
//
class MyThread1 implements Runnable{  // public  class doenst working 
	@Override
	public void run() {
		System.out.println("Thread task here !");
	}
}
 public class Case56{
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		Thread th =new Thread(t);
		th.start();
	}
}
