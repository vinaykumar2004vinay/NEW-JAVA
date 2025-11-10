class A
{
    public A()
    {
        System.out.println("In A");
    }

    public A(int n)
    {
        System.out.println("In A Int");
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

public class five
{
    public static void main(String args[])
    {
        B obj = new B(5);
    }
}