import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;
public class Arr1 {
	/* 1. Declaration
	   2. Creation
	   3. Intialization
	   4. Retrieve
	  */
	public static void main(String[] args) {
		//int[] a=new int[0]; will commpile annd run
		//int[] a=new int[-1]; only will get compiled but will through runtime exception ArrayNeagative size
		int[] a; //declare
		a = new int[3]; //creation    define size
		int[] b = new int[3]; //declare and create in one line
		int[] c = {10, 20, 30}; // allowed declard intilizationn
		int[] d = new int[] {10, 20, 30}; //allowed declartion ,creation and intilization
		System.out.println(c[1]);
		// for (int i=0/* cause index value start with 0*/ ; a.length    /* i<=2 jo 3 create to n-1 2 lako  or i<3 or a.length where length is whreeable which will provide lingh of the array   */; i++) {
//
		//	System.out.println(a[i]);
		//
		//
		//  }
		System.out.println();
		for (int i = 0; i < b.length; i++ ) {
			System.out.println(b[i] + ",");
		}
		for ( int j : a) {
			/*
			System.out.print(" "+a[j]+",");
			System.out.println(a[j]);
			*/
			System. out.print(" " + a[j] + ",");
		}
	}
}