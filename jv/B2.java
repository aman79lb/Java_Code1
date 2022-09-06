/*
1."super" keyword can be used to refer immediate parent class instance variable. B.java valo program
2."super" keyword can be used to invoke immediate parent class method.
3. " super() " can be used to invoke immediate parent class constructor.
*/
// seond use
class A {
	void m1() {
		System.out.println("i m in class A");
	}
}
class B2 extends A {
	void m1() {
		System.out.println("i m in class B");
	}
	void show() {
		m1(); //same name different class here current class directley
		super.m1(); // super keybower this patent class na method ne call kari dighr ambiguity erroe na aabe
	}
	public static void main(String args[]) {
		B2 ob = new B2();
		ob.show();
	}
}
