import java.lang.Math;
import java.util.Scanner;
class triangle
{
    public static void main(String[] args)
    {
        double a,b,c,s,area;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the sides of the triangle:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        s= ((a + b + c)/2);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA OF TRIANGL="+area);
    }
}
