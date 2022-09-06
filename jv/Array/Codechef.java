
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
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
/*
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
*/		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	     int t=3,i;
        int a[]=new int[4];

        Scanner scanner = new Scanner(System.in);

        while(t>0)  
        {
            for(i=0; i<4; i++){
                a[i]=scanner.nextInt();
               // System.out.println(a[i]);
            }   

        //USE THIS ARRAY A[] OF 4 Separated Integers Values for solving your problem
            t--;
        }
	 /*   
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String  lines = br.readLine();    
        
    String[] strs = lines.trim().split("\\s+");
            int[] a=new int[4];
    for (int i = 0; i < strs.length; i++) {
    a[i] = Integer.parseInt(strs[i]);
    }*/
		// your code goes here
	/*	FastReader s = new FastReader();
		int n = s.nextInt();*/
		int g=a.length;
		int count = 0;
		while (g-- >0) {
		//	int x = s.nextInt();
		    int j=0;
			if (a[j] % 10 > 0){
			count++;


			}
			j++;
			  
				
		}
		System.out.println(count);
	}
}
