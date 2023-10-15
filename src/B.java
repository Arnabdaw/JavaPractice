import java.util.Scanner;
import java.util.Arrays;
class B
{
    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("the array elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+"  ");
        }
        Arrays.sort(a);
        System.out.println("\nIn Ascending Order:");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
