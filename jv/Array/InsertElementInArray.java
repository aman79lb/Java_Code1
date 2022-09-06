import java.util.*;
import java.io.*;
//rember here program is for the position
public class InsertElementInArray
{
    static void  printArray(int arr[])   //function to print array
    {
        for(int i=0 ; i<arr.length ; i++ )
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] a= {10,20,30,40,50};
        printArray(a);     // printing the target array

        int pos=3;
        int element=100;
        for(int i=a.length-1 ; i>pos-1 ; i-- ) //start from behind index  , decresing exactly before that postition , decreemtnted
        {
            a[i]=a[i-1];   //right shigting the elemtns , here always last elemtn will be lost
        }
        a[pos-1]=element;     //changing the element

        for(int i=0 ; i<a.length ; i++ )  //to display changed array result
        {
            System.out.print(a[i]+" ");   //printing resutlign array
        }



    }
}
