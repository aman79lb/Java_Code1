import java.util.*;
import java.io.*;
 ///  remove duplicate element form the array 
 ///  best way maybe to for sorted and unsorted arrays 
 public class RDE2
 {
 
       public static void main(String[] args)
       {   
           int[] a= {1,2,2,3,4,5,5};

                   HashSet<Integer> hs = new HashSet<Integer>();
                    for(int i=0 ; i<a.length ; i++ ) 
                     {
                        hs.add(a[i]);
                     }
                     for (int no : hs)
                          {
                            System.out.print(no+" ");
                              
                          }
                          
            
         
 
       }    
 }
   