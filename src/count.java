import java.util.Scanner;
class count
{
    public static void main(String[] args)
    {
        int i,n,count=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        i=n;
        while (i>0)
        {
            i=i/10;
            count++;
        }
        System.out.println("NUMBER OF DIGITS IN "+n+" is "+count);
    }
}
