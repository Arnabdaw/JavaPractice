import java.util.Scanner;
class copy_arr
{
    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the first array:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the elements in the first array:");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        int b[]=new int[size];
        System.out.println("the second array elements are:");
        for(i=0;i<size;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+"  ");
        }
    }
}
