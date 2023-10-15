import java.util.Scanner;
class reverse_arr
{
    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the arrray:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("the reverse order of the array element are:");
        for(i=size-1;i>=0;i--)
        {
            System.out.print(a[i]+"   ");
        }
    }
}
