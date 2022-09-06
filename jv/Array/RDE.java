import java.util.*;
import java.io.*;
public class RDE
{
    public static void main(String[] args)
    {
        //int[] a= {2,2,2,22,2};
        int[] a= {1,2,2,3,4,5,5};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0 ; i<a.length ; i++ )
        {
            for(int j=0; j<a.length ; j++ )
            {
                if ((a[i]!=a[j]))
                {
                    hs.add(a[j]);
                }
            }
        }
        for (int no : hs )
        {
            System.out.print(no+" ");
        }
    }
}
