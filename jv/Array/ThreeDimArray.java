
public class ThreeDimArray {
	
	

	public static void main(String[] args){
		
		int[][][] a={{{10,20},{30,40,50,60},{70,80,90}}};   //int[2][4][3]

/*
		System.out.println(a); //three dim array no class name print karavi didhu
		System.out.println(a[0]);
		System.out.println(a[0][0]);
		System.out.println(a[0][0][0]);
		System.out.println(a[0][0][1]);


*/

		for (int i=0;i<a.length ;i++ ) {
			for (int j=0;j<a[i].length ;j++ ) {
				for (int k=0;k< a[i][j].length;k++ ) {
					//System.out.println(a[i][j]+" ");
				//	System.out.println(a[i][j][k]+" ");
				System.out.print(" "+a[i][j][k]+" ");

					 //
					 // 	 	System.out.println();


					
				}
				System.out.println();
				  
			}
			System.out.println();
			  
		}

 
	}	
}