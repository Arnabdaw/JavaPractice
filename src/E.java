import java.util.Scanner;
class E
{
    public static void main(String[] args)
    {
        int i,j,size,max;
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
            System.out.print(a[i]+"   ");
        }
        max=a[0];
        for(i=1;i<size;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("\nthe largest element in the array is: "+max);
    }
}
