public class PrintArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		for (int i = 0; i < a.length; i++ ) {
			System.out.println(a[i] + ",");
			//System.out.println("");
			//  System.out.println();
		}

		for (int i = 0; i < a.length ; i++ ) {
			System.out.print(a[i] + ",");
		}

		System.out.println("");

		System.out.println("this one bro man");
		for (int j : a ) {


			//System.out.println();
			//System.out.print(j + "");
			System.out.print(j + " ");
			// System.out.print(j + ",");

		}

		System.out.println("");

		for (int d : a ) {
			//System.out.println();
			System.out.println(d);
		}

	}
}