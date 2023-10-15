import java.util.Scanner;
class star4
{
    public static void main(String[] args)
    {
        int i,j,k,star=1,space,r;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        space=r-1;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=space;j++)
            {
                System.out.print("   ");
            }
            for(k=1;k<=star;k++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            space--;
            star=star+2;
        }
    }
}