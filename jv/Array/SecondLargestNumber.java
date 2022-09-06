public class SecondLargestNumber {
	static void test(int a[]) {
		//unsorted array
		System.out.println(" Unsorted Array ");
		for (int z : a ) {
			System.out.print(" " + z + " ");
		}
		System.out.println();
	}
	
	static void AscendingArray(int a[])
	{
		int temp;
		for (int i = 0; i < a.length ; i++ ) {
			for (int j = i + 1; j < a.length ; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		
	}

	/*
	//fast code for finding second largest elemrnt

	int temp;
		for (int i = 0; i < a.length ; i++ ) {
			for (int j = i + 1; j < a.length ; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i==1){
	           break;
			}

		}
	 */
	
	public static void main(String[] args) {
		int[] a = {3, 4, 1, 4, 12, 90, 34, 56, 111, 34};
		test(a);
		//it will make array in decending order
		//and will print seond element a[1]in array which will be second largest elment
		int temp;
		for (int i = 0; i < a.length ; i++ ) {
			for (int j = i + 1; j < a.length ; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i==1) {break;
				
			}

		}
		System.out.println("Second largest element is " + a[1]);
		//decending order array
		//System.out.println();
		for (int k = 0; k < a.length ; k++ ) {
			System.out.print(" " + a[k] + "");
		}


  
AscendingArray(a);
System.out.println();
  
test(a);

	}

	










}