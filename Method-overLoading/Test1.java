class Test1
{
    public void Wish(String S)
    {
        System.out.println("String");
    }

    public void Wish(StringBuffer SB)
    {
        System.out.println("String Buffer");
    }

    public static void main(String[] args)
    {
        Test1 obj = new Test1();
        obj.Wish("Good Morning");
        obj.Wish(new StringBuffer("Welcome"));
    }
}