import java.util.Scanner;
class DELETE_ELEMENT
{
    public static void main(String[] args)
    {
        int i,size,pos;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter data in the array:");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("the array elements are:");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println("\nenter the position u want to delete an element:");
        pos=obj.nextInt();
        if(pos>0 && pos<=size)
        {
            for(i=pos-1;i<size-1;i++)
            {
                a[i]=a[i+1];
            }
            System.out.println("after deleting, the array is:");
            for(i=0;i<size-1;i++)
            {
                System.out.print(a[i]+"   ");
            }
        }
        else
        {
            System.out.println("INVALID POSITION!!!");
        }
    }
}
