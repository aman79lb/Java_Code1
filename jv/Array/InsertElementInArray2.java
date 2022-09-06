import java.util.*;
import java.io.*;
public class InsertElementInArray2
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

        int[] a= {10,20,30,40,50,60,70,80,90};
        printArray(a);     // printing the target array

        int index_pos=5;   //**when they say index postion (in array) no just position
        int element=100;
        for(int i=a.length-1 ; i>index_pos; i-- )//start from behind index  , decresing exactly before that postition , decreemtnted
        {   //i>index_pos **here we removed the -1 from the index
            a[i]=a[i-1];   //right shigting the elemtns , here always last elemtn will be lost
        }
        a[index_pos]=element;     //**here also -1 removed changing the element




        for(int i=0 ; i<a.length ; i++ )  //to display changed array result
        {
            System.out.print(a[i]+" ");   //printing resutlign array
        }



    }
}