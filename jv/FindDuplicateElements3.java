// using HashMap myfriend

import java.util.*;
import java.util.Map;
public class FindDuplicateElements3 {
    
    

    public static void main(String[] args){
        int a[]={1,1,1,1,2,3,4,4,56,2,2,2};
        Map<Integer,Integer> hm=new  HashMap<>();

        for (int no  : a) {
            Integer count=hm.get(no);   // Integer 
            if (count==null) {
                hm.put(no,1); //put is method
                
            }
            else{
                count=count+1;//count++
                hm.put(no,count);
            }
            
        }
   //getValue and getKey
        Set<Map.Entry<Integer,Integer>> es= hm.entrySet();
        for (Map.Entry<Integer,Integer> me :es ) {
            if (me.getValue()>1) {
                System.out.println(me.getKey());
                  
                
            }

        }
        

        }
    }