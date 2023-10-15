import java.util.Scanner;
class charprint
{
    public static void main(String[] args)
    {
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any charachter:");
        ch=obj.nextLine().charAt(0);
        System.out.println(ch);
    }
}