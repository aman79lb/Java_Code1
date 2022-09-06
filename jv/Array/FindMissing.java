
public class FindMissing
{

    public static void main(String[] args)
    {

        int a[] = { 1,2,3,4,5,7 };
        int exp_no_of_elements=a.length+1;
        //System.out.println(exp_no_of_elements);

        int total_sum=(exp_no_of_elements*(exp_no_of_elements+1))/2;
        int sum=0;
        for(int i=0; i<a.length ; i++ ) 
        {
            sum=sum+a[i];
        }







    }
}
