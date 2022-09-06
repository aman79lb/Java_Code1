//string learingn 1
public class Test21
{

	     public static void main(String args[])
	     {
	        String t=new String("ok");
	        System.out.println(t.length());
	         
	        String s2= new String();
	        System.out.println(s2.length());
	        
	        String s3="deepak";
	        System.out.println(s3.length());
	                      
	
// mutable string  immutable string ma
	        StringBuilder sb= new StringBuilder("deepaak");
	        String s4 = new String(sb);
            System.out.println(s4);

//mutable string thi immutable strig ma
//string constructor na parameter ma pass karavie 
            StringBuffer sb2 = new StringBuffer("speed");
            String s5=new String(sb2);
            System.out.println(s5);

            //bytes converted ito character
            //byter array passed into string constructor
            byte[] b={101,102,103};
            String s6 = new String(b);
            System.out.println(s6);  //efg
              

            //char array
            //string is the sequence of character
            //char array is also passed into string constructor
            char[] c={'a','b','c'};
            String s7=new String(c);
            System.out.println(s7); //abc
              
           
              char[] d1= new char[]{'a','b','c'}; //d1 is refrence
              String d2= new String("abc");

              System.out.println("d1 :-"+d1);//  d1 :- [C@a09ee92   char object print thauou 
              System.out.println("de :-"+d2);//   d2:- abc     string  object ni inner value print thatyou
 


              
	          
	     }
	  
	
}/* chr array is etrer tahn string array in java
stiring objects are immutable and scp donestn apply garage collection
sting object can be created vut object wont delete
and chaces are someone can hack tht password
*/