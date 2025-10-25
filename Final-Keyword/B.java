//Final Keyword
class A
{
    final void print()
    {
        System.out.println("This method can't be overridden by any subclass");
    }
}

public class B extends A
{
    void print()
    {
        System.out.pritnln("Compiler Error");
    }
}