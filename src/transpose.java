import java.util.Scanner;
class transpose
{
    public static void main(String[] args)
    {
        int i,r,c,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of row:");
        r=obj.nextInt();
        System.out.println("enter the number of column:");
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
        System.out.println("MATRIX :");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE MATRIX :");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(a[j][i]+"  ");
            }
            System.out.println();
        }
    }
}
