//Even and Odd
// no of Even and Odd
// sum of Even and Odd
// through ArrayList

///ArrayList

//first ArrayList no object than create genericc

import java.util.*;
public class EvenOdd {
    
    

    public static void main(String[] args){
        
         int a[]={2,3,4,5,6,2,3,4,5};

         //arraylist is predefined class we are going to create the object for this thling
        ArrayList<Integer> list1_Even = new ArrayList<>();
        ArrayList<Integer> list2_Odd = new ArrayList<>();


        for(int i=0;i<a.length ;i++ ) {
            if (a[i]%2==0) {
                list1_Even.add(a[i]);
                
            }
            else{
                list2_Odd.add(a[i]);
            }
        }

        System.out.println("Even no's are : ");
        for (int y : list1_Even ) { //we can traverse list like an array
            System.out.print(y+" ");
              
        }
        System.out.println();
        System.out.println("total no is even no's are: "+list1_Even.size());
          

        System.out.println();
                
          

        System.out.println("Odd no's are : ");
        for (int z : list2_Odd ) { //we can traverse list like an array
            System.out.print(z+" ");
              
        }
        System.out.println();
        
            
        System.out.println("total no is odd no's are: "+list2_Odd.size());





          







    }    
}