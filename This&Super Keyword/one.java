class A
{ 
    
}

class B extends A
{
    public B()
    {
        System.out.println("In B");
    }
}

public class one
{
    public static void main(String args[])
    {
        B obj = new B();
    }
}