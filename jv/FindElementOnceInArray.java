
public class FindElementOnceInArray {
    
    

    public static void main(String[] args){
                 //other elments should repeat in manner of the twice and multiple of twice occurence
                 int a[]={2,3,4,5,6,2,3,4,5};
                 int res=a[0];
                for(/*here i=1*/int i=1;i<a.length ;i++ ) { // 0 this sstart no cause res=a[0] lidhu 6e bas
                    res=res^a[i];
                }
                System.out.println(" Single repeated element is "+res);
                  
        
    }    
}