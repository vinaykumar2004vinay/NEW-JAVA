class student
{
    int rollno;
    String name;
    void insertRecord(int i,String n)
    {
        rollno = i;
        name = n;
    }
    void displayInformation()
    {
        System.out.println(rollno + " " + name);
    }
}

public class two
{
    public static void main(String args[])
    {
        student obj1 = new student();
        student obj2 = new student();

        obj1.insertRecord(111,"Vinay");
        obj2.insertRecord(222,"Kumar");

        obj1.displayInformation();
        obj2.displayInformation();
    }
}