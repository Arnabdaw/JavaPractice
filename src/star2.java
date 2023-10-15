import java.util.Scanner;
class star2
{
    public static void main(String[] args)
    {
        int i,j,k,star,space=0,r;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        star=r;
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
            star--;
            space++;
        }
    }
}
