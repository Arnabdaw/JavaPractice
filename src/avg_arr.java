import java.util.Scanner;
class avg_arr
{
    static int sum;
    public static void main(String[] args)
    {
        int i,size;
        double avg;
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
        avg=(double)sum/size;
        System.out.println("\nthe sum of all the elements is: "+sum);
        System.out.println("the average of all array element is : "+avg);
    }
}
