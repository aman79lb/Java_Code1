// optimized program to find second largest in static main simple
public class SecondLargestNumber_opt {
	public static void main(String[] args) {
		int[] a = {3, 4, 1, 4, 12, 90, 34, 56, 111, 34};
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length ; i++ ) {
			if (a[i] > largest) {
				second_largest = largest;
				largest = a[i];
			} else if (a[i] > second_largest && a[i] != largest) {
				second_largest = a[i];
			}
			//System.out.println("second_largest element is : "+second_largest);  //use this statement here to dibug
		}
		if (second_largest==Integer.MIN_VALUE) {
System.out.println(" there is no second_largest element" );
			
		}
		else{
		System.out.println();
		System.out.println("second_largest element is : " + second_largest);
		System.out.println("largest: " + largest);
	}
	}
}