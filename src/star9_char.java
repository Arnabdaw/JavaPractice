import java.util.Scanner;
class star9_char
{
    public static void main(String[] args)
    {
        int i,r;
        char j,k='A';
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+"   ");
                k++;
            }
            System.out.println();
        }
    }
}

