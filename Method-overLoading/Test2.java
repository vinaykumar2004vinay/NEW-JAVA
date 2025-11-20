class Test2
{
    public void Wish(Object o)
    {
        System.out.println("object");
    }

    public void Wish(String S)
    {
        System.out.println("String");
    }

    // public void Wish(StringBuffer SB)
    // {
    //     System.out.println("String Buffer");
    // }

    public static void main(String[] args)
    {
        Test2 obj = new Test2();
        obj.Wish(new Object());
        obj.Wish("Good Morning");
        obj.Wish(new StringBuffer("Welcome"));
        obj.Wish(null);
    }
}