import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        System.out.println("enter the array elements:");
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("printed array elements are:");
        for(int b:a)
        {
            System.out.print (b+"   ");
        }
    }
}
