// how to find common elemtts feom two arrays in java
// first third approch
import java.util.*;
import java.io.*;

public class CommonElements3
{

    public static void main(String[] args)
    {
        /*
        int[] arr1 = {3,4,5,6,7,3,2};
        int[] arr2 = {43,46,2,3,2,5,2,5,7,8,2};
        */
       
       // no more duplicasey
       int[] arr1 = {4,3,7,9,2};
        int[] arr2 = {5,1,4,8,3};

           HashSet<Integer> hs = new HashSet<>();
        //  HashSet<Integer> hs2 = new HashSet<>();
           for (int no :arr1 )
                {
                  hs.add(no);
                }
/*
                for (int no :arr2 )
                     {
                       hs2.add(no);
                     }

                     for (int no :hs2 )
                          {
                           boolean b= hs2.addall(hs1);
                           if(b==false)
                           {
                            System.out.println(no);
                              
                           }
                          }
                          */
                     

                for (int no :arr2 )
                     {
                        boolean b=hs.add(no);
                       if (b==false)
                            {
                               System.out.print(no+" ");
                                 
                            } 
                            
                     }
                    
                

    }
}
