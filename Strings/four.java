//Comparing Two Strings
class four
{
    public static void main(String a[])
    {
        String First   = "Java Program";
        String Second  = "Java Program";
        String Three   = "python Program";

        boolean result1 = First.equals(Second);
        System.out.println("String First And Second are equal : " + result1);

        boolean result2 = First.equals(Three);
        System.out.println("String First And Three are equal : " + result2);  
    }
}