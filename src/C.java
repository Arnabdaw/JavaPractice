import java.util.Arrays;
import java.util.Scanner;
class C
{
    public static void main(String[] args)
    {
        int i, size1, size2;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of first array:");
        size1 = obj.nextInt();
        int a1[]=new int[size1];
        System.out.println("enter the  first array elements:");
        for (i = 0; i < size1; i++)
        {
            a1[i]=obj.nextInt();
        }
        System.out.println("enter the size of second array:");
        size2 = obj.nextInt();
        int a2[]=new int[size2];
        System.out.println("enter the  second array elements:");
        for (i = 0; i < size2; i++)
        {
            a2[i]=obj.nextInt();
        }
        System.out.println("the first array elements are:");
        for (i = 0; i < size1; i++)
        {
            System.out.print(a1[i]+"  ");
        }
        System.out.println("\nthe second array elements are:");
        for (i = 0; i < size2; i++)
        {
            System.out.print(a2[i]+"  ");
        }
        boolean b= Arrays.equals(a1,a2);
        System.out.println("\nBoth arrays are equal:"+b);
    }
}
