
abstract class Animal {
    abstract public void walk();
}

class Horse extends Animal {
    public void walk()
    {
        System.out.println("walks on 4 lags");

    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs ");
          
    }
}
public class Animal3
{

    // Constructor
    public Animal3()
    {
        System.out.println("hello brother");

    }

    public static void main(String args[])
    {
        Animal3 s=new Animal3();
        Horse horse =  new Horse();
        horse.walk();

        Animal animal=new Animal();
        animal.walk();
         

    }
       


}