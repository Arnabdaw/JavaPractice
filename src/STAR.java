import java.util.Scanner;
class STAR
{
    public static void main(String[] args)
    {
        int i,j,r,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        r=obj.nextInt();
        System.out.println("enter the number of columns: ");
        c=obj.nextInt();
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
