 // how to find common elemtts feom two arrays in java
 // first naive approch
 public class CommonElements1
 {
 
       public static void main(String[] args)
       {   
           int[] arr1 = {3,4,5,6,7,3,2};
                    int[] arr2 = {43,46,2,3,2,5,2,5,7,8,2};
      

                  for(int i=0 ; i<arr1.length ; i++ ) 
                   {
                              for(int j=0; j<arr2.length ;j++ )
                               {
                                  if (arr1[i]==arr2[j])
                                       {
                                          System.out.print(arr1[i]+" ");
                                           break; 
                                       } 
                                       
                               }
                      
                   }
          
       }    
 }
   