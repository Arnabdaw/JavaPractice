import java.util.Scanner;
class convert
{
    public static void main(String[] args)
    {
        char ch,ch1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any character:");
        ch=obj.nextLine().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            ch1=Character.toLowerCase(ch);
            System.out.println("LOWERCASE:"+ch1);
        }
        else
        {
            ch1=Character.toUpperCase(ch);
            System.out.println("UPPERCASE:"+ch1);
        }
    }
}
