public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread task here !");
	}
}
public class Case1-1 {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
	}
}