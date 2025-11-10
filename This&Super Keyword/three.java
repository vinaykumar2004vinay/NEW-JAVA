class A
{
    public A()
    {
        System.out.println("In A");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("In B");
    }
}

public class three
{
    public static void main(String args[])
    {
        A obj = new A();
    }
}