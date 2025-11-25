public class employee2
{
    private int eid;
    private String ename;

    public void Setnumber(int number)
    {
        this.eid = number;
    }

    public void Setname(String name)
    {
        this.ename = name;
    }

    public int getnumber()
    {
        return this.eid;
    }

    public String getname()
    {
        return this.ename;
    }
}

class A
{
    public static void main(String[] args)
    {
        employee2 obj1 = new employee2();
        obj1.Setnumber(101);
        obj1.Setname("Rahul");
        System.out.println(obj1.getnumber() + "-" + obj1.getname());
    }
}

class B
{
    public static void main(String[] args)
    {
        employee2 obj2 = new employee2();
        obj2.Setnumber(102);
        obj2.Setname("Modi");
        System.out.println(obj2.getnumber() + "-" + obj2.getname());
    }
}