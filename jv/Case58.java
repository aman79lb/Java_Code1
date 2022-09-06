//single task single thread
//but outside the class for the projects

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 man");
	}
}
public class Case58 {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();
	}
}