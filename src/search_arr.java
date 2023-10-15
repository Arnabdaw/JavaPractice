import java.util.Scanner;
class search_arr
{
    static int temp;
    public static void main(String[] args)
    {
        int i,size,num;
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
        System.out.println("\nenter the nember:");
        num=obj.nextInt();
        for(i=0;i<size;i++)
        {
            if(num==a[i])
            {
                temp++;
            }
        }
        if(temp>0)
        {
            System.out.println("element found "+temp+" times");
        }
        else
        {
            System.out.println("element not found!!");
        }
    }
}
