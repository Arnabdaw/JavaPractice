import java.util.Scanner;
class ifelse
{
    public static void main(String[] args)
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        n=obj.nextInt();
        if(n>=0)
        {
            System.out.println("+ve NUMBER!!");
        }
        else
        {
            System.out.println("-ve NUMBER!!");
        }
    }
}
