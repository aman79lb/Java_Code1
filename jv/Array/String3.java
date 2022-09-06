
public class String3
{
//learnilng about constructoers    //construcots same namme as the class anme and no return tuype no evern null or void
    //cosnturctors outside of the mmain mehtod
    //
    //constructors porvided by the string class

    public String3()
    {

    }

    //many more method and the constructoes and the methods
    //

    public String3 (String s) {  } // here s(we passed ) string literl has been passed
    public String3(StringBuffer sb) { }
    public String3(StringBuilder sb2) { }

    public static void main(String[] args)
    {
        String s1="deepak";
        String s2= new String("abc");
        String s3=new String();  //no argument constructor creates empty object
        System.out.println(s3); //empty space print thayi
        System.out.println(s3.length());


        String s4=new String("deepak");


        StringBuffer sb1=new StringBuffer("gnome");
        String s5=new String(sb1);
        System.out.println(sb1);

        //stringBuilder and StringBuffer create mutable objects
        //but we will pass them in string constructors so they will
        //cecome immutable objects
        //

        byte[] bty= {101,102,103};
        String s6=new String(bty);
        System.out.println(s6);
        // here we ca evern pass byte array variale
        // it will take nums as asci value num and print charcters

        char[] c= {'w','r','f','s','c','r'};
        String s7=new String(c);
        System.out.println(s7);
        // here we passed the char array variable





    }
}