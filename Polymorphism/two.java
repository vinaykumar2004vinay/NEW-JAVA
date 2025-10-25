//Method overriding
class Animal
{
    void display()
    {
        System.out.println("I Am Animal");
    }
}

class Dog extends Animal
{
    void display()
    {
        super.display();
        System.out.println("I Am Dog");
    }
}

public class two
{
    public static void main(String args[])
    {
        Dog obj = new Dog();
        obj.display();
    }
}