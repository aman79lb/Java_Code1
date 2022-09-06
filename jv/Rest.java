// Learning about the interfaces
interface I1 {
	void show();// public abstract void show(); compiler will automatically put public abstract
	/*   // default and static conctreat method now allowed after jdk8
	default void display()
	{   }
	static void display2()
	{   }
	default int display3()
	{
	return 0;
	}*/
	int a = 10; // public static final int a=10;
}
/* interface have public abstract mehtod and fields
    interface us uded thourgh implements keyword
   the variables created were always
   public static final
    */
class Rest implements I1 {
	public void show() {
		System.out.println("1");
	}
	public static void main(String args[]) {
		//I1 i=new I1(); // we cannot create interface object
		Rest t = new Rest();
	}
}
/*
interfaceno object create na thay
interface is used to acheive Multiple Inheritance
 */
