import java.util.Scanner;
class sum_arr
{
    public static void main(String[] args)
    {
        int i,size,sum=0;
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
            sum=sum+a[i];
        }
        System.out.println("\nthe sum of all the elements is: "+sum);
    }
}
