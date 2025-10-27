//throws
public class five
{
  public static void  DivideByZero() throws ArithmeticException
  {
    int result = 10/0;
    System.out.println("Result :" + result);
  }

  public static void main(String []args)
  {
    try
    {
      DivideByZero();
    }
    catch(ArithmeticException e)
    {
      System.out.println("Error :" + e.getMessage());
    }
  }
}