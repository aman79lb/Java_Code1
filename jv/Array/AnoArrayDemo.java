
public class AnoArrayDemo {



    public static void main(String[] args)
     {
        AnoArrayDemo.sum(new int[][] {{10,20,30},{40,50}});
     }

    static void sum(int[][] no) {

        int total=0;
        for (int ii[] :no ) {
            for (int i :ii ) {
                total=total+i;
            }
        }
        System.out.println("sum is : "+total);

    }
}
/*
1. array without nam
2. created & intialilized in a single line
3. it can be single or multidimenisonal
4. it can ve used only once
5. it can be used as an argument in method.
 */