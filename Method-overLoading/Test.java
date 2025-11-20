class Test
{
    void M1()
    {
        System.out.println("M1-Method & Zero arguments");
    }

    void M1(int i)
    {
        System.out.println("M1-Method & int arguments");
    }

    void M1(float f)
    {
        System.out.println("M1-Method & float arguments");
    }

    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.M1();
        obj.M1(10);
        obj.M1(20.5f);
    }
}