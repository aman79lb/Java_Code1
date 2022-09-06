
public class SecondLargest {



	public static void main(String[] args) {
		int[] a = {23, 34, 56, 1, 2, 3, 4, 67, 89, 12, 13, 5534, 343, 231, 121};

		for (int i=0;i<a.length ;i++ ) {

			for (int j=i+1;j<a.length ;j++ ) {
				if(a[j] > a[i]) // a[i] < a[j]
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}

	}
}