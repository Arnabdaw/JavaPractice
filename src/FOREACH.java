class FOREACH
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        System.out.println(a.length);
        for(int b:a)
        {
            System.out.print(b+"  ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
