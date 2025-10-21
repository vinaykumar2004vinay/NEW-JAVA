//One Dimensional Array
class four
{
    public static void main(String args[])
    {
        int[] arr;           //Declare an array
        arr = new int[5];          //Allocating Memory
        //Initializing the Elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i = 0 ;i<arr.length; i++)
        {
            System.out.println("Element at Index " + i + " : " + arr[i]);
        }
    }
}