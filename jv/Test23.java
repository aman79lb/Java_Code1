//string learning 3
public class Test23 {
	
	

	public static void main(String[] args){
		String s= "this is demo";
		//first postion beginning index positon and second value would e ending index position
		////s.subSequence(beginIndex, endIndex)  interger value
		System.out.println(s.subSequence(3, 9)); // s is d 9 thi ek kum
		  //ending karta 9 thi pelanu 8 sudhi nu print thase 3 thi8 mate  3 thi 9
		  System.out.println(s.substring(3));//only one argument mens begingn 3 thi end sudig mens "s is demo"
		    
		    //substing string value and subsequesce charvalue retrun karse
		    
		    System.out.println(s.substring(3,9));//same output s is d pan string return ,look vise same
		    System.out.println(s.substring(0,0));// empty string means will print line empty and go to next line
		      


		      
		 
	}	
}