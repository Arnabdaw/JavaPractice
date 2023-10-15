import java.util.Scanner;
class leapyear
{
    public static void main(String[] args)
    {
        int y;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the year:");
        y=obj.nextInt();
        if(y%100==0 && y%400==0|| y%100!=0 && y%4==0)
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("NON LEAP YEAR");
        }
    }
}
