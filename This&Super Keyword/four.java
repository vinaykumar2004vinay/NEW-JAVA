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

    public B(int n)
    {
        System.out.println("In B Int");
    }
}

public class four
{
    public static void main(String args[])
    {
        B obj = new B(5);
    }
}