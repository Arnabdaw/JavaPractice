import java.util.Scanner;
class elseif_ladder
{
    public static void main(String[] args)
    {
        int marks;
        System.out.println("enter marks:");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();
        if(marks>=80)
        {
            System.out.println("TOPPER");
        }
        else if (marks<80 && marks>=60)
        {
            System.out.println("GOOD");
        }
        else
        {
            System.out.println("NEED IMPROVEMENT!!");
        }
    }
}
