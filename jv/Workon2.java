import java.util.*;
class Run{

      int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }


public class Workon2 extends Run {
	
	

	public static void main(String[] args)
	{
		 
		Run t= new Run();
		int arr1[] =  {2,5,1,3,0};
		int arr2[] =  {8,10,5,7,9};

		t.sort(arr1);
	}	
}