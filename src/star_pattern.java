import java.util.Scanner;
class star_pattern
{
    public static void main(String[] args)
    {
        int i, j, r, k = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r = obj.nextInt();
        for (i = 0; i < r; i++)
        {
            for (j = 0; j <= i; j++)
            {
                System.out.print(k+"     ");
            }
            k++;
            System.out.println();
        }
    }
}

