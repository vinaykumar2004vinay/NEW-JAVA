public class Assignment
{
    public static void main(String a[])
    {
        int f = 1;
        System.out.println("f += 3 :  " + (f +=3));      //f=f+3    -->1+3=4          -->                     Output=4
        System.out.println("f -= 2 :  " + (f -=2));      //f=f-2    -->4-2=2          -->                     Output=2
        System.out.println("f *= 4 :  " + (f *=4));      //f=f*4    -->2*4=8          -->                     Output=8
        System.out.println("f /= 3 :  " + (f /=3));      //f=f/3    -->8/3=2          -->                     Output=2
    }
}