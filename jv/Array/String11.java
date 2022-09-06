
public class String11
{

      public static void main(String[] args)
      {   
          String s1 = new String("deepak");

          //case conversion
          // toLowerCase() 
          // toUpperCase()
          
          System.out.println(s1.toUpperCase()); //DEEPAK
            // THe toUpperCae() method converts all characters of the stirng into a uppercase letter.
        
        String s2 = new String("DeePak");
        System.out.println(s2.toUpperCase());

        System.out.println(s1.toLowerCase());


        //type conversion method
        // this conversts other datatypes iinto the stinng
        // 
        // the valueOf() method converts different types of calues ito string. by the help
        // of string.valueOf() mehtod, we an convert int or long or float or double of object or any otrher type intot string
        // 
        // NOTE : valueOf() method is static mehtod stts why we  can call calue of() method directly by String class.
          
          int a=23;
          String s3= String.valueOf(a);  // any data data type as argument
          System.out.println(a);
           System.out.println(s3);

           //the toCharArrayy() method converts theh given string into a sequence fo charavers
           //the returned array lennth is equal to the length of the string.
           
            char[] ch=s1.toCharArray();
            System.out.println(ch);
             // here this mehtod converts string into ahcarcter array
        
            


              
               



      }    
}
  