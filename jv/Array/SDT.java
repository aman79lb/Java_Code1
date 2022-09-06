public class SDT
{
	// C++ includes used for precompiling -*- C++ -*-

	// Copyright (C) 2003-2018 Free Software Foundation, Inc.
	//
	// This file is part of the GNU ISO C++ Library.  This library is free
	// software; you can redistribute it and/or modify it under the
	// terms of the GNU General Public License as published by the
	// Free Software Foundation; either version 3, or (at your option)
	// any later version.

	// This library is distributed in the hope that it will be useful,
	// but WITHOUT ANY WARRANTY; without even the implied warranty of
	// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	// GNU General Public License for more details.

	// Under Section 7 of GPL version 3, you are granted additional
	// permissions described in the GCC Runtime Library Exception, version
	// 3.1, as published by the Free Software Foundation.

	// You should have received a copy of the GNU General Public License and
	// a copy of the GCC Runtime Library Exception along with this program;
	// see the files COPYING3 and COPYING.RUNTIME respectively.  If not, see
	// <http://www.gnu.org/licenses/>.

	/** @file stdc++.h
	 *  This is an implementation file for a precompiled header.
	 */

	// 17.4.1.2 Headers

	// C
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	//#if ! _GLIBCXX_NO_ASSERT
	//#endif

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	//#if __cplusplus >= 201103L
	//#endif

	// C++

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	//#if __cplusplus >= 201103L
	//#endif

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	//#if __cplusplus >= 201402L
	//#endif

	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	//#if __cplusplus >= 201703L
	//#endif

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

//Helper class added by C++ to Java Converter:

//package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2022 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to initialize and delete array elements.
//----------------------------------------------------------------------------------------
public final class Arrays
{
	public static String[] initializeWithDefaultStringInstances(int length)
	{
		String[] array = new String[length];
		for (int i = 0; i < length; i++)
		{
			array[i] = "";
		}
		return array;
	}

	public static <T extends java.io.Closeable> void deleteArray(T[] array)
	{
		for (T element : array)
		{
			if (element != null)
				element.close();
		}
	}
}

//Helper class added by C++ to Java Converter:

//package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2022 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to convert basic C++ 'cin' behavior.
//----------------------------------------------------------------------------------------
public final class ConsoleInput
{
	private static boolean goodLastRead = false;
	public static boolean lastReadWasGood()
	{
		return goodLastRead;
	}

	public static String readToWhiteSpace(boolean skipLeadingWhiteSpace)
	{
		String input = "";
		char nextChar;
		while (Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			//accumulate leading white space if skipLeadingWhiteSpace is false:
			if (!skipLeadingWhiteSpace)
			{
				input += nextChar;
			}
		}
		//the first non white space character:
		input += nextChar;

		//accumulate characters until white space is reached:
		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
		}

		goodLastRead = input.length() > 0;
		return input;
	}

	public static String scanfRead()
	{
		return scanfRead(null, -1);
	}

	public static String scanfRead(String unwantedSequence)
	{
		return scanfRead(unwantedSequence, -1);
	}

	public static String scanfRead(String unwantedSequence, int maxFieldLength)
	{
		String input = "";

		char nextChar;
		if (unwantedSequence != null)
		{
			nextChar = '\0';
			for (int charIndex = 0; charIndex < unwantedSequence.length(); charIndex++)
			{
				if (Character.isWhitespace(unwantedSequence.charAt(charIndex)))
				{
					//ignore all subsequent white space:
					while (Character.isWhitespace(nextChar = (char)System.in.read()))
					{
					}
				}
				else
				{
					//ensure each character matches the expected character in the sequence:
					nextChar = (char)System.in.read();
					if (nextChar != unwantedSequence.charAt(charIndex))
						return null;
				}
			}

			input = (new Character(nextChar)).toString();
			if (maxFieldLength == 1)
				return input;
		}

		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
			if (maxFieldLength == input.length())
				return input;
		}

		return input;
	}
}
