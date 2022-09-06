
public class Test25 {
	
	

	public static void main(String[] args){
		
		String name="deepak";
		String email="abc@gmail";
		System.out.println(name.length());
		System.out.println(email.length());
		  
		  int i=name.length(); // String name='  '; is also accepted that why will use trim mehtod before and String name=null ; will throuw null pointer exception
		  if(i==0)
		  {
		  	System.out.println("name is empty");
		  	  
		  }
		  else{
		  	System.out.println("valid name");
		  	  
		  }
	}	
}