//string learning 2
public class Test22 {
	
	

	public static void main(String[] args){

		String s1= "deepak";
		String s2="java";
         
         System.out.println(s1+s2);
           
		System.out.println(s1+10+s2);

		System.out.println(s1+10+20);

		System.out.println(10+20+s1);// 30deepak magic bro first there are interger it wiol add then it will concate
		  // + operator left to right work first int value then it concated
		  // 
		  System.out.println(1+s2+20);

		  System.out.println(s1+20/10);// deepak2  BODMAS precedence
		  // same for the multiplication
		  System.out.println(s2+34*7);

	//not allowed	  System.out.println(s1+10-5);
	
	/*concat(String str) method cancaenates on string to the end of another string
	this method returns a string withthe value of th string pass3d into the method, 
	appeded to the end of the string*/
	System.out.println(s1.concat(s2));

	/* join is the static method of string class
	join(CharSequence delimeiter, CharSequence... elements)is the static
	method which concatenates the given elements eith the delimiter and 
	returns the concatented string it was included in jkk1.8 version.
	note that if an elment is null, then null is added and if delimiter is null then it eill 
	throw "java.lang.NullPointerException"
	*/
     // static join ma 2 arguments ... three dots whhree arguments muans more rguments can take
     System.out.println(String.join(",",s1,s2)); //deepak,java    delimeter aa be between fix kari de
     System.out.println(String.join(";",s1,s2)); //deepak,java    delimeter aa be between fix kari de
     // delimeter null not allwoed ut s1 and s2 can be nullok
     
     System.out.println(s1+(10-20));
          System.out.println((10-20)+s1);
         // System.out.println(s1+(10-f));
               System.out.println(s1+(10-5));


         System.out.println(String.join(";",s1,s2,s1));
                    System.out.println(String.join("zzzz",s1,s2,s1));
         System.out.println(String.join("/",s1,s2,s1));



 
	  
		    
		    
	
		    
		    
		  
		  
	}	
}