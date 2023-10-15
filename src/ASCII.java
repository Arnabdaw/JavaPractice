import java.util.Scanner;
class ASCII
{
    public static void main(String[] args)
    {
        int a;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any charachter:");
        ch=obj.nextLine().charAt(0);
        a=ch;
        System.out.println("ASCII VALUE OF "+ch+" is "+a);
    }
}

