public class FindDupBrute {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,4,56,2,2,2};
        int count=0;
        for(int i=0; i<a.length ; i++ ) {
            for(int j=i+1; j<a.length ; j++ ) {
                if((a[i]==a[j])&&(i!=j))
                {   count++;
                    System.out.println(a[i]);
                    //System.out.println(a[i]+" at index "+i+" and  " +j);
                }
            }
        }
        System.out.println(count);
    }
}