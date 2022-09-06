
import java.util.HashSet;



public class FindCommonElement
{
    public static void main(String[] args)
    {
        int[] arr1= {2,3,4,74,5,6,2};
        int[] arr2= {34,6,7,4,2};
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0 ; i<arr1.length ; i++ )
        {
            for(int j=0; j<arr2.length ; j++ )
            {
                if (arr1[i]==arr2[j])
                {
                    //System.out.println(arr1[i]+" ");
                    hs.add(arr1[i]);
                    break;
                }
            }
        }// common elements hash set na object ma add kari nakhoyo 
            // compae karvana hashset e add karvana and then print karvan 
            // //hash set hahs property can nont s


                for (int no :hs )
                     {
                       System.out.println(no+" ");
                         
                     }
                     
        

    }
}
