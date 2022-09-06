import java.util.ArrayList;
import java.util.Scanner;

 class Friends
{

     String name;
     int age;    

    Friends(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
/*
    public void setName( String friendsName )
    {
        name = friendsName;
    } 
    public void setAge( int friendsAge )
    {
        age = friendsAge;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }*/


    public static void main( String[] args )
    {
        int menu;       
        int choice;
        choice = 0;      

        Scanner input = new Scanner(System.in);
        ArrayList< Friends > friendsList = new ArrayList<  >();       

        System.out.println(" 1. Add a Friend ");
        System.out.println(" 2. Remove a Friend ");
        System.out.println(" 3. Display All Friends ");
        System.out.println(" 4. Exit ");
        menu = input.nextInt();

        while(menu != 4)
        {    

            switch(menu)
            {                     

            case 1:

                while(choice != 2)
                {
                    System.out.println("Enter Friend's Name: ");
                    String friendsName = input.next();
                    System.out.println("Enter Friend's Age: ");
                    int friendsAge = input.nextInt();                               
                    Friends f = new Friends(friendsName, friendsAge);
                    friendsList.add(f);
                    System.out.println("Enter another? 1: Yes, 2: No");
                    choice = input.nextInt();
                } break;

            case 2:

                System.out.println("Enter Friend's Name to Remove: ");
                friendsList.remove(input.next());                   
                break;   

            case 3:

                for(int i = 0; i < friendsList.size(); i++)
                {
                    System.out.println(friendsList.get(i).name + " " + friendsList.get(i).age);                        
                } break;                
        }

        System.out.println(" 1. Add a Friend ");
        System.out.println(" 2. Remove a Friend ");
        System.out.println(" 3. Display All Friends ");
        System.out.println(" 4. Exit ");
        menu = input.nextInt();

    }

    System.out.println("Thank you and goodbye!");

}

}