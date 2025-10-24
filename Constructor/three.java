//Constructor overloading
class Student
{
    int id;
    String name;
    int age;

    Student(int i,String n)
    {
        id=i;
        name=n;
    }

    Student(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
}

public class three
{
    public static void main(String args[])
    {
        Student S1 = new Student(101,"vinay");
        Student S2 = new Student(102,"kumar",25);
        S1.display();
        S2.display();
    }
}