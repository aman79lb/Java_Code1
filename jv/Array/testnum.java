

// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class testnum {
    
    

    public static void main(String[] args) throws java.lang.Exception
    {/*
      if(0.06<0.1)  {
        System.out.println("yes");
          
      }*/

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String  lines = br.readLine();    

    String[] strs = lines.trim().split("\\s+");
            int[] a=new int[3];
    for (int i = 0; i < strs.length; i++) {
    a[i] = Integer.parseInt(strs[i]);
    }
    }    
}

/* output:
3
12 34 33 
*/ like this