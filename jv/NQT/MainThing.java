/*
You are using Java. In Java,
 there are only classes; nothing exists outside a class.
If you have code that you want to share and for which
you don't want to instantiate a class,
 use a static public method. Here is an example:
 */
 class KapowThing {  // here using final word access modifier makes better execution speed

	public static void kapow() {
		System.out.println("kapow");
	}
}
public class MainThing { // without public word it will work
	public static void main(final String[] arguments) {
		KapowThing.kapow();
	}
}