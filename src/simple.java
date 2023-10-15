import java.util.Scanner;
class simple
{
    public static void main(String[] args)
    {
        int age;
        System.out.println("ENTER YOUR AGE");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();
        if (age >= 18)
        {
            System.out.println("ELIGIBLE FOR VOTE");
        }
        System.out.println("THANK U");
    }
}
