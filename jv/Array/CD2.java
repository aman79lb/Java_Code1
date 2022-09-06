/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CD2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //Scanner s1 = new Scanner(System.in);
     //   int t = s1.nextInt();
        FastReader s = new FastReader();
        
        int t= s.nextInt();
        int arr[][] = new int[t][4];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[1].length; j++)
                arr[i][j] = s.nextInt();
        }
        
        for(int i=0; i<t; i++)
        {
                int A = arr[i][2]/arr[i][0];
                int B = arr[i][3]/arr[i][1];
                System.out.println(A+B);
        }
    }
}

 class FastReader {
    BufferedReader br;
    StringTokenizer st;
    public FastReader() {
        br = new BufferedReader(
            new InputStreamReader(System.in));
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() {
        return Double.parseDouble(next());
    }
    String nextLine() {
        String str = "";
        try {
            if (st.hasMoreTokens()) {
                str = st.nextToken("\n");
            } else {
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}