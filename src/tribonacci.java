import java.util.Scanner;
class tribonacci
{
    public static void main(String[] args)
    {
        int i, term, a = 0, b = 1, c = 2, d;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of terms:");
        term = obj.nextInt();
        for (i = 1; i <= term; i++)
        {
            System.out.print(a+"    ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}
