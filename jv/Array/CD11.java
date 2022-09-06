
   /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CD11 //Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {

        
        try {

           FastReader s = new FastReader();

        int t = s.nextInt();
        int arr[][] = new int[t][4];
        for(int i=0; i<t; i++)
        {
            for(int j=0; j<4; j++)
                arr[i][j] = s.nextInt();
        }
        
        for(int i=0; i<t; i++)
        {
                int A = arr[i][2]/arr[i][0];
                int B = arr[i][3]/arr[i][1];
                System.out.println(A+B);
        }
            

        }
        catch(Exception e) {
            return;
        }
    }
}

class FastReader {
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
    
    Problem
Read problem statements in Vietnamese,
Bengali, Mandarin Chinese, and Russian as well.

Chefland has 22 different types of coconut, type AA and type BB. Type AA contains only x_ax 
a
​
  milliliters of coconut water and type BB contains only x_bx 
b
​
  grams of coconut pulp. Chef's nutritionist has advised him to consume X_aX 
a
​
  milliliters of coconut water and X_bX 
b
​
  grams of coconut pulp every week in the summer. Find the total number of coconuts (type AA + type BB) that Chef should buy each week to keep himself active in the hot weather.

Input
The first line contains an integer TT, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, four integers x_ax 
a
​
 , x_bx 
b
​
 , X_aX 
a
​
 , X_bX 
b
​
 .
Output
For each test case, output in a single line the answer to the problem.

Constraints
1 \leq T \leq 150001≤T≤15000
100 \leq x_a \leq 200100≤x 
a
​
 ≤200
400 \leq x_b \leq 500400≤x 
b
​
 ≤500
1000 \leq X_a \leq 12001000≤X 
a
​
 ≤1200
1000 \leq X_b \leq 15001000≤X 
b
​
 ≤1500
x_ax 
a
​
  divides X_aX 
a
​
 .
x_bx 
b
​
  divides X_bX 
b
​
 .
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
100 400 1000 1200
100 450 1000 1350
150 400 1200 1200
13
13
11
Explanation:
TestCase 11: Number of coconuts of Type AA required = \frac{1000}{100} = 10 
100
1000
​
 =10 and number of coconuts of Type BB required = \frac{1200}{400} = 3 
400
1200
​
 =3. So the total number of coconuts required is 10 + 3 = 1310+3=13.

TestCase 22: Number of coconuts of Type AA required = \frac{1000}{100} = 10 
100
1000
​
 =10 and number of coconuts of Type BB required = \frac{1350}{450} = 3 
450
1350
​
 =3. So the total number of coconuts required is 10 + 3 = 1310+3=13.

TestCase 33: Number of coconuts of Type AA required = \frac{1200}{150} = 8 
150
1200
​
 =8 and number of coconuts of Type BB required = \frac{1200}{400} = 3 
400
1200
​
 =3. So the total number of coconuts required is 8 + 3 = 118+3=11.
     */