import java.util.*;
import java.io.*;
public class RemoveOneElement2
{
    // in this program always there is last postion is opied
    public static void main(String[] args)
    {
        int[] a= {10,30,40,50,60};
        int del_ele=30;
        int count=0;
        for(int i=0 ; i<a.length ; i++ )
        {
            if (del_ele==a[i])
            {
                for(int j=i; j<a.length-1; j++ )
                {
                    a[j]=a[j+1];
                }
                count=count+1;
                break;
            }
        }
        if (count==0)
             {
                System.out.println(" Element no found ");
                  
             } 
         else{  
            System.out.println(" Element deleted successfully ");
         //will print whole array don not  use     
        for (int no : a)
        {
            System.out.print(no+" ");
        }
        System.out.println();
        // this one should be used to display the output
        for(int i=0 ; i<a.length-1 ; i++ )
        {     // here i<a.length-1 is used to print one right shifted reslut
            System.out.print(a[i]+" ");
        }
        }  
    }
}
