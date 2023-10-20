import java.util.Scanner;
class AAA
{
    int a;
    String name;
    boolean b;
    Scanner ref= new Scanner(System.in);
    AAA()
    {
        System.out.println("enter a number:");
        a=ref.nextInt();
        System.out.println("enter a name:");
        name=ref.next();
        System.out.println("type: true or false");
        b=ref.nextBoolean();
    }
    void show()
    {
        System.out.println(a+"   "+name+"   "+b);
    }
}
class con1
{
    public static void main(String[] args)
    {
        AAA obj=new AAA();
        obj.show();
    }
}
