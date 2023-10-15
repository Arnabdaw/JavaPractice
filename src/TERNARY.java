import java.util.Scanner;
class TERNARY
{
    public static void main(String[] args)
    {
        int a, b,c, max;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        a = obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        b = obj.nextInt();
        System.out.println("ENTER THE THIRD NUMBER:");
        c=obj.nextInt();
        max = (a > b) ? (a>c?a:c):(b>c?b:c);
        System.out.println("MAX="+max);
    }
}
