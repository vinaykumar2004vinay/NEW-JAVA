//Two Dimensional Array
class five
{
    public static void main(String args[])
    {
        int[][] arr = new int[3][3];
        System.out.println("Rows : " + arr.length);
        System.out.println("Coloumns : " + arr.length);
        int arrr[][] = {{2,7,9} , {3,6,1} , {7,4,2}};
        for(int i=0 ; i<3 ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println();
        } 
    }
}