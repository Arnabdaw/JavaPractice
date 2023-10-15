import java.util.Scanner;
class do_while
{
    public static void main(String[] args)
    {
        int n, i = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("how many times u want to repeat:");
        n = obj.nextInt();
        do
        {
            System.out.println("ARNAB");
            i++;
        }
        while (i <= n);
    }
}


