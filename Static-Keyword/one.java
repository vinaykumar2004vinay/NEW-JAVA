//Static Keyword
class Counter
{
    static int count = 0;       //static variable
    static void increment()     //static method
    {
        count++;
    }
}

public class one
{
    public static void main(String args[])
    {
        Counter.increment();                     //Static method
        System.out.println(Counter.count);      

        Counter.increment();                     //Static variable
        System.out.println(Counter.count);       
    }
}