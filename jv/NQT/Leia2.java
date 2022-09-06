import java.util.*;
class WorkMethod {
	int sort(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
}
public class Leia2 extends WorkMethod { // Leia stands for ( L=Largest . e=Element .  i=In the . a=Array )
	public static void main(String[] args) {
		int arr1[] =  {2, 5, 1, 3, 0};
		int arr2[] =  {8, 10, 5, 7, 9};
		Leia2 t = new Leia2();
		//t.sort(arr2); works well
		System.out.println("The Largest element in the array is: " + t.sort(arr1));
		System.out.println("The Largest element in the array is: " + t.sort(arr2));
		System.out.println("first array length " + arr1.length + " it counts from 1");
	    //WorkMethod.sort(arr1); wont work until int sort is static
	}
}