class Object
{
    public boolean equals(Object obj)
    {
        return (this==obj);
    }
}
//can be compiled succesfully
//// equals() method and == is the same for the object class
///
////* but if we talk about string
///which indriectly extends object class
///stringg have many method
///but what it didi was override
///same name mehtod
///diff class
///is relation ship , one class exttend other one
///argu same type saame, no of argu same, sequence same
/*
class String2 extends Object
{   @Override
    public boolean equals(Object obj)
    {
        //statements
        //hear equals method is checking content instead of checking address refrence commpariosns
        //object ke content check karega
        return something;
    }
}


public boolean equals(Object obj)
    {
        return (this==obj);
    }
