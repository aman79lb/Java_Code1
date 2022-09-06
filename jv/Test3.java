public class Test3 {

	int i = 19;
	static int j = 34;
	// static keyword is used for memeory management
	static void show() { // static method can be called by classname object without vreating new object
		System.out.println("2");
		//can only access static class indied data 
		//// only static mehtod j call thay non static method call nathay
	    display(); // call nahi thay cause static mehtod stai mehod j call karit sakese
	}
	void display() {
		System.out.println("1");
		System.out.println(i); // aa compilation error aapse
		System.out.println(j);  // allowed cause ae static data 6e 
		  
		  
	}
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.display();
		Test3.show();
		show(); // also can be used directly , class no object banovano need nathi
		Xyz.showOn(); // static mehtod class mate hoy object mate nahi ba
		//class bahar ni method call karava tyani calss nu mane rakhvanu
	}
}
class Xyz {
	static void showOn() {
		System.out.println("3");
	}
}
/*
 1. "static" methods belogns to the class, not to the object.
 2. A "static" method can be accessed directly by class name and does'nt need any object
 3. A "static" method can access only static data. It cannot access not-static data(instance data).
 4. A "static" method can call only other static methods and cannot call non-static method.
 5. A "static" method cannot refer to "this" or "super" keyword in anyway.
     5'the point is important
 */