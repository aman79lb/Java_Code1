// Java Program to Take Input from User Separated by Space
// Using BufferedReader class

// Importing required classes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Main class
// BufferedReaderTest
class Input1 {

    // Main driver method
    public static void main(String[] args)
        throws IOException
    {

        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in));

        // Custom integer array of size 2
        int num[] = new int[2];
        // Array of string type to store input
        String[] strNums;

        // Display message
       // System.out.println("enter string of numbers");

        // Reading input a string
        strNums = bi.readLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }

        // Display message
       // System.out.println("printing stored numbers ");

        // Printing the stored numbers using for loop
        for (int i = 0; i < strNums.length; i++) {
            System.out.println(num[i]);
        }
    }
}

/* input ek line ma
   10 122
   
   output alaga alag line ma
   10
   122

   */