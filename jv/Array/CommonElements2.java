// how to find common elemtts feom two arrays in java
// second naive approch
// collection fremawoerk uses java util libreaty
//  only executes goog when both array has no duplicacy more than one use this thing
import java.util.*;
import java.io.*;

public class CommonElements2
{

    public static void main(String[] args)
    {

        HashSet<Integer> hs = new HashSet<>();
        int[] arr1 = {3,4,5,6,7,3,2};
        int[] arr2 = {43,46,2,3,2,5,2,5,7,8,2};


        for(int i=0 ; i<arr1.length ; i++ )
        {
            for(int j=0; j<arr2.length ; j++ )
            {
                if (arr1[i]==arr2[j])
                {
                    //System.out.print(arr1[i]+" ");
                                    hs.add(arr1[i]);
                                    break;
                }

            }

        }
        for (int no :hs )
             {
               System.out.print(no+" ");
               //proper output no multiple printting problem
               //create has set object store common elements into set more than one occurence will no tbe treated
               
                 
             }
             

    }
}
