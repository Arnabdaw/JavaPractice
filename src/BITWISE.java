import java.util.Scanner;
class BITWISE
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        a=obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        b=obj.nextInt();
        System.out.println("AND="+(a&b));
        System.out.println("OR="+(a|b));
        System.out.println("XOR="+(a^b));
        System.out.println("COMPLEMENT="+(~a));
    }
}
