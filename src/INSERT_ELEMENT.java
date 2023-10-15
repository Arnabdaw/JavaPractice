import java.util.Scanner;
class INSERT_ELEMENT
{
    public static void main(String[] args)
    {
        int i,size,pos,num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int a[]=new int[size+1];
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
        System.out.println("\nenter the position where u want to add an element:");
        pos=obj.nextInt();
        if(pos>0 && pos<=a.length)
        {
            System.out.println("enter the element u want to add:");
            num = obj.nextInt();
            for (i = size; i >= pos; i--)
            {
                a[i] = a[i - 1];
            }
            a[pos - 1] = num;
            System.out.println("after inserting, the array is:");
            for(i=0;i<=size;i++)
            {
                System.out.print(a[i]+"   ");
            }
        }
        else
        {
            System.out.println("position is invalid!!!");
        }
    }
}
