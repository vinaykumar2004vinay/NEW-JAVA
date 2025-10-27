//Try,Catch,Finally----if try is true
class three
{
    public static void main(String args[])
    {
        try
        {
            int[] myNumbers = {1,2,3,4};
            System.out.println(myNumbers[2]);
        }

        catch(Exception e)
        {
            System.out.println("Something Went Wrong....");
        }

        finally
        {
            System.out.println("The Try Catch is Finished....");
        }
    }
}