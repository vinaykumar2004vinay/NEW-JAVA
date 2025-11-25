public class employee
{
    private int eid;
    private String ename;

    public void Setnumber(int number)
    {
        this.eid = number;
    }

    public int getnumber()
    {
        return this.eid;
    }
}

class A
{
    public static void main(String[] args)
    {
        employee obj1 = new employee();
        obj1.Setnumber(101);
        System.out.println(obj1.getnumber());
    }
}

class B
{
    public static void main(String[] args)
    {
        employee obj2 = new employee();
        obj2.Setnumber(102);
        System.out.println(obj2.getnumber());
    }
}