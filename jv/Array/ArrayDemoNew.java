
public class ArrayDemoNew {
	 
	

	public static void main(String[] args){
		
		int[][]  a={{1,2,3,4},{5,6},{7,8,9}};
         /*  
          int[][]  a;
          a= new int[3][];
          a[0] = new int[4];
          a[1] = new int[2];
          a[2] = new int[3];

                0 1 2 3

           0    1 2 3 4
           1    5 6
           2    7 8 9

          a[0][0]=1;
          a[1][1]= 6;
          like this define if we use this way other wise use above first line way



         */
		System.out.println(a); //[[I@2c7b84de   two square brackes show 2d array I stands for integer than @ and than hashvalue
		System.out.println(a[0]); //[I@3fee733d   one square brackt for 1d
		System.out.println(a[0][0]);
		System.out.println(a[0].length);
		  
		      
		  
	}	
}