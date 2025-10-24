//Hierarchical Inheritance
class A
{
    void printA()
    {
        System.out.println("CLASS-A");
    }
}

class B extends A
{
    void printB()
    {
        System.out.println("CLASS-B");
    }
}

class C extends A
{
    void printC()
    {
        System.out.println("CLASS-C");
    }
}

class D extends A
{
    void printD()
    {
        System.out.println("CLASS-D");
    }
}

public class three
{
    public static void main(String args[])
    {
        B obj1=new B();
        obj1.printA();
        obj1.printB();

        C obj2=new C();
        obj2.printA();
        obj2.printC();

        D obj3=new D();
        obj3.printA();
        obj3.printD();
    }
}