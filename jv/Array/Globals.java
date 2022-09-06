import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;

public class Globals
{
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define tt int t;cin >> t;while(t--)
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define rr return
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define endl cout << "\n";
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define ll long long int
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define pp(x) cout << (x);
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define debug cout << "here";
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define debug2 cout << "here2";

	public static int comp(Object a, Object b)
	{
	   return ((int)a - (int)b);
	}
	public static int gcd(int a, int b)
	{

		if (b == 0)
		{
		return a;
		}
		return gcd(b, a % b);
	}
	public static int lcm(int a, int b)
	{
		return a * b / (gcd(a, b));
	}
	public static int max(int[] a, int n)
	{
		int i;
		int in = 0;
		int max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				in = i;
			}
		}
		return in;
	}
	public static void geta(int[] a, int n)
	{
		 int i;
		 for (i = 0;i < n;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void printa(int[] a, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	public static int min(int[] a, int n)
	{
		int i;
		int in = 0;
		int min = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
				in = i;
			}
		}
		return in;
	}
	public static int sum(int[] a, int n)
	{
		int i;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		return sum;
	}
	public static int numd(int n)
	{
		int c = 0;
		while (n != 0)
		{
			c++;
			n /= 10;
		}
		return c;
	}
	public static int isp(int y)
	{
		int x = (int)Math.floor(Math.sqrt((double)y));
		if ((x * x) == y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int mod(int x, int y)
	{
		return x > y?(x - y):(y - x);
	}
	public static int iss(long[] a, int n)
	{
		for (int i = 0;i < n - 1;i++)
		{
		if (a[i] > a[i + 1])
		{
		return 0;
		}
		}
		return 1;
	}
	public static void main(String[] args)
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((t--) != 0)
		{ //cout << t << " ";
			int n;
			int con = 1;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			String[] s = tangible.Arrays.initializeWithDefaultStringInstances(n - 2);
			for (int i = 0;i < n - 2;i++)
			{
				s[i] = ConsoleInput.readToWhiteSpace(true);
			}
			for (int i = 0;i < n - 2;i++)
			{
				//cout << s[i];
				if (i == 0)
				{
					System.out.print(s[i].charAt(0));
				}
				else if (s[i - 1].charAt(1) == s[i].charAt(0))
				{
					System.out.print(s[i].charAt(0));
				}
				else if (s[i - 1].charAt(1) != s[i].charAt(0))
				{
					System.out.print(s[i - 1].charAt(1));
					System.out.print(s[i].charAt(0));
					System.out.print("");
					con = 0;
				}
			}
			System.out.print(s[n - 3].charAt(1));
			if (con == 1)
			{
				System.out.print("b");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
