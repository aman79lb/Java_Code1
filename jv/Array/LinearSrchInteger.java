public class LinearSrchInteger {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 78, 3};
		int item = 9;
		int flag = 0;
		for (int i = 0; i < arr.length ; i++ ) {
			if (arr[i] == item) {
				System.out.println("element found at postion " + i + " starting from 0 index");
				flag++;
			}
		}
		if (flag == 0) {
			System.out.println("element not present in array");
		}
	}
}