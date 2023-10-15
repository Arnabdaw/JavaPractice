import java.util.Scanner;
class matrix_addition
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
        int b[][]=new int[r][c];
        int d[][]=new int[r][c];
        System.out.println("enter the first array elements:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=obj.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter the second array elements:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=obj.nextInt();
            }
            System.out.println();
        }
        System.out.println("MATRIX 1:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("MATRIX 2:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(b[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("ADDITION MATRIX:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                d[i][j]=(a[i][j]+b[i][j]);
                System.out.print(d[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
