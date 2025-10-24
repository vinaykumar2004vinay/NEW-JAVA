//MultiLevel Inheritance
class Parent1                               
{
    void fun1()
    {
        System.out.println("Grand Father");
    }
}

class Parent2 extends Parent1
{
    void fun2()
    {
        System.out.println("Father");
    }
}

class Parent3 extends Parent2
{
    void fun3()
    {
        System.out.println("Child");
    }
}

public class two
{
    public static void main(String args[])
    {
        Parent3 obj = new Parent3();
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}