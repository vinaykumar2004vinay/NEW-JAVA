//Parameterized COnstructor
class Student
{
    int id;
    String name;
    Student(int i,String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}

public class two
{
    public static void main(String args[])
    {
        Student S1 = new Student(101,"Vinay");
        Student S2 = new Student(102,"Kumar");
        S1.display();
        S2.display();
    }
}