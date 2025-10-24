//Single Inheritance
class Parent
{
    public void vinay()
    {
        System.out.println("Java");
    }
}

class Child extends Parent
{
    public void kumar()
    {
        System.out.println("Program");
    }
}

public class one
{
    public static void main(String args[])
    {
            Child obj = new Child();
            obj.vinay();
            obj.kumar();
    }
}










// //Single Inheritance
// class Parent
// {
//     void vinay()
//     {
//         System.out.println("Java");
//     }
// }

// class Child extends Parent
// {
//     void kumar()
//     {
//         System.out.println("Program");
//     }
// }

// public class one
// {
//     public static void main(String args[])
//     {
//             Child obj = new Child();
//             obj.vinay();
//             obj.kumar();
//     }
// }