//find maximum element in th array
//
public class MaxMin {
	public static void main(String[] args) {
		int[] a = {23, 34, 56, 1, 2, 3, 4, 67, 89, 12, 13, 5534, 343, 231, 121};
		int Max = a[0];
		int Min = a[0];
		for (int i = 1; i < a.length ; i++) {
			if (a[i] > Max) {
				Max = a[i];
			}
			if (a[i] < Min) {
				Min = a[i];
			}
		}
		System.out.println("the max element in array is " + Max);
		System.out.println("the min element in array is " + Min);

	}
}