// Java Program to Take Input from User Separated by Space
// Using Scanner class

// Importing required classes
import java.io.IOException;
import java.util.Scanner;

// Main class
// Scanner class
class Input2 {

	// Main driver method
	public static void main(String[] args) 
		throws IOException
	{

		// Display message for better readability
		//System.out.println("enter input ");

		// Creating an object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Declaring and initializing an array of size 10
		int[] nums = new int[2];
		int i;

		// Loop to store input values in nums array
		for (i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		// Display message
		//System.out.println("printing stored values");

		// Printing stored values
		for (i = 0; i <nums.length; i++) {
			System.out.println(nums[i] + " ");
		}

/*
		// Printing stored values vagar koi extra space
		for (i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		*/
	}
}
