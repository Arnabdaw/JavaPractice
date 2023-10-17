class H
{
    int a=10;
    static int b=20;
    public static void main(String[] args)
    {
        H obj=new H();
        obj.disp();
        H.show();
    }
    static void show()
    {
        System.out.println(b);
    }
    void disp()
    {
        System.out.println(a+"  "+b);
    }
}
