import java.util.*;
import java.io.*;
public class RemoveOneElement
{
    
    public static void main(String[] args)
    {
        int[] a= {10,30,40,50,60};
        int del_ele=30;
        for(int i=0 ; i<a.length ; i++ )
        {
            if (del_ele==a[i])
            {
                for(int j=i; j<a.length-1; j++ )
                {
                    a[j]=a[j+1];
                }
                break;
            }
        }
        for (int no : a)
        {
            System.out.print(no+" ");
        }
        System.out.println();
        for(int i=0 ; i<a.length-1 ; i++ )
        {
            System.out.print(a[i]+" ");
        }
    }
}
