

class MyThread1 extends Thread {  // public  class doenst working 
	@Override
	public void run() {
		System.out.println("Thread task here !");
	}
}
 public class Case55 {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
	}
}
	