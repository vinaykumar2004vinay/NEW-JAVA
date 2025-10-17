class two
{
    public static void main(String args[])
    {
        //Narrowing Casting(Manually) -Converting big type to small type
        double MyDouble = 54.785d;
        int MyInt = (int) MyDouble;             //Manual Casting -->  Double -->Int
        System.out.println(MyDouble);
        System.out.println(MyInt);
    }
}