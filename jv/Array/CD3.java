import java.util.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class CD3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String strs = lines.trim().spilt("\\s+");
        // int t =br.nextInt();
        //t=3
        //
        /*
        while(t-->0)
        {*/
        int arr[][] = new int[3][4];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[1].length; j++)
            {
                // arr[i][j] = s.nextInt();
                for(int k=0; k<strs.length ; k++ ) {
                    arr[k][j]=Integer.parseInt(strs[k]);
                }
            }
        }
            /*       
            }  */
            /*
                            for(int y=0;i<arr.length ;y++ ) {
                                        for(int z=0;j<arr[y].length ;z++ ) {
                                            System.out.print(a[y][z]+" ");
                                        }
                            }
            */
            /*
                 for (int ii :arr ) {
                        for (int i :ii ) {
                            System.out.print(i);
                        }
                    }
            */
        }
    }