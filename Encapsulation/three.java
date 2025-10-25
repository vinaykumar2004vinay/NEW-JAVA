//Protected
class Animal
{
    protected String name;
    protected void makeSound()
    {
        System.out.println(name + " Make a Sound");
    }
}

class Dog extends Animal
{
    Dog(String name)
    {
        this.name = name;
    }
    void barks()
    {
        makeSound();
        System.out.println(name + " Barks");
    }
}

public class three
{
    public static void main(String args[])
    {
        Dog obj = new Dog("Buddy");
        obj.barks();
    }
}