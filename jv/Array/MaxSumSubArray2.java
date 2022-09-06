import java.util.*;
import java.io.*;
public class MaxSumSubArray2
{
    public static void main(String[] args)
    {
        int[] a= {4,-2,-3,4,-1,-2,1,5,-3};
        int maxz_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        int start=0, end=0 ,s=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0 ; i<a.length ; i++ )
        {
            max_ending_here=max_ending_here + a[i];
            if (maxz_so_far<max_ending_here)
            {
                maxz_so_far=max_ending_here;
                start=s;
                end=i;
            }
            if (max_ending_here<0)
            {
                max_ending_here=0;
                s=i+1;
            }
        }

        System.out.println(" The max so far "+maxz_so_far+" ");
        //////////////////////
        for(int j=start; j<=end ; j++ )
        {
            hs.add(a[j]);
        }
        /*
        System.out.print(hs);
          */
         System.out.println(" this value is fond by below array");
        //
        //  System.out.println(" haset has sorted nums but original they are no sorted");
           
        for (int no :hs )
        {
            System.out.print(" "+no+" ");
        }
        System.out.println();
                
        System.out.println(" strating index position of sub array is "+start+" and ending index position is "+end);

        System.out.println();
                System.out.println(" given array for reference");
                        for(int k=0;k<a.length ;k++ )
                         {
                              System.out.print(" "+a[k]+" ");
                                
                         }
                System.out.println();
                  
                  
          
        ///////////////////
        System.out.println();
                
        System.out.println(" A.K.A kadane's algorithm algo");
        for (int no :hs )
        {
            System.out.print(" "+no+"  + ");
        }
        System.out.print(" = "+maxz_so_far);
    }
}
