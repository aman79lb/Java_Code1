

class ArrayTool {//java.lang.Integer
    int FindSecondLargest(int[] a) {  //takin input argu as array direcetly prints second largest
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length ; i++ ) {
            if (a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            } else if (a[i] > second_largest && a[i] != largest) {
                second_largest = a[i];
            }
            //System.out.println("second_largest element is : "+second_largest);  //use this statement here to dibug
        }
        if (second_largest == Integer.MIN_VALUE) {
            System.out.println(" there is no second_largest element" );
            System.out.println(" Integer.MIN_VALUE is given or empty array" );

            return Integer.MIN_VALUE;

        } else {
            /*
            System.out.println();
            System.out.println("second_largest element is : " + second_largest);
            System.out.println("largest: " + largest);*/
            return second_largest;
        }
    }
}
public class SecondLargestNumber_opt2 extends ArrayTool {
    public static void main(String[] args) {

        //int[] a = {23, 434, 23, 12, 11, 2, 443, 12, 233, 23, 3};
        int[] a = {2, 2, 2};

        SecondLargestNumber_opt2 ty = new SecondLargestNumber_opt2();

        //ty.FindSecondLargest(a);

        //this will also work
        //System.out.println(" second_largest is "+ty.FindSecondLargest(a));

        //this will work
        System.out.println(ty.FindSecondLargest(a));

    }
}