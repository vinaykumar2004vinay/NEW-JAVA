class one
{
    int instanceVar = 10;
    static int staticVar = 20;
    public static void main(String args[])
    {
        int localVar = 30;
        System.out.println("Local Variable : " + localVar);
        one obj = new one();
        System.out.println("Instance Variable : " + obj.instanceVar);
        System.out.println("Static Variable : " + obj.staticVar);
    }
}