// use 3 super() can be used ot invoke imeediate patent class constructor
//
class A {
	A() {
		System.out.println("i m in claa A");
	}
}
public class B3 extends A {
	B3() {
		//super(); // same j input aavse
		System.out.println("i m in class B");
	}
	public static void main(String[] args) {
		B3 ob = new B3();
		// without super keybwrod us first A and then B no constructot call thayi jse
	}
}

// super keyword and super( ) this one is used to ivoke immediate parent class construcotor 