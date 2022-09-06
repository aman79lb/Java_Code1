import java.util.*;
import java.io.*;
public class CommonElemtnsFromThreeArray2
{
    public static void main(String[] args)
    {   // !important arrays should be sorted
        int[] a1= {2,4,8,10};
        int[] a2= {2,3,4,8,10,16};
        int[] a3= {2,8,10,14,40};
        ArrayList<Integer> al = new ArrayList<>();
        int x=0;
        int y=0;
        int z=0;
        while (x<a1.length && y<a2.length&& z<a3.length) {
            if(a1[x]==a2[y]&&a2[y]==a3[z])
            {
                al.add(a1[x]);
                x++;
                y++;
                z++;
            } else if (a1[x]<a2[y])
            {
                x++;
            }
            else if (a2[y]<a3[z])
            {
                y++;
            }
            else {
                z++;
            }
        }
        System.out.println(al);
        //or
        for (int no :al )
        {
            System.out.print(" "+no+" ");

        }

    }
}
