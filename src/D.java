import java.util.Scanner;
import java.util.Arrays;
class D
{
    public static void main(String[] args)
    {
        int i,size1,size2;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first array size:");
        size1=obj.nextInt();
        int a1[]=new int[size1];
        System.out.println("enter the first  array elements:");
        for(i=0;i<size1;i++)
        {
            a1[i]=obj.nextInt();
        }
        System.out.println("how many element u want to add in the second array :");
        size2=obj.nextInt();
        int a2[]=Arrays.copyOf(a1,(size1+size2));
        System.out.println("enter those  elements:");
        for(i=size1;i<(size1+size2);i++)
        {
            a2[i]=obj.nextInt();
        }
        System.out.println("the second array elements are:");
        for(i=0;i<size1+size2;i++)
        {
            System.out.print(a2[i]+"   ");
        }
    }
}
