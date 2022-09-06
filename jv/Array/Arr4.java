//
// An Array in jave without any Name is anonymous Array.
//  it is an array just for creating and using instantly.
//
 //   new int[]{10,20};is annoymous array       wherever   int[]  a= new int[]{10,20,30} has name mean normal array
//only used once , in single line create kartaj intilize karavi devanu
//can be single dimensonal or multi diemesonal
//
//  Arr4 = AnoArrayDemo

public class Arr4 {
	public static void main(String[] args){
		int a=60,b=55,c=90;
		Arr4.sum(new int[]{a,b,c});


		Arr4.sum(new int[]{10,20,30});

	}	
	static void sum(int[] no)
	{
		int total=0;
		for (int i :no ) {
			total=total+i;
		}
		System.out.println(" Sum is : "+total);
		  
	}
} 
// annoynomous array for only use once
