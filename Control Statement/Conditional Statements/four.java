//NestedIf Statements
public class four
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        if(a == 10)      //Outer If Condition
        {
            if(b == 220)     //Inner If Condition
            {
                System.out.println("I Am True");
            }
            else               
            {
                System.out.println("I Am False");
            }
        }
        else
        {
            System.out.println("I Am Out");
        }
    }
}