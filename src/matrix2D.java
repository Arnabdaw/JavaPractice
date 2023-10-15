import java.util.Scanner;
class matrix2D
{
    public static void main(String[] args)
    {
        int i,j,r,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        System.out.println("enter the number of columns:");
        c=obj.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the array elements:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=obj.nextInt();
            }
            System.out.println();
        }
        System.out.println("MATRIX:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
