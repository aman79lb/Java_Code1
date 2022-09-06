class A {
	int i = 10;
}
class B extends A {
	int i = 20;
	void show(int i) {
		System.out.println(i);  // aapdu normal print karvase
		System.out.println(this.i);  // refers to current class
		System.out.println(super.i); // refers to parent class , means parent chiled inheritence no concept hovo joiye
		  
		  
	}
	public static void main(String args[]) {
		B ob = new B();
		ob.show(30);
	}
}