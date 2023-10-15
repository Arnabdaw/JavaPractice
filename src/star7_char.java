import java.util.Scanner;
class star7_char
{
    public static void main(String[] args)
    {
        int i,r;
        char j;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        for(i=1;i<=r;i++)
        {
            for(j='A';j<'A'+i;j++)
            {
                System.out.print(j+"   ");
            }
            System.out.println();
        }
    }
}
