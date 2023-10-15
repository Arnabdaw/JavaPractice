import java.util.Scanner;
class star10
{
    public static void main(String[] args)
    {
        int i,j,star,r;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the row number(odd)");
        r=obj.nextInt();
        star=r/2+1;
        if(r%2==0)
        {
            System.out.println("half diamond pattern can't be printed!!!");
        }
        else
        {
            for(i=1;i<=r;i++)
            {
                if(i<=r/2)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                else
                {
                    for(j=1;j<=star;j++)
                    {
                        System.out.print(" * ");
                    }
                    star--;
                    System.out.println();
                }
            }
        }
    }
}

