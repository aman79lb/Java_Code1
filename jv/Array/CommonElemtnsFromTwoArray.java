import java.util.*;
import java.io.*;

public class CommonElemtnsFromTwoArray
{

      public static void main(String[] args)
      {   
          int[] arr1={4,3,7,9,2,4};
          int[] arr2={5,1,4,8,3,5};

          HashSet<Integer> hs = new HashSet<Integer>();        
            for (int no : arr1 )
                 {
                   hs.add(no);
                 }
                 
                 for (int no1 :arr2  )
                      {
                        boolean b=hs.add(no1);
                         if (b==false)
                              {
                                System.out.println(no1);
                                    
                              } 
                              
                      }
                          /*
                      for (int no :arr2  )
                      {
                        boolean b=hs.add(no);
                         if (b==false)
                              {
                                System.out.println(no);
                                    
                              } 
                              
                      }
                      *///also works
                      
      }    
}
            