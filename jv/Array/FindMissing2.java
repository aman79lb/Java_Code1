

public class FindMissing2
{
// 
    public static void main(String[] args)
    {   //
        int a[] = { 1,2,3,4,5,7 };
        int exp_no_of_elements=a.length+1;  //aka   array length +1
        // System.out.println(exp_no_of_elements);

        int total_sum=(exp_no_of_elements*(exp_no_of_elements+1))/2;
        int xor1=a[0];
                for(int i=1 ; i<a.length ; i++ ) 
                 {
                    xor1=xor1^a[i];
                 }
        
        int xor2=1;
                for(int j=2; j<=(a.length+1) ;j++ )
                 {
                    xor2=xor2^j;
                    
                 }

                 System.out.println(xor2^xor1);
                   
        



    }
}
