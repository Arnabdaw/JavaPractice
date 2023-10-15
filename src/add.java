import java.util.Scanner;
class add
{
        public static void main(String[] args)
        {
            int a, b, SUM,MULTIPLICATION,subtraction;
            Scanner t = new Scanner(System.in);
            System.out.println("enter the first number:");
            a = t.nextInt();
            System.out.println("enter the second number:");
            b = t.nextInt();
            System.out.println("SUM=" + (a + b));
            System.out.println("MULTIPLICATION="+(a*b));
            System.out.println("subtraction="+(a-b));
        }
}
