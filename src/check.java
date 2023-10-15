import java.util.Scanner;
public class check
{
    public static void main(String[] args)
    {
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any charachter:");
        ch=obj.nextLine().charAt(0);
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("constant");
        }
    }
}
