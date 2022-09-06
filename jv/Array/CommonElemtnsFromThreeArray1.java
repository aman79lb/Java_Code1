import java.util.*;
import java.io.*;
public class CommonElemtnsFromThreeArray1
{
    public static void main(String[] args)
    {
        int[] arr1= {4,3,7,9,2,4,5};
        int[] arr2= {5,1,4,2,8,3,5};
        int[] arr3= {4,6,7,2,3,5,6,7,2};
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        HashSet<Integer> hs3 = new HashSet<Integer>();
        HashSet<Integer> hs_compare= new HashSet<Integer>();
        for (int no : arr1 )
        {
            hs1.add(no);
        }
        for (int no :arr2 )
        {
            hs2.add(no);
        }
        for (int no :arr3 )
        {
            hs3.add(no);
        }
        for (int no :hs2 )
        {
            boolean b=hs1.add(no);
            if (b==false)
            {
                // System.out.print(" "+no+" ");
                hs_compare.add(no);
            }
        }
        for (int no :hs3 )
        {
            boolean b2=hs_compare.add(no);
            if (b2==false)
            {
                System.out.print(" "+no+" ");
            }
        }
    }
}
