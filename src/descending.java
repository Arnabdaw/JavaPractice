import java.util.Scanner;
class descending
{
    public static void main(String[] args)
    {
        int i,j,size,temp;
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
            System.out.print(a[i]+"  ");
        }
        for(i=0;i<size-1;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nIn descending Order:");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
