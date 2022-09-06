// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LinearSrchInteger3 {

	static void show(int[] arr)
	{
		
		for (int p :no ) {
			System.out.print(p+" ");
			  
		}
		System.out.println();
		  
	}

static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				if(st.hasMoreTokens()){
					str = st.nextToken("\n");
				}
				else{
					str = br.readLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

/*
   public static void show(int arr1[]){
   	//given array is
       for (int j : arr1) {
       	System.out.print(j);
       	  
       }

   }

   static void takeInput()
   {
   	System.out.println("give the input");
           
        FastReader s = new FastReader();
		int item = s.nextInt();


   }
*/

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 78, 3};

        
        /* show(int arr[]);
         takeInput();
         */


       LinearSrchInteger3.show(int arr[]);
         

       System.out.println("give the input");
           
        FastReader s = new FastReader();
		int item = s.nextInt();



		//int item = 9;
		int flag = 0;
		for (int i = 0; i < arr.length ; i++ ) {
			if (arr[i] == item) {
				System.out.println("The element "+item+ " found at postion " + i + " starting from 0 index");
				flag++;
			}
		}
		if (flag == 0) {
			System.out.println("element not present in array");
		}
	}
}