
public class String6
{

    public static void main(String[] args)
    {
        String s1="deepak";
        String s2=new String("abc");
        String s3="";

        System.out.println(s2.length());
        System.out.println(s3.length());

        String s5 = new String("gnome");

        StringBuffer sb = new StringBuffer("KDE");
        String s6 = new String(sb);
        System.out.println(s6);
        //stringbuffer and steing builder creates mutable objects
        //then we pass theie rrefrence to string to make immmuyable objects in string consturctors

        StringBuilder sbd = new StringBuilder("screen");
        String s7 = new String(sbd);
        System.out.println(s7);

        byte[] b = {101,102,103,104};
        String s8 = new String(b);
        System.out.println(s8);
        //byte values taken as asci value and printed charcaters(symbols)
        // byte conberteyd into charactes
        // we can pass byte array in th string vharcater
        // it didnt do the sum of value o concate values

        char[] ch= {'a','c','g','3','g','%','@',' ','t',' ','#','y'};
        String s9 = new String(ch);
        System.out.println(s9);
        // in string constructors we cn evern pass char array pass

        //these are ain 6 constructors

        /*string objects are immutable in java and therfore if a passaword is strord as
        plain t3ext it will be available in memeory until garbage collector clears it,but
        String objects are stored in String Literal pool for re-usability and garbage
        collectio is not applicable in SCP, which is a security threat.
        with an arry, you can explicitly wipe the data after you're done with it.you can
        overwrite the array with anything you like, and the passwored won't be present
        anywhere in theh system,eenbefore garbage collection.
        */

        // when you set password
        // char
        char[] Pwd_ch1=new char[] {'a','b','c'};

        //string
        String Pwd_s9 = new String("abc");

        System.out.println("ch1:-"+Pwd_ch1); //object print karave 6w
        System.out.println("s9 :-"+Pwd_s9);  //object value print karavese          


        String s10 = new String(Pwd_ch1);
        System.out.println("this is very char array is passed in string = "+s10);

        //to do not directly print object value we use char instead of string
        //// but in deep conspt of password stroing we an use encryption and decyption
        ///
         //why char array is better than string to store objects
         //ans : stirng objects are immutable 
         //means if we rearte stinrg object create and instiate String Pwd_s9 = new String("abc");
         ////then it will ctete 2 objects one in heap and second in SCP
         /////here SCP object is not applicable for grabage collectiron
         ///// so anyone can retrieve and print object value to (see hack)the password



    }
}
