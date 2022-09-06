
//simple merge two arrays
public class TwoArray {
	
	

	public static void main(String[] args){
		
		int[]  a={1,2,3,4};
		int[]  b={40,50};
		int[] c= new int[a.length+b.length];
		for (int i=0;i<a.length ;i++ ) {
			c[i]=a[i];
		}
			for (int j=0;j<b.length ;j++ ) {
			c[a.length+j]=b[j];
		}
		
		//this one suraj
		
		for (int d:c) {
			System.out.print(d+" ");
			  
			
		}
		
	
	for (int k=0;k<c.length ;k++ ) {
	System.out.print(c[k]+" ");
		  	
	}





	}	
}